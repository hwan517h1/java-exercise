public class InitializationTest {
    static { // Initialization Block of Class
        System.out.println("static { }");
    }

    { // Initialization Block of Instance
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
