import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for (int i = 2; i <= n;i +=2) {
		int quadrado = (i * i);
		System.out.println(i+ "^2 " +"= "+ quadrado);
		
	}
}}
	 
