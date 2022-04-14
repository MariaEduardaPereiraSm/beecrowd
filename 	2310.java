import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Njogadores = sc.nextInt();
		double total1 = 0.0;
		double total2 = 0.0;
		double total3 = 0.0;
		int acertos1 = 0;
		int acertos2 = 0;
		int acertos3 = 0;

		for (int i = 0; i < Njogadores; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			total1 += sc.nextInt();
			total2 += sc.nextInt();
			int tentativa3 = sc.nextInt();
			total3 += tentativa3;
			int acerto1 = sc.nextInt();
			acertos1 += acerto1;
			int acerto2 = sc.nextInt();
			acertos2 += acerto2;
			int acerto3 = sc.nextInt();
			acertos3 += acerto3;

		}
		System.out.printf("Pontos de Saque: %.2f", (acertos1 / total1) * 100.0);
		System.out.println(" %.");
		System.out.printf("Pontos de Bloqueio: %.2f", (acertos2 / total2) * 100.0);
		System.out.println(" %.");
		System.out.printf("Pontos de Ataque: %.2f", (acertos3 / total3) * 100.0);
		System.out.println(" %.");

	}

}

