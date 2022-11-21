package Week3;

public class Ex_3 {

	public static void main(String[] args) {
		// byte 범위 : -128 ~ 127
		byte a = 5, b = 10;
		// byte c = a+b; // 에러. int형보다 byte형은 사이즈가 작기 때문에 int 형으로 변환 후 덧셈 수행.
		byte c = (byte)(a + b);
		System.out.println(c);
		
		int iTemp = 200000;
		long l = iTemp*iTemp;
		System.out.println("20만 * 20만 형변환 없을 때 : " + l);
		l = (long)iTemp*(long)iTemp;
		System.out.println("20만 * 20만 형변환 후 : " + l);
		
		System.out.println("int / int : " + 12/5); // int와 int 나누면 소수점 삭제 (값 손실).
		System.out.println("int / double : " + 12/5.0); // int와 double을 나누면 큰 형인 double로 변환되어 정상 출력.
		
		int div = 10 / 7, mod = 10 % 7;
		System.out.println("나누기 한 결과 : " + div + " 나머지 결과 : " + mod);
		
		a = 10;
		b = (byte)(a<<2);
		
		System.out.printf("원래 수 : %d, 시프트 연산결과 : %d\n", a, b); // 10:1010 40:101000
		
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		System.out.println("f의 값 : " + f + " d의 값 : " + d + " d2의 값 : " + d2);

	}

}
