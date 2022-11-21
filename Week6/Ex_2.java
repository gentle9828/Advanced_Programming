package Week6;

class Time {
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() { return hour; }
	public boolean setHour(int hour) { 
		if(hour < 0 || hour > 23) {
			return false;
		}
		this.hour = hour;
		return true;
	} 
}

public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time t = new Time();
		//t.hour = 22;
		t.setHour(22);
		System.out.println("현재 시간은 : " + t.getHour() + "시");
	}

}
