//Fibonacci para Java 

public class fibonacci {

	public static int fibonacci(int termos) {
		long a = 0;
		long b = 1;
		long ac = 0;
		for (int i = 1; i <= termos; i++) {
			System.out.println(a);
			ac = a + b;
			a = b;
			b = ac;
		}
		return 0;
	}

	public static void main(String args[]) {
		fibonacci(64);
	}
}
