package reservation.exception;

/**
 * Admin DuplicateException
 * @author 오진오
 *
 */
import reservation.vo.Admin;
import reservation.vo.Facility;

public class DuplicateException extends Exception{

	
	// 중복 정의 생성자
	public DuplicateException(String type,Admin admin) {
		super(String.format("%s:[adminSeq:%d] 관리자 정보가 중복 되었습니다.", type,admin.getAdminSeq()));
	}
	
	public DuplicateException(String type,Facility facility) {
		super(String.format("%s:[facilitySeq:%d] 건물 정보가 중복 되었습니다.", type,facility.getFacSeq()));
	}
}
