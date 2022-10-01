//알파코드 :          이름 :
//RoomDAO를 완성하고 main 메서드의 주석대로 코드를 작성하시오.
//
//[전체 객실 목록]
//---------------------------
//객실명		층수		숙박요금
//---------------------------
//101호       1		50,000
//102호       1		40,000
//201호       2		60,000
//202호       2		65,000
//301호       3		70,000


package q16;

import java.util.ArrayList;

public class MyTest {
	public static void main(String[] args) {
		RoomDAO dao = new RoomDAO();
		
		//1. 위 주석에 있는 전체 객실 목록을 참고하여 Room 객체를 생성하고 dao에 추가
		
		
		
		//2. "201호" 객실정보를 출력
		
		
		
		//3. "201호"를 삭제
		
		
		
		//4. "301호"의 숙박요금을 80,000원으로 변경
		
		
		
		//4. 전체 객실정보 목록을 출력(주석의 [전체 객실 목록]의 형식을 참조)
	}
}

class Room {
	private String roomNo;
	private int floor;
	private int price;
	
	public Room() {
		
	}
	
	public Room(String roomNo, int floor, int price) {
		super();
		this.roomNo = roomNo;
		this.floor = floor;
		this.price = price;
	}
	
	public String toString() {
		return "객실번호: " + roomNo + ", 층수: " + floor + ", 숙박요금: " + price;
	}
}

class RoomDAO {
	private ArrayList<Room> roomList = new ArrayList<Room>();
	
	//아래 모든 메서드를 완성하시오.
	
	public ArrayList<Room> getAll() {
		return null;
	}
	
	public Room get(int inx) {
		return null;
	}
	
	public Room get(String roomNo) {
		return null;
	}
	
	public void Add(Room room) {
		
	}
	
	public boolean Update(Room room) {
		return false;
	}
	
	public boolean Delete(String roomNo) {
		return false;
	}
}
