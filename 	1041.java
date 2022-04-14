import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double X = sc.nextDouble();
		double Y = sc.nextDouble();

		if (X > 0.0 && Y < 0.0) {
			System.out.println("Q4");

		}
		if (X > 0.0 && Y > 0.0) {
			System.out.println("Q1");
		}
		if (X < 0.0 && Y > 0.0) {
			System.out.println("Q2");
		}
		if (X < 0.0 && Y < 0.0) {
			System.out.println("Q3");
		}
		if (X == 0.0 && Y == 0.0) {
			System.out.println("Origem");
		}
		if (X == 0.0 && Y != 0.0) {
			System.out.println("Eixo Y");
		}
		if (X != 0.0 && Y == 0.0) {
			System.out.println("Eixo X");
		}
	}
}
