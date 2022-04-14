import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			int x = sc.nextInt();

			int v = sc.nextInt();
			int maior = v;
			for (int i = 0; i < x - 1; i++) {

				v = sc.nextInt();
				if (v > maior) {
					maior = v;
				}
			}

				if (maior < 10) {
					System.out.println("1");
				}

				if (maior >= 10 && maior < 20) {
					System.out.println("2");
				}

				if (maior >= 20) {
					System.out.println("3");
				}
			}

		}
	}

