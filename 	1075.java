import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int n = sc.nextInt();
		for (i = 0; i <= 10000; i++) {
			if (i % n == 2) {
				System.out.println(i);
			}
		}

	}

}

