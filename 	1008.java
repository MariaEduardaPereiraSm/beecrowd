import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	int A = in.nextInt();
	double B = in.nextDouble();
    double C = in.nextDouble();
    double D = B * C ;
    System.out.println("NUMBER = " + A);
    System.out.printf("SALARY = U$ %.2f\n" ,  D);
  }

}

