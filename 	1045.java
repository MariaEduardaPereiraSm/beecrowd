import java.util.Scanner;
import java.text.BreakIterator;

public class Main {
public static void main(String[] args) {
	
	   Scanner sc =new Scanner(System.in);
	   double  A = sc.nextDouble();
	  double  B = sc.nextDouble();
	    double C = sc.nextDouble();
	   double tA = Math.max(A, Math.max(B, C));
	   double tB = 0;
	   double tC = 0;
	   
	   if (tA == A) {
	    tB =Math.max(B, C);
	    tC =Math.min(B, C);
	   }
	   if (tA == B) {
	    tB =Math.max(A, C);
	    tC =Math.min(A, C);
	   }
	   if (tA == C) {
	    tB =Math.max(B, A);
	    tC =Math.min(B, A);
	   }
	   //------------------------------
	   if (tA >= (tB + tC)) {
	    System.out.print("NAO FORMA TRIANGULO\n");
	    
	   }else if (tA*tA > ((tB*tB)+(tC*tC))) {
	    System.out.print("TRIANGULO OBTUSANGULO\n");
	   }
	   if (tA*tA == ((tB*tB)+(tC*tC))) {
	    System.out.print("TRIANGULO RETANGULO\n");
	   }

	   if (tA*tA < ((tB*tB)+(tC*tC))) {
	    System.out.print("TRIANGULO ACUTANGULO\n");
	   }
	   if ((tA == tB) &&(tA == tC)) {
	    System.out.print("TRIANGULO EQUILATERO\n");
	   }
	   if (((tA == tB) &&(tA != tC)) || ((tA == tC) &&(tA != tB)) || ((tB == tC) &&(tB != tA)) ) {
	    System.out.print("TRIANGULO ISOSCELES\n");
	   }
	  
	     }
	  
	 
	
}


