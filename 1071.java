import java.util.Scanner;
public class Main{
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
	
	int X = sc.nextInt();
	int Y = sc.nextInt();
	int contsoma = 0;
	
	if(X < Y) {
	for (int i = X + 1; i < Y; i++) {
		if(i % 2 != 0) {
			contsoma+=1;
	}
	}
	}else {
		for (int i = Y + 1; i < X; i++) {
			if(i % 2 !=0) {
				contsoma+=i;
			}
		}
	}
	System.out.println(contsoma);
    }
}

