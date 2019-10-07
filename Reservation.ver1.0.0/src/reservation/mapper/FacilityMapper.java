package reservation.mapper;

import java.util.List;
import java.util.Map;

import reservation.vo.Facility;

public interface FacilityMapper {
	
	List<Facility> select(Facility facility);
	
	int insert(Map<String, Object> map);
	
	int update(Map<String, Object> map);
	
	int delete(Facility facility);
	
	Integer isExists(Facility facility);
	
	List<Facility> searchFacility(Facility facility);
	
	List<Facility> selectBuildingCd(Facility facility);
}
