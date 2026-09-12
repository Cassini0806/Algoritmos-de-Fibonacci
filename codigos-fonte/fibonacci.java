//Fibonacci para Java 

public class fibonacci {

	public class elementos {
		long a;
		long b;
		long ac;
	}

	public static int fibonacci(int termos) {
		a = 0;
		b = 1;
		ac = 0;
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
