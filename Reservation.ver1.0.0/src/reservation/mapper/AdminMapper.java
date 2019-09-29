package reservation.mapper;

import java.util.Map;

import reservation.vo.Admin;

/**
 * AdminMapper interface
 * @author 오진오
 *
 */
public interface AdminMapper {

	int insert(Map<String, Object> map);
	
	int update(Map<String, Object> map);
	
	int delete(Admin admin);
	
	Integer isExists(Admin admin);
	
	Integer login(Admin admin);
}
