package app.spring.third.dto;

public class RoomFile {
	private int roomfile_idx;
	private int room_idx;
	private String roomfile_filename;
	
	@Override
	public String toString() {
		return "RoomFile [roomfile_idx=" + roomfile_idx + ", room_idx=" + room_idx + ", roomfile_filename="
				+ roomfile_filename + "]";
	}
	public int getRoomfile_idx() {
		return roomfile_idx;
	}
	public void setRoomfile_idx(int roomfile_idx) {
		this.roomfile_idx = roomfile_idx;
	}
	public int getRoom_idx() {
		return room_idx;
	}
	public void setRoom_idx(int room_idx) {
		this.room_idx = room_idx;
	}
	public String getRoomfile_filename() {
		return roomfile_filename;
	}
	public void setRoomfile_filename(String roomfile_filename) {
		this.roomfile_filename = roomfile_filename;
	}
	public RoomFile(int roomfile_idx, int room_idx, String roomfile_filename) {
		super();
		this.roomfile_idx = roomfile_idx;
		this.room_idx = room_idx;
		this.roomfile_filename = roomfile_filename;
	}
	
	public RoomFile() {
		
	}
}
