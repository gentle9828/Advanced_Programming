package Week5;

public class Ex_4 {
	
	static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int[] math = new int[10];
		
		// 배열 초기화
		for(int i = 0; i < math.length; i++) {
			math[i] = i;
		}
		
		for(int i = 0; i < math.length; i++) {
			System.out.printf("%d ", math[i]);
		}
		System.out.println();
		
		// 배열 값 변경
		for(int i = 0; i < math.length; i++) {
			math[i] = 10 - i;
		}
		
//		for(int i = 0; i < math.length; i++) {
//			System.out.printf("%d ", math[i]);
//		}
//		System.out.println();
		printArr(math);
		
		// 배열 값 재변
		for(int i = 0; i < math.length; i++) {
			math[i] = i;
		}
		
		printArr(math);
		
		/*
		 * 클래스 계산기 생성 
		 * 구성요소 : 변수 int 이전 결과값 result 
		 * 구성요소 : 메서드 더하기, 빼기, 곱하기, 나누기
		 */
		
	
	}

}
