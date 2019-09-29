package reservation.exception;

import reservation.vo.Admin;
import reservation.vo.Facility;

/**
 * Admin NotFoundException
 * @author 오진오
 *
 */
public class NotFoundException extends Exception{
	
	// 중복정의 생성자
	public NotFoundException(String type, Admin admin) {
		super(String.format("%s:[adminSeq:%d] 관리자 정보가 존재하지 않습니다.", type,admin.getAdminSeq()));
	}
	
	// 중복정의 생성자
	public NotFoundException(String type, Facility facility) {
		super(String.format("%s:[FacSeq:%d] 관리자 정보가 존재하지 않습니다.", type,facility.getFacSeq()));
	}
}
