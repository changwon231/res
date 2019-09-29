package reservation.vo;

//자바 빈즈 규격 
//hash code = seq만 잡기 
//강유환

public class Facility {
	// 멤버 변수 선언 및 초기화
	private int facSeq;
	private String facNm;
	private int buildingCd;
	private String codeVal;
	private int facType;
	private String codeNm;
	private int facNb;
	private int peopleLmCd;
	private String codeDesc;
	private String redId;
	private String regDate;
	private String modId;
	private String modDate;
	
	// 기본 생성자
	public Facility() {
		super();
	}

	// get() & setter()
	public int getFacSeq() {
		return facSeq;
	}

	public void setFacSeq(int facSeq) {
		this.facSeq = facSeq;
	}

	public String getFacNm() {
		return facNm;
	}

	public void setFacNm(String facNm) {
		this.facNm = facNm;
	}

	public int getBuildingCd() {
		return buildingCd;
	}

	public void setBuildingCd(int buildingCd) {
		this.buildingCd = buildingCd;
	}

	public int getFacType() {
		return facType;
	}

	public void setFacType(int facType) {
		this.facType = facType;
	}

	public int getFacNb() {
		return facNb;
	}

	public void setFacNb(int facNb) {
		this.facNb = facNb;
	}

	public int getPeopleLmCd() {
		return peopleLmCd;
	}

	public void setPeopleLmCd(int peopleLmCd) {
		this.peopleLmCd = peopleLmCd;
	}

	public String getRedId() {
		return redId;
	}

	public void setRedId(String redId) {
		this.redId = redId;
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
	
	
	public String getCodeVal() {
		return codeVal;
	}

	public void setCodeVal(String codeVal) {
		this.codeVal = codeVal;
	}

	public String getCodeNm() {
		return codeNm;
	}

	public void setCodeNm(String codeNm) {
		this.codeNm = codeNm;
	}

	public String getCodeDesc() {
		return codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	// hash code
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + facSeq;
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
		Facility other = (Facility) obj;
		if (facSeq != other.facSeq)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Facility [facSeq=" + facSeq + ", facNm=" + facNm + ", buildingCd=" + buildingCd + ", codeVal=" + codeVal
				+ ", facType=" + facType + ", codeNm=" + codeNm + ", facNb=" + facNb + ", peopleLmCd=" + peopleLmCd
				+ ", codeDesc=" + codeDesc + ", redId=" + redId + ", regDate=" + regDate + ", modId=" + modId
				+ ", modDate=" + modDate + "]";
	}
	
}
