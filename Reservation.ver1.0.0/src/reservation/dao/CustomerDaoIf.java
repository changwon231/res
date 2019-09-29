package reservation.dao;

import java.util.List;
import java.util.Map;

import reservation.vo.Customer;

public interface CustomerDaoIf {

	/**
	 * customer 목록 조회
	 * @param customer
	 * @return
	 */
	List<Customer> select(Customer customer);
	
	/**
	 * 정보 삽입
	 * @param map
	 * @return
	 */
	int insert(Map<String, Object> map);
	
	/**
	 * 정보 수정
	 * @param map
	 * @return
	 */
	int update(Map<String, Object> map);
	
	/**
	 * 로그인 여부
	 * @param customer
	 * @return
	 */
	boolean login(Customer customer);

}
