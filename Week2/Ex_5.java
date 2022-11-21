package Week2;

public class Ex_5 {

	public static void main(String[] args) {
		final byte BYTE_MAX = (byte)127;
		final short SHORT_MAX = (short)32767;
		
		byte bOverflow = (byte)(BYTE_MAX+1);
		short sOverflow = (short)(SHORT_MAX+1);
		
		System.out.println("byte MAX : " + BYTE_MAX + " Overflow : " + bOverflow);
		System.out.println("short MAX : " + SHORT_MAX + " Overflow : " + sOverflow);

	}

}
