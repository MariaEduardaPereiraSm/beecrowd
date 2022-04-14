import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int A = sc.nextInt();
			if (A == 0) {
				System.out.println("vai ter copa!");
			} else if (A >= 1) {
				System.out.println("vai ter duas!");
			}
		}
	}

}

