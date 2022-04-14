import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int n = sc.nextInt();
				int x;

		for (int i = 0; i < n; i++) {
			s = sc.next();
			x = sc.nextInt();

			if(s.equals("Thor")) System.out.println("Y");
			else System.out.println("N");
		}
	}
	
}

