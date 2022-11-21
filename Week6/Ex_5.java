package Week6;

class Unit {
	String name;
	int hp;
	int mp;
}

interface Fightable { 
	void move(int x, int y);
	void attack(Unit u);
}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) { /* 내용 생략*/ }
	public void attack(Unit u)     { /* 내용 생략*/ }
}

public class Ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fighter f = new Fighter();
		Fightable fa = new Fighter();
		
		f.hp = 100;
		// fa.hp 접근 불가
	}
}
