import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner um = new Scanner(System.in);
	double A = um.nextDouble();
	double B = um.nextDouble();
	double C = um.nextDouble();
	double pi = 3.14159;
	
	double áreatriangulo = (A * C)/2;
	System.out.printf("TRIANGULO: %.3f\n", áreatriangulo);
	double áreacirculo = (pi * C * C);
	System.out.printf("CIRCULO: %.3f\n", áreacirculo);
	double áreatrapezio = ((A + B)/2) * C;
	System.out.printf("TRAPEZIO: %.3f\n", áreatrapezio);
	double áreaquadrado = B * B;
	System.out.printf("QUADRADO: %.3f\n", áreaquadrado);
	double árearetangulo = (A * B);
	System.out.printf("RETANGULO: %.3f\n", árearetangulo);
 }

}

