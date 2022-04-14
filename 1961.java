import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diferenca = 0;
		int altura = sc.nextInt();
		int x = sc.nextInt();
		ArrayList<Integer> X = new ArrayList<Integer>();
		for (int i = 0; i < x; i++) {
			int pulos = sc.nextInt();
			X.add(pulos);
		}
		boolean ganhou = true;
		for (int i = 1; i < x; i++) {
			diferenca = X.get(i) - X.get(i - 1);

			if (diferenca > altura || -diferenca > altura) {
				ganhou = false;
				
			}
			
		}
		if ( ganhou) {
			System.out.println("YOU WIN");
			
		}else {
			System.out.println("GAME OVER");
		}
	}
}

