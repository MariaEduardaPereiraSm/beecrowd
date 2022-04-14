import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 double A = sc.nextDouble();
	 double B =  sc.nextDouble();
	 double C = sc.nextDouble();
	 double delta= B*B - 4*A*C ;
	 double R1= (-B + Math.sqrt (delta))/(2*A);
	 double R2= (-B - Math.sqrt (delta))/(2*A);
	 if (delta>0 && A!=0) {
		 System.out.printf("R1 = %.5f\n", R1 );
		 System.out.printf("R2 = %.5f\n", R2 );
	 }
	 else {
		 System.out.println("Impossivel calcular");
	 }
	
}
}

