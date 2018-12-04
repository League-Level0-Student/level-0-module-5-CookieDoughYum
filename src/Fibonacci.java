
public class Fibonacci {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		for (int i = 0; i < 13; i++) {
			System.out.println(n1);
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;

		}
	}
}
