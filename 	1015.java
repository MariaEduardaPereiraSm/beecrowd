import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner um = new Scanner(System.in);
	float x1 = um.nextFloat();
	float y1 = um.nextFloat();
	float x2 = um.nextFloat();
	float y2 = um.nextFloat();
    double m1 = Math.pow(x2- x1,2);
	double m2 = Math.pow(y2 - y1,2);
	double distancia = Math.sqrt(m1 + m2);
			
	System.out.printf("%.4f\n" , distancia);
		
}
}
