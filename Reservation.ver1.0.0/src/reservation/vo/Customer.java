package reservation.vo;
/**
 * 고객 클래스
 * @author 유현동
 *
 */
public class Customer {

	// 변수 선언
	private int custSeq;
	private String custId;
	private String name;
	private String password;
	private int custType;
	private int custNb;
	private String email;
	private String phone;
	private String regId;
	private String regDate;
	private String modId;
	private String modDate;
	
	// 기본 생성자 생성
	public Customer() {
		super();
	}
	
	// getter & setter
	public int getCustSeq() {
		return custSeq;
	}

	public void setCustSeq(int custSeq) {
		this.custSeq = custSeq;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
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

	public int getCustType() {
		return custType;
	}

	public void setCustType(int custType) {
		this.custType = custType;
	}

	public int getCustNb() {
		return custNb;
	}

	public void setCustNb(int custNb) {
		this.custNb = custNb;
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

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
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
	
	// hash & equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + custSeq;
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
		Customer other = (Customer) obj;
		if (custSeq != other.custSeq)
			return false;
		return true;
	}

	// toString() 작성
	@Override
	public String toString() {
		return "Customer [custSeq=" + custSeq + ", custId=" + custId + ", name=" + name + ", password=" + password
				+ ", custType=" + custType + ", custNb=" + custNb + ", email=" + email + ", phone=" + phone + ", regId="
				+ regId + ", regDate=" + regDate + ", modId=" + modId + ", modDate=" + modDate + "]";
	}
	
	
}
