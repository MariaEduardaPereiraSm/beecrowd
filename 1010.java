import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner um = new Scanner(System.in);
	int codigo1 = um.nextInt();
	int quantidade1 = um.nextInt();
	double preço1 = um.nextDouble();
	
	int codigo2 = um.nextInt();
	int quantidade2 = um.nextInt();
	double preço2 = um.nextDouble();
	
	double valorapagar = (quantidade1 * preço1) + (quantidade2 * preço2);
	System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorapagar);
 }

}
