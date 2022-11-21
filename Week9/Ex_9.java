package Week9;

interface Product {
    void seeContents();
    void getSample();
}

class Book implements Product {
    @Override
    public void seeContents() { /* 구현 생략 */ }

    @Override
    public void getSample() { /* 구현 생략 */ }
}

class CD implements Product {
    @Override
    public void seeContents() { /* 구현 생략 */ }
    @Override  
    public void getSample() { /* 구현 생략 */ }
}

class NShelf {

    Product product;

    void addProduct(Product product) { /* 구현 생략 */ }
    void customizeShelf() { /* 구현 생략 */ }
}


public class Ex_9 {

}
