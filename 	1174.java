import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
 
     ArrayList<Double> lista = new ArrayList<Double>();

       for(int i = 0; i < 100; i++) {
   
       double numero = sc.nextDouble();
       lista.add(numero);
       
       if(numero <= 10) {
       
    	    System.out.printf("A[" + i + "] = " + "%.1f\n", numero);
       
       
       }


}
}
}
