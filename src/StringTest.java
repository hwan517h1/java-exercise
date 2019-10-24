public class StringTest {

    public static void printResult(boolean result) {
        if(result) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }

    public static void main(String[] args) {
        // String은 Reference type이나 Primitive type처럼 사용할 수 있는 특별한 class임
        String str1 = "Apple";
        String str2 = "Apple";

        // Reference type: class
        String str3 = new String("Apple");
        String str4 = new String("Apple");

        // Value
        System.out.println("1. Value");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        // 주소값: hashCode
        System.out.println("2. hashCode");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        // ==
        System.out.println("3. ==");
        printResult(str1 == str2);
        printResult(str2 == str3);
        printResult(str3 == str4);

        // equals(), equalsIgnoreCase()
        System.out.println("4. equals()");
        printResult(str1.equals(str2));
        printResult(str2.equals(str3));
        printResult(str2.equalsIgnoreCase(str3));

        // compareTo(). compareToIgnoreCase()
        System.out.println("5. compareTo()");
        printResult(str1.compareToIgnoreCase(str2) == 0);
        printResult(str2.compareToIgnoreCase(str3) == 0);

        // matches(regex)
        System.out.println("6. matches()");
        printResult(str2.matches(str3));
    }
}