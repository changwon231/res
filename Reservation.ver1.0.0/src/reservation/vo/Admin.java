package reservation.vo;

/**
 * Admin vo 입니다.
 * 
 * @author 오진오
 *
 */
public class Admin {

	private int adminSeq;
	private String adminId;
	private String name;
	private String password;
	private int adminType;
	private String email;
	private String phone;
	private int regId;
	private String regDate;
	private String modId;
	private String modDate;

	// 기본 생성자
	public Admin() {
		super();
	}

	public int getAdminSeq() {
		return adminSeq;
	}

	public void setAdminSeq(int adminSeq) {
		this.adminSeq = adminSeq;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAdminType() {
		return adminType;
	}

	public void setAdminType(int adminType) {
		this.adminType = adminType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getModId() {
		return modId;
	}

	public void setModId(String modId) {
		this.modId = modId;
	}

	public String getModDate() {
		return modDate;
	}

	public void setModDate(String modDate) {
		this.modDate = modDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adminSeq;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (adminSeq != other.adminSeq)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "관리자 [관리자 일련번호=" + adminSeq + ", 관리자 아이디=" + adminId + ", 이름=" + name + ", password=" + password
				+ ", 관리자 타입=" + adminType + ", 이메일=" + email + ", 전화번호=" + phone + ", 등록자 아이디=" + regId
				+ ", 등록일=" + regDate + ", 수정자 아이디=" + modId + ", 수정일=" + modDate + "]";
	}

	
	
}
