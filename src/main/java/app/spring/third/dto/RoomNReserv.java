package app.spring.third.dto;

import java.util.Date;

public class RoomNReserv {
	private int reservation_idx;
	private int room_idx;
	private String re_status;
	private Date re_startdate;
	private Date re_enddate;
	private String member_id;
	private int re_personnel;
	
	
	private String room_name;
	private String room_type;
	private String room_size;
	private int room_personnel;
	private String room_info;
	@Override
	public String toString() {
		return "RoomNReserv [reservation_idx=" + reservation_idx + ", room_idx=" + room_idx + ", re_status=" + re_status
				+ ", re_startdate=" + re_startdate + ", re_enddate=" + re_enddate + ", member_id=" + member_id
				+ ", re_personnel=" + re_personnel + ", room_name=" + room_name + ", room_type=" + room_type
				+ ", room_size=" + room_size + ", room_personnel=" + room_personnel + ", room_info=" + room_info
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
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
	public Date getRe_startdate() {
		return re_startdate;
	}
	public void setRe_startdate(Date re_startdate) {
		this.re_startdate = re_startdate;
	}
	public Date getRe_enddate() {
		return re_enddate;
	}
	public void setRe_enddate(Date re_enddate) {
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
	public String getRoom_name() {
		return room_name;
	}
	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public String getRoom_size() {
		return room_size;
	}
	public void setRoom_size(String room_size) {
		this.room_size = room_size;
	}
	public int getRoom_personnel() {
		return room_personnel;
	}
	public void setRoom_personnel(int room_personnel) {
		this.room_personnel = room_personnel;
	}
	public String getRoom_info() {
		return room_info;
	}
	public void setRoom_info(String room_info) {
		this.room_info = room_info;
	}
	public RoomNReserv(int reservation_idx, int room_idx, String re_status, Date re_startdate, Date re_enddate,
			String member_id, int re_personnel, String room_name, String room_type, String room_size,
			int room_personnel, String room_info) {
		super();
		this.reservation_idx = reservation_idx;
		this.room_idx = room_idx;
		this.re_status = re_status;
		this.re_startdate = re_startdate;
		this.re_enddate = re_enddate;
		this.member_id = member_id;
		this.re_personnel = re_personnel;
		this.room_name = room_name;
		this.room_type = room_type;
		this.room_size = room_size;
		this.room_personnel = room_personnel;
		this.room_info = room_info;
	}
	
	public RoomNReserv() {
		
	}
}
