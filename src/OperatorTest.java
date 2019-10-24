public class OperatorTest {

    public static void main(String[] args) {
		int i = 1;
		System.out.println("> Prefix");
		int j = ++i; // Prefix는 증가 후 할당됨
		System.out.println("i: " + i + ", j: " + j);

		i = 1;
		System.out.println("> Postfix");
		j = i++; // Postfix는 할당 후 증가
		System.out.println("i: " + i + ", j: " + j);
	}
}
