import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner um = new Scanner(System.in);
		int cont = 0;
		float total = 0;
		for (int i = 0; i < 6; i++) {
			float x = um.nextFloat();
			if (x > 0) {
				cont += 1;
				total += x;
			}
		}
		float media = total / cont;
		System.out.println(cont + " valores positivos");
		System.out.printf("%.1f\n", media);
	}
}

