import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contpar = 0;
		int contímpar = 0;
		int contnegativo = 0;
		int contpositivo = 0;
		for(int i = 0; i<5; i++) {
			int x = sc.nextInt();
			if(x>0) {
				contpositivo++;
			}
			if(x<0) {
				contnegativo++;
			}
           if(x%2==0) {
        	   contpar++;
           }
           if(x%2!=0) {
        	   contímpar++;
           }}
       System.out.println( contpar + " valor(es) par(es)");
           System.out.println(contímpar + " valor(es) impar(es)");
           System.out.println(contpositivo + " valor(es) positivo(s)");
           System.out.println(contnegativo + " valor(es) negativo(s)");
           
           
           
           
		}
	}
