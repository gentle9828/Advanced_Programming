package Week12;
import java.util.*;

interface Drinkable { } 

class Menu<T>{
//class Menu<T extends Drinkable>{ // 인터페이스도 implements가 아닌 extends를 사용함
//class Menu<T extends Coffee> { // 와일드 카드의 상한 제한. T와 그 자식들만 가능
	//static T staticitem; // static 멤버는 타입 변수 사용 불가
	ArrayList<T> list = new ArrayList<T>();
	//T[] itemArr; // 타입 변수로 배열 선언 가능
	void add(T item)  { list.add(item); }
	T get(int i)      { return list.get(i); }
	int size() { return list.size(); }
	ArrayList<T> getList() { return list;  }
	public String toString() { return list.toString();}
}

class ItemizeMenu<T extends Coffee> extends Menu<T> {}

class Coffee		           { public String toString() { return "Coffee";}}
class Americano extends Coffee { public String toString() { return "Americano";}}
class Latte extends Coffee     { public String toString() { return "Latte";}}
class Tea		               { public String toString() { return "Tea"  ;}}

class Product {
	String name;

	Product(String name)	     { this.name = name + "Product"; }
	public String toString() { return name;		 }
}

class Server {
	static Product serveMenu(ItemizeMenu<? extends Coffee> menu) {
		String tmp = "";
		
		for(Coffee c : menu.getList()) 
			tmp += c + " ";
		return new Product(tmp);
	}
}

public class Ex_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Menu<Coffee> coffeeMenu = new Menu<Coffee>();
		Menu<Americano> AmericanoMenu= new Menu<Americano>();
		Menu<Tea>   teaMenu   = new Menu<Tea>();
		//Menu<Coffee> coffeeMenu = new Menu<Tea>(); // 에러. 타입 불일치
		
		//Menu menuTest = null;
		//menuTest = (Menu)coffeeMenu; // 형변환은 가능하지만 바람직하지 않음.
		
		coffeeMenu.add(new Coffee());
		coffeeMenu.add(new Americano()); // 아메리카노가 커피의 자식이므로 사용 가능

		AmericanoMenu.add(new Americano());
		AmericanoMenu.add(new Americano());
//		AmericanoMenu.add(new Tea()); // 에러. Menu<Americano>에는 Americano만 담을 수 있음

		teaMenu.add(new Tea());
//		teaMenu.add(new Americano()); // 에러.

		System.out.println(coffeeMenu);
		System.out.println(AmericanoMenu);
		System.out.println(teaMenu);
		
		ItemizeMenu<Coffee> itemizeCoffee   = new ItemizeMenu<Coffee>();
		itemizeCoffee.add(new Americano());
		itemizeCoffee.add(new Latte());
		System.out.println(Server.serveMenu(itemizeCoffee)); // 대입된 타입 생략 가능
		//System.out.println(Server.<Coffee>serveMenu(itemizeCoffee));
	}

}
