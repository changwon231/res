package reservation.dao;

import java.util.List;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import reservation.mapper.CustomerMapper;
import reservation.vo.Customer;
import static reservation.mybatis.MybatisClient.getFactory;

public class CustomerDaoImpl implements CustomerDaoIf {

	private SqlSessionFactory factory;
	
	public CustomerDaoImpl() {
		// MybatisClient 클래스 안에 잇는 static 메소드이므로
		// static import 로 사용한다.
		factory = getFactory();
	}
	
	@Override
	public List<Customer> select(Customer customer) {
		List<Customer> customers = null;
		
		SqlSession session= factory.openSession();
		try {
			// 1. 매퍼 인터페이스 객체 세션으로부터 얻기
			CustomerMapper mapper = session.getMapper(CustomerMapper.class);
			
			// 2. 얻어진 매퍼 인터페이스 객체에 메소드 호출하여
			//	     쿼리 조회 결과 얻기
			customers = mapper.select(customer);
			
		} finally {
			session.close();
		}
		
		return customers;
	}

	@Override
	public int insert(Map<String, Object> map) {
		// 1. 리턴할 인서트 성공 카운트 변수
		int addCnt = -1;
		// 2. auto-commit 옵션으로 열린 SqlSession 을 통해서
		// 	  insert 수정
		SqlSession session = factory.openSession(true);
		
		// 3. Mapper 인터페이스 객체 얻어냄
		CustomerMapper mapper = session.getMapper(CustomerMapper.class);
		
		try {
			addCnt = mapper.insert(map);
			
		} finally {
			session.close();
		}
		
		return addCnt;
	}

	@Override
	public int update(Map<String, Object> map) {
		// 1. 수정하려는 데이터가 존재하는지 검사
		
		// 2. 수정 결과 카운트 변수
		int updateCnt = -1;
		
		// 3. SqlSession 얻기
		SqlSession session = factory.openSession(true);
		
		// 4. 매퍼 인터페이스 객체 얻기
		CustomerMapper mapper = session.getMapper(CustomerMapper.class);
		
		// 5. 쿼리 실행
		try {
			updateCnt = mapper.update(map);
			
		} finally {
			session.close();
		}
		
		return updateCnt;
	}

	@Override
	public boolean login(Customer customer) {
		// 리턴에 사용할 로그인 성공 여부 변수
		boolean success = false;
		
		// SqlSession 얻기
		SqlSession session = factory.openSession();
		
		// ManagerMapper 인터페이스 객체 얻기
		CustomerMapper mapper = session.getMapper(CustomerMapper.class);
		
		// 얻어진 매퍼 객체에 메소드 호출하여 로그인 처리
		try {
			Integer customerSeq = mapper.login(customer);
			if (customerSeq != null) {
				success = true;
			}
			
			mapper.login(customer);
			
		} finally {
			session.close();
		}
		
		return success;
	}
}
