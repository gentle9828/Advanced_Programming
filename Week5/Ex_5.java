package Week5;

public class Ex_5 {
	
	static int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	int minus(int a, int b) {
		int result = a - b;
		return result;
	}
	
	// 오버로딩 예 - 매개변수 이름의 차이
//	static int add(int x, int y) {
//		int result = x + y;
//		return result;
//	}
	
	// 오버로딩 예 2 - 변환 타입의 차이
//	static lond add(int a, int b) {
//		long result = a + b;
//		return result;
//	}
	
	// 오버로딩 예 3 - 매개변수 타입의 차이
//	static long add(long a, int b) {
//		return a + b;
//	}
	
	// 오버로딩 예 4 - 매개변수 개수의 차이 2
//	static int add(int a, int b, int c) {
//		int result = a + b + c;
//		return result;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = add(3, 5);
		// short resShort = add(3, 5); // -> 자동 형변환이 될 수 있는 형을 반환 받아야함
		// int resParameter = add(3, 5, 6) // -> 매개 변수가 많으면 안됨.
		System.out.println("add method 3 + 5 : " + result);
		
		// add(2, 4) // -> 결과로 받는 변수 없이도 사용 가능
		
		/*
		 * 클래스 계산기 업그레이드
		 * 변수 구성요소 : 이전 결과값 result 
		 * 메서드 구성요소 : 더하기, 빼기, 곱하기, 나누기 
		 * 메서드 구성요소 : 매개변수 2개 또는 3개 자리수까지 가능, byte, short 타입도 연산가능
		 */
		

	}

}
