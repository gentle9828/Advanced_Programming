package Week11;
import java.util.*;

/*
 *  Comparator 
 *  public interface Comparator {
 *  	int compare(Object o1, Object o2)
 *  	boolean equals(Object obj);
 *  }
 *  
 *  Comparator를 구현하면 매개변수 두개를 서로 비교하는 메서드를 구현해야 한다.
 *  compare를 구현할 때 비교값에 따라 음수, 0, 양수를 반환하도록 구현해야 한다.
 *  
 *  Comparable
 *  public interface Comparable {
 *  	public int compareTo(Object o);
 *  }
 *  
 *  Comparable를 구현하면 자기 자신과 매개변수를 비교하는 메서드를 구현해야 한다.
 *  compareTo를 구현할 때 자기 자신과 같을경우 0, 크면 -1, 작으면 1을 반환하도록 구현해야 함.
 *  
 */


class Descending implements Comparator{ // Comparator을 구현한다.
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;
		}
	return -1;
	}
}

public class Ex_Comparator2 {

	
	public static void main(String[] args) {
		String[] str = {"cat","Dog","lion","tiger"};
		
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		Arrays.sort(str, new Descending());
		System.out.println(Arrays.toString(str));
		Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(str));
		
	}
}