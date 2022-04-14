import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	int cont = 0;  
	double soma = 0.0;
	int idade = sc.nextInt();
	
	while (idade >=0) {
		cont ++;
		soma += idade;
		idade = sc.nextInt();
	}
	double media = (soma/cont);
	System.out.printf("%.2f\n" , media);
	
	}

}
