package Week2;

public class Ex_6 {

	public static void main(String[] args) {
		// 문자 -> 숫자
		// %b : boolean 출력, %c : 문자로 출력, %s : 문자열로 출력
		// %d : 10진수 정수로 출력, %f : 부동 소수점 형식으로 출력
		
		int num = 7;
		char ch = '0', ch2 = '7'; // 유니코드 48, 55
		
		System.out.printf("7 + '0' : %d\n", num + ch);
		System.out.printf("'7' - '0' : %d\n", ch2 - ch);
		
		// 문자열로 변환
		System.out.printf("숫자 + 빈 문자열 : %s\n", 7 + "");
		System.out.printf("문자 + 빈 문자열 : %s\n", '7' + "");
		
		// 문자열을 숫자로 변환
		num = Integer.parseInt("4000");
		Double pi = Double.parseDouble("3.14");
		System.out.printf("문자열을 정수로 변환 : %d\n", num);
		System.out.printf("문자열을 실수로 변환 : %f\n", pi);
		
		// 문자열을 문자로 변환
		String str = "CHAR";
		System.out.printf("첫번째 문자 : %c\n", str.charAt(0));
		System.out.printf("세번째 문자 : %c\n", str.charAt(2));
	}

}
