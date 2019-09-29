package reservation.vo;
/**
 * 
 * @author 김상진
 *
 */
public class Code {

	private int code;
	private int pCode;
	private String codeNm;
	private String codeVal;
	private String useYn;
	private String codeDesc;
	private int sortOrder;
	private String regDate;
	private String modId;
	private String modDate;
	
	public Code() {
		super();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getpCode() {
		return pCode;
	}

	public void setpCode(int pCode) {
		this.pCode = pCode;
	}

	public String getCodeNm() {
		return codeNm;
	}

	public void setCodeNm(String codeNm) {
		this.codeNm = codeNm;
	}

	public String getCodeVal() {
		return codeVal;
	}

	public void setCodeVal(String codeVal) {
		this.codeVal = codeVal;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getCodeDesc() {
		return codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
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
		result = prime * result + code;
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
		Code other = (Code) obj;
		if (code != other.code)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "코드정보 [코드=" + code + ", 부모코드=" + pCode + ", 코드이름=" + codeNm + ", 코드값=" + codeVal + ", 사용여부="
				+ useYn + ", 코드내용=" + codeDesc + ", 정렬순서=" + sortOrder + ", 등록일=" + regDate + ", 수정자="
				+ modId + ", 수정일=" + modDate + "]";
	}
	
	
	
}
