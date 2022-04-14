import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	double A = in.nextDouble();
	double B = in.nextDouble();
	double C = in.nextDouble();
	double media = ((A * 2) + (B * 3) + (C * 5)) / 10;
	System.out.printf("MEDIA = %.1f\n" , media);
	}

}
