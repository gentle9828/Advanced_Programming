package Week5;

class NewTime {
	int hour;
	int minute;
	int second;
	
	NewTime() {
		hour = 0;
		minute = 0;
		second = 0;
	}
	
	NewTime(int h) {
		// hour = 0;
		this(h, 0, 0); // 첫 줄에서만 사용 가
	}
	
	NewTime(int h, int min) {
		this(h, min, 0);
		// NewTime(h, min, 0); // 클래스 이름 대신 this 사	
	}
	
	NewTime(int h, int min, int sec) {
		hour = h; minute = min; second = sec;
	}
}

public class Ex_6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewTime t = new NewTime();
		t.hour = 12;
		t.minute = 20;
		t.second = 25;
		
		NewTime t2 = new NewTime(12, 20, 25);
		
		int res = Ex_5.add(3, 5); // static 메서드. 인스턴스 생성하지 않고 호출 가능.
		
		System.out.println("static add method 3 + 5 : " + res);
		// int res2 = Ex_5.minus(5, 3); // 일반 메서드는 인스턴스 생성 후 호출.
		Ex_5 ex5 = new Ex_5();
		int res2 = ex5.minus(5, 3);
		
		System.out.println("minus method 5 - 3 : " + res2);

	}

}
