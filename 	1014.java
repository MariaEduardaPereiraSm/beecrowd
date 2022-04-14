import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner um = new Scanner(System.in);
	int X = um.nextInt();
	double Y = um.nextDouble();
	double consumo = X/Y;
	System.out.printf("%.3f km/l\n", consumo);
 }

}

