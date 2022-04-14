import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
int X;
int Y;
	do {
		 X = sc.nextInt();
		 Y = sc.nextInt();
		if(X>Y) {
			System.out.println("Decrescente");
		}
		else if (X<Y) {
			System.out.println("Crescente");
		} 
	}while(X!=Y);
}
}
