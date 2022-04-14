import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		

		
		 int e = ((4* x)+ (y+y));
		
	
		 int r = ((2* x)+ (2*z));
		 
		
		 int t = ((2* y)+ (4*z));
		
			if(e <= r && e <= t) {
				System.out.println(e);
			}
			
			else {
		 
			if(r <= e && r <= t) {
				System.out.println(r);
			}
			
			else {
			if(t <= e && t <= r) {
				System.out.println(t);
			
			}
			
		}
		}
	}}
	
