import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont=0;
		for(int i = 0; i<5; i ++) {
			int x = sc.nextInt();
			if(x%2==0) {
				cont++;
			}
			
		}
		System.out.println(cont + " valores pares");
	}

}

