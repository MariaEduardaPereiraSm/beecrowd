import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		double valor = x.nextDouble();
		double[] notas = { 100, 50, 20, 10, 5, 2 };
		double[] moedas = { 1, 0.5, 0.25, 0.1, 0.05, 0.01 };
		System.out.println("NOTAS:");
		valor += 0.001;
		for (double i : notas) {
			int c = 0;
			while (valor - i >= 0) {
				valor -= i;
				c++;
			}
			System.out.printf(c + " nota(s) de R$ %.2f\n", i);
		}
		System.out.println("MOEDAS:");
		for (double i : moedas) {
			int c = 0;
			while (valor - i >= 0) {
				valor -= i;
				c++;
			}
			System.out.printf(c + " moeda(s) de R$ %.2f\n", i);
		}
	}
}

