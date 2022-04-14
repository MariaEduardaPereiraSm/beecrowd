import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int casodetestes = sc.nextInt();
	for(int i =0; i < casodetestes; i++) {
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		if(y==0) {
			System.out.println("divisao impossivel");
		
		}
		else {
		double divisão = x/y;
		System.out.println( divisão);
		
		
	}
}
}}

