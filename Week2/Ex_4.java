package Week2;

import java.util.Date;

public class Ex_4 {

	public static void main(String[] args) {
		// 참조형
		Date date = new Date();
				
		// 논리형 - boolean
		boolean bOff = false;
		boolean bOn = true;
		// boolean bError = True; // 대소문자 구분. 에러 발생.
				
		// 문자형 char
		char ch = 'a';
		// char chString = 'ab'; // 문자가 아닌 문자열 입력. 에러 발생.
		// char chNull = ''; // 문자가 필요함. 공백이 들갈 수 없음. 에러 발생.
		// char chBlank = ' '; // 빈 문자도 하나의 문자. 공백 문자로 초기화. 에러 없음.
				
		// 문자열 - String
		String str = "Advanced Java Programming";
		// String strNewObject = new string("Java") // Class는 원래 new 연산자를 사용해서 만들어야 함.
		// String strNull = ""; // String 타입은 빈 문자열 생성 가능.
				
		String strMix = "A" + 4; // 기본형 타입과 결합 가능
		String strMix2 = "" + 3 + 7; // 기본형 타입과 결합 가능(2)
		String strMix3 = 3 + 7 + ""; // 기본형 타입과 결합 가능(3)
				
		System.out.println(strMix);
		System.out.println(strMix2);
		System.out.println(strMix3);
				
		// 정수형
		byte b = 1; // byte 1byte
		short s = 2; // short 2byte
		int i = 4; // int 4 byte
		long l = 8; // long 8 byte

	}

}
