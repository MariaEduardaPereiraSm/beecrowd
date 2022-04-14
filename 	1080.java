import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
int maior =0;
int posição=0;
	for(int i =0; i <100; i++) {
		int x = sc.nextInt();
		
		if(x> maior) {
			maior =x;
			 posição=i+1;
		}
	}
	 System.out.println(maior);
		System.out.println(posição);
		
}
}

