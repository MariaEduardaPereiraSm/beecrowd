import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner um = new Scanner(System.in);
		while (um.hasNext()) {
		int x = um.nextInt();
		int y = um.nextInt();
		
		if ((x > 0) && (y > 0)) {
				System.out.println("primeiro");
			} else if ((x < 0) && (y > 0)) {
				System.out.println("segundo");
			} else if ((x < 0) && (y < 0)) {
				System.out.println("terceiro");
			} else if ((x > 0) && (y < 0)) {
				System.out.println("quarto");
			}

		}
	}
}

