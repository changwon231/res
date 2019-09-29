package reservation.dao;

import static reservation.mybatis.MybatisClient.getFactory;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import reservation.mapper.CodeMapper;
import reservation.vo.Code;

public class CodeDaoImpl implements CodeDaoIf {

	private SqlSessionFactory factory;
	
	public CodeDaoImpl() {
		super();
		factory = getFactory();
	}
	
	@Override
	public List<Code> selectReservation() {
		//조회된 코드 목록 담길 목록 선언
		List<Code> codes = null;
		
		// SqlSession 얻기
		SqlSession session = factory.openSession();
		
		// CodeMapper 인터페이스 객체 얻기
		CodeMapper mapper = session.getMapper(CodeMapper.class);
		
		// 얻어진 매퍼 객체에 메소드 수행
		try {
			codes = mapper.selectReservation();
			
		} finally {
			session.close();
		}
		
		// 조회된 목록 리턴
		return codes;
	}

	@Override
	public List<Code> selectFacility() {
		//조회된 코드 목록 담길 목록 선언
		List<Code> codes = null;
		
		// SqlSession 얻기
		SqlSession session = factory.openSession();
		
		// CodeMapper 인터페이스 객체 얻기
		CodeMapper mapper = session.getMapper(CodeMapper.class);
		
		// 얻어진 매퍼 객체에 메소드 수행
		try {
			codes = mapper.selectFacility();
			
		} finally {
			session.close();
		}
		
		// 조회된 목록 리턴
		return codes;
	}

	@Override
	public List<Code> selectPlace() {
		//조회된 코드 목록 담길 목록 선언
		List<Code> codes = null;
		
		// SqlSession 얻기
		SqlSession session = factory.openSession();
		
		// CodeMapper 인터페이스 객체 얻기
		CodeMapper mapper = session.getMapper(CodeMapper.class);
		
		// 얻어진 매퍼 객체에 메소드 수행
		try {
			codes = mapper.selectPlace();
			
		} finally {
			session.close();
		}
		
		// 조회된 목록 리턴
		return codes;
	}

	@Override
	public List<Code> selectLimit() {
		//조회된 코드 목록 담길 목록 선언
		List<Code> codes = null;
		
		// SqlSession 얻기
		SqlSession session = factory.openSession();
		
		// CodeMapper 인터페이스 객체 얻기
		CodeMapper mapper = session.getMapper(CodeMapper.class);
		
		// 얻어진 매퍼 객체에 메소드 수행
		try {
			codes = mapper.selectLimit();
			
		} finally {
			session.close();
		}
		
		// 조회된 목록 리턴
		return codes;
	}

}
