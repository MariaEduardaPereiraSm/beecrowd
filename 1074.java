import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int números = sc.nextInt();
			if (números%2 == 0 && números > 0) {
				System.out.println("EVEN POSITIVE");
			}
			if (números%2!= 0 && números > 0) {
				System.out.println("ODD POSITIVE");
			}
			if (números%2 == 0 && números < 0) {
				System.out.println("EVEN NEGATIVE");
			}
			if (números%2!= 0 && números < 0) {
				System.out.println("ODD NEGATIVE");
			}
			if (números == 0) {
				System.out.println("NULL");
			}
		}
	}
}
