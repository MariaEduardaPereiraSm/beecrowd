import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hi = sc.nextInt();
		int mi = sc.nextInt();
		int hf = sc.nextInt();
		int mf = sc.nextInt();
		if (hi == hf && mi == mf) {
			System.out.println("O JOGO DUROU " + 24 + " HORA(S) E " + 0 + " MINUTO(S)");
		}
		else if (hi <= hf) {
			int hh = hf - hi;
			if (mi <= mf) {
				int m = mf - mi;
				System.out.println("O JOGO DUROU " + hh + " HORA(S) E " + m + " MINUTO(S)");
			}
			if (mi > mf) {
				int m = 60 - mi;
				int mm = m + mf;
				hh--;
				System.out.println("O JOGO DUROU " + hh + " HORA(S) E " + mm + " MINUTO(S)");
			}
		}

		if (hi > hf) {
			int h = 24 - hi;
			int hh = h + hf;
			if (mi <= mf) {
				int m = mf - mi;
				System.out.println("O JOGO DUROU " + hh + " HORA(S) E " + m + " MINUTO(S)");
			}
			if (mi > mf) {
				int m = 60 - mi;
				int mm = m + mf;
				hh--;
				System.out.println("O JOGO DUROU " + hh + " HORA(S) E " + mm + " MINUTO(S)");
			}
		}
		

	}
}

