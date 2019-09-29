package reservation.dao;

import java.util.List;
import java.util.Map;

import reservation.exception.DuplicateException;
import reservation.exception.NotFoundException;
import reservation.vo.Facility;

public interface FacilityDaoIf {
	
	
	
	

	/**
	 * 시설 목록 조회
	 */
	List<Facility> select(Facility facility);

	/**
	 * 시설 정보 1건 삽입
	 */
	int insert(Map<String, Object> map) throws DuplicateException;
	
	/**
	 * 시설 정보 1건 수정
	 */
	int update(Map<String, Object> map)	throws NotFoundException;
	
	/**
	 * 시설 정보 1건 삭제
	 * @param facility
	 * @return
	 * @throws NotFoundException
	 */
	int delete(Facility facility) throws NotFoundException;
	
	List<Facility> serchFacility(Facility facility);
}
