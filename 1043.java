import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float A = sc.nextFloat();
	float B = sc.nextFloat();
	float C = sc.nextFloat();
	
	if( (A < (B + C)) && (B< (A+C )) && (C < (A+B))) {
		Float p = A+B+C;
		System.out.printf("Perimetro = %.1f\n",p);
	}
	else {
		Float a = ((A+B)*C)/2;
		System.out.printf("Area = %.1f\n",a);
	}
	
}
}

