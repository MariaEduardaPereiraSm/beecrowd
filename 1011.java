import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner um = new Scanner(System.in);
	double raio = um.nextDouble();
	double TT = 3.14159;
	 double volume  = ( 4.0/3) * TT * raio * raio * raio;
	 System.out.printf("VOLUME = %.3f\n", volume);
}

}

