import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float N1 = sc.nextFloat();
		float N2 = sc.nextFloat();
		float N3 = sc.nextFloat();
		float N4 = sc.nextFloat();

		float média = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
		
		if (média >= 7.0) {
			System.out.printf("Media: %.1f\n", média);
			System.out.println("Aluno aprovado.");
		}

		else if (média >= 5.0 && média <= 6.9) {
			System.out.printf("Media: %.1f\n", média);
			System.out.println("Aluno em exame.");

			float notadoexame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f\n", notadoexame);

			float recalculeamedia = (média + notadoexame) / 2;
			
			if (recalculeamedia >= 5.0) {
				System.out.println("Aluno aprovado.");
			}
			else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", recalculeamedia);

		}
		if (média < 5.0) {
			System.out.printf("Media: %.1f\n", média);
			System.out.println("Aluno reprovado.");
		}
		
	}
}
