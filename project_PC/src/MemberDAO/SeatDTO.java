package MemberDAO;

import java.sql.*;

public class SeatDTO {
	int seat_num;
	String id;
	boolean vacant_seat;
	Time count;
	
	
	public int getSeat_num() {
		return seat_num;
	}
	public void setSeat_num(int seat_num) {
		this.seat_num = seat_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isVacant_seat() {
		return vacant_seat;
	}
	public void setVacant_seat(boolean vacant_seat) {
		this.vacant_seat = vacant_seat;
	}
	public Time getCount() {
		return count;
	}
	public void setCount(Time count) {
		this.count = count;
	}
	
	
	
}
