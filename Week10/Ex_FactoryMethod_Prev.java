package Week10;

// 팩토리 메서드 패턴 (적용 전)

abstract class Item { }

class OrangeJuice extends Item {
        OrangeJuice(){
        System.out.println("오렌지쥬스 생성");
    }
}
class MelonJuice extends Item {
        MelonJuice(){
        System.out.println("멜론쥬스 생성");
    }
}
class GreenTea extends Item {
        GreenTea(){
        System.out.println("녹차 생성");
    }
}

class VendingMachine {
    Item provideItem(String type){
        Item returnItem = null;
        
        if(type.equals("오렌지쥬스"))
            returnItem = new OrangeJuice();
        else if(type.equals("멜론쥬스"))
            returnItem = new OrangeJuice();
        else if(type.equals("녹차"))
            returnItem = new GreenTea();
        
        return returnItem;
    }
}

class Buyer {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        VendingMachine vm = new VendingMachine();
        vm.provideItem("오렌지쥬스");
        vm.provideItem("녹차");
    }
}

public class Ex_FactoryMethod_Prev {

}
