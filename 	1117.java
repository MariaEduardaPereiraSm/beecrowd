import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner um = new Scanner(System.in);

		float num;
		float media = 0;
		float total = 0;
		float quantnum = 0;

		while (quantnum != 2) {
			num = um.nextFloat();
			if (num >= 0.0 && num <= 10) {
				total += num;
				quantnum += 1;
			} else {
				System.out.println("nota invalida");
			}
		}

		media = total / 2;

		System.out.printf("media = %.2f\n", media);
	}
}
