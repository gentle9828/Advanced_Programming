package Week10;

// ���丮 �޼��� ���� (���� ��)

abstract class NItem { }

class NOrangeJuice extends NItem { /* 생략 */ }
class NMelonJuice extends NItem { /* 생략 */ }
class NGreenTea extends NItem { /* 생략 */ }

class ItemFactory {
    public NItem createItem(String type) {
    NItem returnItem = null;
    
        if(type.equals("오렌지쥬스"))
            returnItem = new NOrangeJuice();
        else if(type.equals("멜론쥬스"))
            returnItem = new NMelonJuice();
        else if(type.equals("녹차"))
            returnItem = new NGreenTea();

        return returnItem;
    }
}

class NVendingMachine {
    public NItem provideItem(String type) { 
        ItemFactory factory = new ItemFactory();
        NItem returnType = factory.createItem(type);

        return returnType;
    }
}

class NBuyer {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        NVendingMachine vm = new NVendingMachine();
        vm.provideItem("오렌지쥬스");
        vm.provideItem("녹차");
    }
}

public class Ex_FactoryMethod_Apply {

}
