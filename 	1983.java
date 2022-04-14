import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Double maior= 0.0;
		int matricula = 0;

		for (int i = 0; i < n ; i++) {
			int codigo = sc.nextInt();
			Double nota = sc.nextDouble();
			if (nota > maior) {
				maior = nota;
				matricula = codigo;
			}
		}
		if (maior < 8.0) {
			System.out.println("Minimum note not reached");
		} else {
			System.out.println(matricula);

		}
	}
}
