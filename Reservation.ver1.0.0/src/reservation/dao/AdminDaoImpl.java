package reservation.dao;

import static reservation.mybatis.MybatisClient.getFactory;

import java.util.Map;



import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import reservation.exception.DuplicateException;
import reservation.exception.NotFoundException;
import reservation.mapper.AdminMapper;
import reservation.vo.Admin;

/**
 * AdminDaoImpl java
 * 
 * @author 오진오
 *
 */
public class AdminDaoImpl implements AdminDaoIf {

	/**
	 * 마이바티즈 DB 연결을 위하여 사용하는 SqlSession 변수
	 * 
	 */
	private SqlSessionFactory factory;

	public AdminDaoImpl() {
		super();

		factory = getFactory();
	}

	@Override
	public int insert(Map<String, Object> map) throws DuplicateException {
		// 1. 리턴할 인서트 성공 카운트 변수
		int addCnt = -1;

		// 2. auto-commit 옵션으로 열린 SqlSession 을 통해서
		// insert 수행
		SqlSession session = factory.openSession(true);

		// 3. Mapper 인터페이스 객체 얻어냄
		AdminMapper mapper = session.getMapper(AdminMapper.class);

		try {
			addCnt = mapper.insert(map);
		} finally {
			session.close();
		}
		return addCnt;
	}

	@Override
	public int update(Map<String, Object> map) throws NotFoundException {
		// 1. 수정하려는 데이터가 존재하는지 검사
		int adminSeq = ((Integer) map.get("adminSeq"));

		if (!isExists(adminSeq)) {
			Admin admin = new Admin();
			admin.setAdminSeq(adminSeq);

			throw new NotFoundException("update", admin);
		}

		// 2. 수정 결과 카운트 변수
		int updateCnt = -1;

		// 3. SqlSession 얻기
		SqlSession session = factory.openSession(true);

		// 4. 메퍼 인터페이스 객체 얻기
		AdminMapper mapper = session.getMapper(AdminMapper.class);

		// 5. 쿼리 실행
		try {
			updateCnt = mapper.update(map);
		} finally {
			session.close();
		}
		return updateCnt;
	}

	@Override
	public int delete(Admin admin) throws NotFoundException {
		// 1. 삭제하려는 데이터가 존재하는지 검사
		
		if (!isExists(admin.getAdminSeq())) {
			
			throw new NotFoundException("update", admin);
		}
		
		// 2. 수정결과 카운트 변수
			int deleteCnt = -1;
			
		// 3. SqlSession 얻기
			SqlSession session = factory.openSession(true);
			
		// 4. 메퍼 인터페이스 객체 얻기
			AdminMapper mapper = session.getMapper(AdminMapper.class);
			
		// 5. 쿼리 실행	
			try {
				deleteCnt = mapper.delete(admin);
			} finally {
				session.close();
			}
		return deleteCnt;
	}
		
	/**
	 * 입력 된 관리자 일련번호에 해당하는 데이터가 존재하는 지 확인
	 * 
	 * @param adminSeq
	 * @return
	 */
	private boolean isExists(int adminSeq) {
		boolean exists = false;
		
		// 1. sqlSession 얻기
				SqlSession session = factory.openSession();

				// 2. 매퍼 인터페이스 객체 얻기
				AdminMapper mapper = session.getMapper(AdminMapper.class);

				// 3. 쿼리 실행
				try {
					Admin admin = new Admin();
					admin.setAdminSeq(adminSeq);
					Integer seq = mapper.isExists(admin);
					if (seq != null) {
						// 검색 된 책의 일련번호가 0보다 크면 존재한다는 뜻
						exists = true;
					}
				} finally {
					session.close();
				}
				return exists;
	}

	public boolean login(Admin admin) {
		// 리턴에 사용할 로그인 성공 여부 변수
		boolean success = false;
		
		// SqlSession 얻기
		SqlSession session = factory.openSession();
		
		// ManagerMapper 인터페이스 객체 얻기
		AdminMapper mapper = session.getMapper(AdminMapper.class);
		
		// 얻어진 매퍼 객체에 메소드 호출하여 로그인 처리
		try {
			Integer managerSeq = mapper.login(admin);
			if (managerSeq != null) {
				success = true;
			}
		} finally {
			session.close();
		}
		
		return success;
	}
}
