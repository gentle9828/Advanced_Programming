package Week10;

interface Movable {
    public void move();
}

class Ship implements Movable{
    public void move(){
        System.out.println("수로를 통해 이동");
    }
}

class Car implements Movable{
    public void move(){
        System.out.println("도로를 통해 이동");
    }
}


public class Ex_StrategyPattern_Prev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movable ship = new Ship();
        Movable car = new Car();

        ship.move();
        car.move();
	}

}
