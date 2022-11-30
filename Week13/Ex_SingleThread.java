package Week13;

public class Ex_SingleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		for(int i=0; i < 500; i++)
			System.out.printf("%s", new String("-"));		

		System.out.println();
		System.out.print("�ҿ�ð�:" + (System.currentTimeMillis()- startTime) + "\n"); 
		

		for(int i=0; i < 500; i++) 
			System.out.printf("%s", new String("|"));		

		System.out.println();
		System.out.print("�ҿ�ð�:" + (System.currentTimeMillis() - startTime) + "\n");
	}
}
