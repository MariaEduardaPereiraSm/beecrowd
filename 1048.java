import java.util.Scanner;

	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double salário = sc.nextDouble();
			
			if (salário > 0.00 && salário <= 400.00) {
				double aumento = ((salário * 0.15) + salário);
				System.out.printf("Novo salario: %.2f\n", aumento);
				double reajuste = (salário * 0.15);
				System.out.printf("Reajuste ganho: %.2f\n", reajuste);
				System.out.println("Em percentual: 15 %");
			}
			if(salário >=400.01 && salário <=800.00) {
				double aumento = ((salário * 0.12) + salário);
				System.out.printf("Novo salario: %.2f\n", aumento);
				double reajuste = (salário * 0.12);
				System.out.printf("Reajuste ganho: %.2f\n", reajuste);
				System.out.println("Em percentual: 12 %");
			}
			if(salário >= 800.01 && salário <= 1200.00) {
				double aumento = ((salário *0.1) + salário);
				System.out.printf("Novo salario: %.2f\n", aumento);
				double reajuste = (salário * 0.1);
				System.out.printf("Reajuste ganho: %.2f\n", reajuste);
				System.out.println("Em percentual: 10 %");
			}
			if(salário>= 1200.01 && salário <=2000.00) {
				double aumento = ((salário * 0.07)  + salário);
				System.out.printf("Novo salario: %.2f\n", aumento);
				double reajuste = (salário * 0.07);
				System.out.printf("Reajuste ganho: %.2f\n", reajuste);
				System.out.println("Em percentual: 7 %");
			}
			if(salário > 2000.00) {
				double aumento = ((salário * 0.04) + salário);
				System.out.printf("Novo salario: %.2f\n", aumento);
				double reajuste = (salário * 0.04);
				System.out.printf("Reajuste ganho: %.2f\n", reajuste);
				System.out.println("Em percentual: 4 %");
			}
			
		}
	
}

