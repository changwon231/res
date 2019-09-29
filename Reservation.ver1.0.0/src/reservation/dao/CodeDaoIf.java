package reservation.dao;

import java.util.List;

import reservation.vo.Code;

public interface CodeDaoIf {

	/**
	 * 
	 * @return
	 */
	List<Code> selectReservation();
	
	List<Code> selectFacility();
	
	List<Code> selectPlace();
	
	List<Code> selectLimit();
	
}
