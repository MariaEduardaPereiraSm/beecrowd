import java.util.Scanner; 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[3];
		
		while (n != 4) {
			
			if(n >= 1 && n <=3) {
				v[n-1]++;
		}
			n = sc.nextInt();
	}
		System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + v[0]);
        System.out.println("Gasolina: " + v[1]);
        System.out.println("Diesel: " + v[2]);
}
}
