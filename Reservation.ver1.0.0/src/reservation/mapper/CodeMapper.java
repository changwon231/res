package reservation.mapper;

import java.util.List;

import reservation.vo.Code;

public interface CodeMapper {

	List<Code> selectReservation();
	
	List<Code> selectFacility();
	
	List<Code> selectPlace();
	
	List<Code> selectLimit();
}
