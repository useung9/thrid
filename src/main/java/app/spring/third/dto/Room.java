package app.spring.third.dto;

public class Room {
	private int room_idx;
	private String room_name;
	private String room_type;
	private String room_size;
	private int room_personnel;
	private String room_info;
	public int getRoom_idx() {
		return room_idx;
	}
	public void setRoom_idx(int room_idx) {
		this.room_idx = room_idx;
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
	@Override
	public String toString() {
		return "Room [room_idx=" + room_idx + ", room_name=" + room_name + ", room_type=" + room_type + ", room_size="
				+ room_size + ", room_personnel=" + room_personnel + ", room_info=" + room_info + "]";
	}
	public Room(int room_idx, String room_name, String room_type, String room_size, int room_personnel,
			String room_info) {
		super();
		this.room_idx = room_idx;
		this.room_name = room_name;
		this.room_type = room_type;
		this.room_size = room_size;
		this.room_personnel = room_personnel;
		this.room_info = room_info;
	}
	
	
	public Room() {
		
	}
}
