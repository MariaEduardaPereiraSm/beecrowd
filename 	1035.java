import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner um = new Scanner(System.in);
			int A = um.nextInt();
			int B = um.nextInt();
			int C = um.nextInt();
			int D = um.nextInt();

			if ( B > C && D > A && (C + D) > (A + B) && C >= 0 && D >= 0 && A %2 == 0) {
				System.out.println("Valores aceitos");
			} else {
				System.out.println("Valores nao aceitos");

			}
		}
	}


