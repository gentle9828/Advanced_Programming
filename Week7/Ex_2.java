package Week7;

/* 객체지향적 분석
/ 협동, 책임, 역할
/ 아는 것, 할 수 있는 것

 고객이 메뉴를 정하고 돈을 준비해서 캐셔에게 전달한다.
 캐셔는 돈을 확인하고 음료를 만들어달고 하고 주문한다.
 제작된 음료를 캐셔가 제공한다.
 ---------------------------------------
고객
아는 것 - 소지금, 소지물품
할 수 있는 것 - 구매 요청, 제품 인수
 
캐셔
아는 것 - 물품 금액, 제품,
할 수 있는 것 - 요금 검사, 제품 요구, 제품 인계
 
바리스타
아는 것 - 제품, 재고
할 수 있는 것 - 제품 제작, 제품 인계
*/

class Buyer {
	private int money;  // 소지금
	private String inventory; // 소지물품
	
	public void get_Product(int money, String product)
	{
		this.money -= money;
		this.inventory += product;
	}
	
	public int get_Money() {
		return money;
	}
	
	public String toString() {
		return "소지금 : " + money + "\t보유물품 : " + inventory;
	}
	
	Buyer(int money)
	{
		this.money = money;
		this.inventory = "";
	}
}

class Casher {
	private int salesVolume;
	
	void getSalesVolume() {
		System.out.println("매상 :" + salesVolume);
	}
	
	String buy(int money, String name) {
		if(money >= 4000 && name.equals("아메리카노"))
		{
			salesVolume += 4000;
			return "아메리카노";
		}
		else if(money >= 4500) {
			if(name.equals("라떼"))
			{
				salesVolume += 4500;
				return "라떼";
			}
			else if(name.equals("녹차"))
			{
				salesVolume += 4500;
				return "녹차";
			}
			else
			{
				salesVolume += 4500;
				return "미등록상품";
			}
		} 
		else if((money >= 5000)) {
			if(name.equals("유자차"))
			{
				salesVolume += 5000;
				return "유자차";
			}
			else
				return "미등록상품";
		}
		else
			return null;
	}
	
	public String toString() {
		return "매출액 : " + salesVolume;
	}
	
	Casher(int salesVolume) {
		this.salesVolume = salesVolume;
	}
}

class Barista {
	private int coffee; 
	private int milk;
	private int greentea;
	private int yujutea;
	
	boolean Make_Tea(String product)
	{
		if(product.equals("아메리카노") && coffee >= 1)
			return true;
		else if(product.equals("라떼") && coffee >= 1)
			return true;
		else if(product.equals("녹차") && greentea >= 1)
			return true;
		else if(product.equals("유자차") && yujutea >= 1)
			return true;
		else
			return false;
	}
	
	Barista(int coffee, int milk, int greentea, int yujutea)
	{
		this.coffee = coffee;
		this.milk = milk;
		this.greentea = greentea;
		this.yujutea = yujutea;
	}
}

public class Ex_2 {

	static int AMARICANO = 1, AMARICANO_COST = 4000;
	static int LATTE = 2, LATTE_COST = 4500;
	static int GREEN_TEA = 3, GREENTEA_COST = 4500;
	static int YUJU_TEA = 4, YUJUTEA_COST = 5000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer(10000);
		Casher ch = new Casher(0);
		Barista ba = new Barista(10, 10, 10, 10);
		
		String want_drink = "유자차";
		String order = ch.buy(b.get_Money(), want_drink); 
			
		if(want_drink.equals(order)) {
			if(ba.Make_Tea(order))
			{
				System.out.println("커피제작 완료.");
				b.get_Product(AMARICANO_COST, "유자차");
			}
		}
		
		System.out.println(b.toString());
		System.out.println(ch.toString());
	}
}
