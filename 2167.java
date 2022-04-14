import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
int Número = sc.nextInt();
int Rotação  = sc.nextInt();
int index = 0;
 for (int i = 1; i < Número ; i++) {
	 int Testes = sc.nextInt();
	 
	 if (Testes < Rotação && index == 0) {
	index= i + 1; 
	
	 
	 
	 }
	 Rotação = Testes;
	 }
System.out.println(index);
	}
	
	
	}
