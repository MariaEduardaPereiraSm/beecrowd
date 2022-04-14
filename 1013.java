import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner um = new Scanner(System.in);
	int A = um.nextInt();
	int B = um.nextInt();
	int C = um.nextInt();
	 
	int AB = (A + B + Math.abs(A - B))/2;
	int ABC = (AB + C + Math.abs(AB - C))/2;
	
	System.out.println(ABC + " eh o maior");
}
}

