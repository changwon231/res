package reservation.mapper;

import java.util.List;
import java.util.Map;

import reservation.vo.Customer;

public interface CustomerMapper {
	
	List<Customer> select(Customer customer);
	
	int insert(Map<String, Object> map);
	
	int update(Map<String, Object> map);
	
	Integer login(Customer customer);
	
	
}
