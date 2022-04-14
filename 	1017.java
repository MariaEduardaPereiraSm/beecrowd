import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner um = new Scanner(System.in);
		int Tempo = um.nextInt();
		int velocidade = um.nextInt();
		double distância = velocidade * Tempo;
		double litros = distância / 12;
		System.out.printf("%.3f\n", litros);

	}

}

