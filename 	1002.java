import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	Scanner in = new Scanner (System.in);
	double Raio = in.nextDouble();
	
	double A = 3.14159 * (Raio * Raio);
	System.out.printf("A=%.4f\n", A);
}
}
