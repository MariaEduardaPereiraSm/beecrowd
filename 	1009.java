import java.util.Scanner;

public class Main {
public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	String N = in.nextLine();
	double A = in.nextDouble();
    double B = in.nextDouble();
    double bonus = (B * 0.15) + A;
   System.out.printf("TOTAL = R$ %.2f\n", bonus);
 }

}
