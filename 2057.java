import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);
        int h = sc.nextInt() ;
        int v = sc.nextInt() ;
        int f = sc.nextInt() ;
        
        if (h == 0) {
        	h+=24;
        }
    int fim =(h + v + f);
        
        if(fim >24) {
        	int fi = (fim - 24);
        	System.out.println(fi);
        }else {
        
        if(fim == 24) {
        	
        	System.out.println("0");
        }else {
        
        System.out.println(fim);
        
    }
	}
}}
