import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String X = sc.nextLine();
		String Y = sc.nextLine();
		String Z = sc.nextLine();
		
		if (X.equals("vertebrado") & Y.equals( "ave") & Z.equals( "carnivoro")) {
			System.out.println("aguia");
		}
		if (X.equals( "vertebrado") & Y.equals("ave") & Z.equals( "onivoro")) {
			System.out.println("pomba");
		}
		if (X.equals( "vertebrado") & Y.equals ("mamifero") & Z.equals( "onivoro")) {
			System.out.println("homem");
		}
		if (X.equals( "vertebrado") & Y.equals( "mamifero") & Z.equals( "herbivoro")) {
			System.out.println("vaca");
		}
		if (X.equals( "invertebrado") & Y.equals("inseto") & Z.equals( "hematofago")) {
			System.out.println("pulga");
		}
		if (X.equals( "invertebrado") & Y.equals("inseto") & Z.equals( "herbivoro")) {
			System.out.println("lagarta");
		}
		if (X.equals("invertebrado" ) & Y.equals( "anelideo" ) & Z.equals( "hematofago") ){
			System.out.println("sanguessuga");
		}
		if (X.equals("invertebrado") & Y.equals( "anelideo") & Z.equals("onivoro")) {
			System.out.println("minhoca");
		}
	}

}
