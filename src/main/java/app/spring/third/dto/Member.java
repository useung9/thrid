package app.spring.third.dto;

public class Member {


	int member_idx;
	String member_id;
	String member_pw;
	int member_phone;
	String member_birth;
	String member_level;
	String member_regidate;
	
	public Member() {
		super();
	}

	public Member(int member_idx, String member_id, String member_pw, int member_phone, String member_birth,
			String member_level, String member_regidate) {
		super();
		this.member_idx = member_idx;
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_phone = member_phone;
		this.member_birth = member_birth;
		this.member_level = member_level;
		this.member_regidate = member_regidate;
	}

	public int getMember_idx() {
		return member_idx;
	}

	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public int getMember_phone() {
		return member_phone;
	}

	public void setMember_phone(int member_phone) {
		this.member_phone = member_phone;
	}

	public String getMember_birth() {
		return member_birth;
	}

	public void setMember_birth(String member_birth) {
		this.member_birth = member_birth;
	}

	public String getMember_level() {
		return member_level;
	}

	public void setMember_level(String member_level) {
		this.member_level = member_level;
	}

	public String getMember_regidate() {
		return member_regidate;
	}

	public void setMember_regidate(String member_regidate) {
		this.member_regidate = member_regidate;
	}

	@Override
	public String toString() {
		return "Member [member_idx=" + member_idx + ", member_id=" + member_id + ", member_pw=" + member_pw
				+ ", member_phone=" + member_phone + ", member_birth=" + member_birth + ", member_level=" + member_level
				+ ", member_regidate=" + member_regidate + "]";
	}

	
	
		
	
		
}
