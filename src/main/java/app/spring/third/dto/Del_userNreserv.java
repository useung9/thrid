package app.spring.third.dto;

public class Del_userNreserv {
	private String userid;
	private String reservation_idx;
	@Override
	public String toString() {
		return "Del_userNreserv [userid=" + userid + ", reservation_idx=" + reservation_idx + "]";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getReservation_idx() {
		return reservation_idx;
	}
	public void setReservation_idx(String reservation_idx) {
		this.reservation_idx = reservation_idx;
	}
	public Del_userNreserv(String userid, String reservation_idx) {
		super();
		this.userid = userid;
		this.reservation_idx = reservation_idx;
	}
	
	public Del_userNreserv() {
		
	}
}
