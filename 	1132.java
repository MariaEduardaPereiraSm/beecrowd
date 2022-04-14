import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner um = new Scanner(System.in);
		int x = um.nextInt();
		int y = um.nextInt();
        int cont = 0;
        int i;
        if (x < y) {
        	for(i = x; i <= y; i++)  {
        if (i %13 != 0) {
        	cont += i;
        
        }}
        }	else {
        	for(i = y; i <=x; i++) {
        		if(i%13 != 0)
        			cont += i;
        	}
        		
        } System.out.println(cont);}
        	
         
	}

