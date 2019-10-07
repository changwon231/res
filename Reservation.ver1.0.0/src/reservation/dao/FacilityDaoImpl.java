package reservation.dao;

import static reservation.mybatis.MybatisClient.getFactory;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import reservation.exception.DuplicateException;
import reservation.exception.NotFoundException;
import reservation.exception.NotFoundException;
import reservation.mapper.FacilityMapper;
import reservation.vo.Facility;

public class FacilityDaoImpl implements FacilityDaoIf {

	private SqlSessionFactory factory;
	
	public FacilityDaoImpl() {
		super();
		factory = getFactory();
		
	}

	@Override
	public List<Facility> select(Facility facility) {
		// 전체 목록이 담길 리스트 변수 선언
		List<Facility> facilities = null;

		SqlSession session = factory.openSession();

		try {
			FacilityMapper mapper = session.getMapper(FacilityMapper.class);

			facilities = mapper.select(facility);

		} finally {
			session.close();
		}
		return facilities;
	}

	@Override
	public List<Facility> searchFacility(Facility facility) {
		// 전체 목록이 담길 리스트 변수 선언
		List<Facility> facilities = null;

		SqlSession session = factory.openSession();

		try {
			FacilityMapper mapper = session.getMapper(FacilityMapper.class);

			facilities = mapper.searchFacility(facility);

		} finally {
			session.close();
		}
		return facilities;
	}
	
	
	@Override
	public int insert(Map<String, Object> map) throws DuplicateException {
		int addCnt = -1;
		
		// 2. aoto-commit 옵션으로 열린 SqlSession 을 통해서 
		//    insert 수행
		SqlSession session = factory.openSession(true);
		
		// 3. Mapper 인터페이스 객체 얻어냄
		FacilityMapper mapper = session.getMapper(FacilityMapper.class);
		
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
		int facSeq = (Integer) map.get("FacSeq");

		if (!isExists(facSeq)) {
			Facility facilities = new Facility();
			facilities.setFacSeq(facSeq);

			throw new NotFoundException("update", facilities);
		}

		// 2. 수정 결과 카운트 변수
		int updateCnt = -1;

		// 3. Sqlsession 얻기
		SqlSession session = factory.openSession(true);

		// 4. 매퍼 인터페이스 객체 얻기
		FacilityMapper mapper = session.getMapper(FacilityMapper.class);

		// 5. 쿼리 실행
		try {
			updateCnt = mapper.update(map);
		} finally {
			session.close();
		}

		return updateCnt;
	}

	@Override
	public int delete(Facility facility) throws NotFoundException {
		// 1. 삭제하려는 데이터가 존재하는지 검사
		if (!isExists(facility.getFacSeq())) {
			throw new NotFoundException("delete", facility);

		}

		// 2. 수정 결과 카운트 변수
		int deleteCnt = -1;

		// 3. Sqlsession 얻기
		SqlSession session = factory.openSession(true);

		// 4. 매퍼 인터페이스 객체 얻기
		FacilityMapper mapper = session.getMapper(FacilityMapper.class);

		// 5. 쿼리 실행
		try {
			deleteCnt = mapper.delete(facility);
		} finally {
			session.close();
		}
		return deleteCnt;
	}


	private boolean isExists(int facSeq) {

		boolean exists = false;

		// 1. SqlSession 얻기
		SqlSession session = factory.openSession();

		// 2. 매퍼 인터페이스 객체 얻기
		FacilityMapper mapper = session.getMapper(FacilityMapper.class);

		// 3. 쿼리 실행
		try {
			Facility facility = new Facility();
			facility.setFacSeq(facSeq);

			Integer seq = mapper.isExists(facility);
			if (seq != null) {
				// seq가 null이 아니라는 것은 조회된 시설 정보가 존재한다는 것
				exists = true;
			}

		} finally {
			session.close();
		}
		return exists;
	}

	@Override
	public List<Facility> selectBuildingCd(Facility facility) {
		// 전체 목록이 담길 리스트 변수 선언
		List<Facility> facilities = null;

		SqlSession session = factory.openSession();

		try {
			FacilityMapper mapper = session.getMapper(FacilityMapper.class);

			facilities = mapper.selectBuildingCd(facility);

		} finally {
			session.close();
		}
		return facilities;
	}
	


}
