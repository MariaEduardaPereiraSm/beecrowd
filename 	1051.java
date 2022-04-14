import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salário = sc.nextDouble();

		if (salário <= 2000.00) {
			System.out.println("Isento");
		}

		if (salário > 2000.01 && salário <= 3000.00) {
			double x = salário - 2000.00;
			double isento = x * 0.08;

			System.out.printf("R$ %.2f\n", isento);

		}
		if (salário > 3000.01 && salário <= 4500.00) {
			double w = (salário - 2000.00);
			double y = w - 1000.00;
			w -= y;
			w = w * 0.08;
			y = y * 0.18;
			double ir = w + y;

			System.out.printf("R$ %.2f\n", ir);
		}
		if (salário > 4500.00) {
			double w = (salário - 2000.00);
			double y = w - 1000.00;
			double z = y - 1500.00;
			w -= y;
			y -= z;
			w = w * 0.08;
			y = y * 0.18;
			z = z * 0.28;
			double ir = w + y + z;

			System.out.printf("R$ %.2f\n", ir);
		}

	}

}

