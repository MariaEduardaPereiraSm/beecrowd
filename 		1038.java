import java.util.Scanner;

public class Main { public static void main(String[] args) {
	
	Scanner oi = new Scanner(System.in);
	int A = oi.nextInt();
	int B = oi.nextInt();
	
	if (A == 1) {
		float preço = (float)(4.00 * B);
		System.out.printf("Total: R$ %.2f\n" , preço);
	} else if (A == 2) {
		float preço = (float)(4.50 * B);
	    System.out.printf("Total: R$ %.2f\n" , preço);
	} else if (A == 3) {
		float preço = (float)(5.00 * B);
		System.out.printf("Total: R$ %.2f\n" , preço);
	} else if (A == 4) {
 		float preço = (float)(2.00 * B);
 		System.out.printf("Total: R$ %.2f\n" , preço);
	} else if (A == 5) {
		float preço = (float)(1.50 * B);
		System.out.printf("Total: R$ %.2f\n" , preço);
	}
}

}

