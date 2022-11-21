package Week3;

public class Ex_9 {

	public static void main(String[] args) {
		// while 문
		int num = 1;
		while (num < 10) {
			System.out.println(num);
			num++;
			// num = 1; // while 문 내 초기화 시 무한반복 오
		}
		
		// for문으로 변환
		for(num = 1; num < 10; num++) {
			// System.out.println(num);
		}
		
		// do-while 문
		boolean bInit = false;
		do {
			if(num != 1 && bInit == false)
			{
				num = 1;
				bInit = true;
			}
			System.out.println(num);
			num++;
		} while (num < 10);

	}

}
