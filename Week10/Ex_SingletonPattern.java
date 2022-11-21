package Week10;

// 싱글톤 확인

class EarlySingleton {
    private static EarlySingleton uniqueInstance = new EarlySingleton();  
  
    private EarlySingleton() { /* 생성자 */ }

    public static EarlySingleton getInstance() {
        return uniqueInstance;
    }
}

class LateSingleton {
    private static LateSingleton uniqueInstance;  
  
    private LateSingleton() { /* 생성자 */ }

    public static LateSingleton getInstance() {
    if(uniqueInstance == null)
        uniqueInstance = new LateSingleton();

        return uniqueInstance;
    }
}

public class Ex_SingletonPattern {

}
