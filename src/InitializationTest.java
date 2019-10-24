public class InitializationTest {
    static { // Initialization Block of Class: 클래스 변수의 초기화가 복잡한 경우에 주로 사용된다. 클래스 로딩 시 1번만 수행된다.
        System.out.println("static { }");
    }

    { // Initialization Block of Instance: 인스턴스의 초기화는 주로 생성자를 사용하기 때문에 잘 사용되지 않는다. 대신 클래스의 모든 생성자에서 공통적으로 수행되어야 하는 코드는 각 생성자에 넣지 않고 여기에 넣어 코드의 중복을 줄일 수 있다. 생성자보다 먼저 수행된다.
        System.out.println("{ }");
    }

    public InitializationTest(){
        System.out.println("Constructor");
    }

    public static void main(String args[]){
        System.out.println("initializationTest1");
        InitializationTest initializationTest1 = new InitializationTest();

        System.out.println("initializationTest2");
        InitializationTest initializationTest2 = new InitializationTest();
    }
}
