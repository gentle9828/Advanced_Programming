package Week9;

interface Print {
	  void print();
}

interface Copy {
	  void copy();
}

interface Fax {
	  void fax(String from, String to);
}

class PrintMachine implements Print {
	  @Override
	  public void print() {
		  System.out.println("인쇄합니다.");
	  }
}

public class Ex_7 {

}
