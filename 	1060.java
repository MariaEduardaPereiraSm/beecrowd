import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner um = new Scanner(System.in);
		int cont = 0;
		for (int i = 0; i < 6; i++) {
			 double x = um.nextDouble();
			if (x > 0) {
				cont++;
			}}
			System.out.println(cont + " valores positivos");
		}
	}


