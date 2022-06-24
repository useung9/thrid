package app.spring.third.dto;

import java.util.Date;

public class Reservation {
	private int reservation_idx;
	private int room_idx;
	private String re_status;
	private String re_startdate;
	private String re_enddate;
	private String member_id;
	private int re_personnel;
	@Override
	public String toString() {
		return "Reservation [reservation_idx=" + reservation_idx + ", room_idx=" + room_idx + ", re_status=" + re_status
				+ ", re_startdate=" + re_startdate + ", re_enddate=" + re_enddate + ", member_id=" + member_id
				+ ", re_personnel=" + re_personnel + "]";
	}
	public int getReservation_idx() {
		return reservation_idx;
	}
	public void setReservation_idx(int reservation_idx) {
		this.reservation_idx = reservation_idx;
	}
	public int getRoom_idx() {
		return room_idx;
	}
	public void setRoom_idx(int room_idx) {
		this.room_idx = room_idx;
	}
	public String getRe_status() {
		return re_status;
	}
	public void setRe_status(String re_status) {
		this.re_status = re_status;
	}
	public String getRe_startdate() {
		return re_startdate;
	}
	public void setRe_startdate(String re_startdate) {
		this.re_startdate = re_startdate;
	}
	public String getRe_enddate() {
		return re_enddate;
	}
	public void setRe_enddate(String re_enddate) {
		this.re_enddate = re_enddate;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public int getRe_personnel() {
		return re_personnel;
	}
	public void setRe_personnel(int re_personnel) {
		this.re_personnel = re_personnel;
	}
	public Reservation(int reservation_idx, int room_idx, String re_status, String re_startdate, String re_enddate,
			String member_id, int re_personnel) {
		super();
		this.reservation_idx = reservation_idx;
		this.room_idx = room_idx;
		this.re_status = re_status;
		this.re_startdate = re_startdate;
		this.re_enddate = re_enddate;
		this.member_id = member_id;
		this.re_personnel = re_personnel;
	}
	
	
	public Reservation() {
		
	}
}
