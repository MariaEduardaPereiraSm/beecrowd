import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int IN = 0;
		int OUT = 0;

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();

			if (x >= 10 && x <= 20) {
				IN++;
			} else {
				OUT++;
			}

		}
		System.out.println(IN + " in");
		System.out.println(OUT + " out");
	}
}
