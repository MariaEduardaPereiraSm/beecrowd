import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n ; i++) {
			int x = sc.nextInt();
			int cont =0;
			for(int m =1; m< x + 1;m++ ) {
			if (x % m == 0) {
				cont++;
			}}
			if (cont > 2) {
				System.out.println(x + " nao eh primo");
			}
			else {
				System.out.println(x + " eh primo");
			} }
		}
		
	}

