package reservation.dao;

import java.util.Map;



import reservation.exception.DuplicateException;
import reservation.exception.NotFoundException;
import reservation.vo.Admin;

/**
 * AdminDaoIf interface
 * @author 오진오
 *
 */
public interface AdminDaoIf {
	
	
	/**
	 * 관리자 정보 한건 입력
	 * @param map
	 * @return
	 * @throws DecodeException
	 */
	int insert(Map<String, Object> map) throws DuplicateException;
	
	/**
	 * 관리자 정보 한건 수정
	 * @param map
	 * @return
	 * @throws NotFoundException
	 */
	int update(Map<String, Object> map) throws NotFoundException;
	
	
	/**
	 * 관리자 정보 한건 삭제
	 * @param admin
	 * @return
	 * @throws NotFoundException
	 */
	int delete(Admin admin) throws NotFoundException;

	
	boolean login(Admin admin);
	
	
	
}
