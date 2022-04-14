 import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
	int soma = 0;
	int n = sc.nextInt();
	for( int i =0;i< 5; i ++) {
		int x= sc.nextInt();
		if(x == n) {
			soma ++;
		}
	}
	System.out.println(soma);
}}
