import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner um = new Scanner(System.in);
		int idade = um.nextInt();
		int idadeemdias;
		int idadeemanos;
		int idadeemmeses;
		
		idadeemanos = idade/365;
		idadeemmeses = (idade%365)/30;
		idadeemdias = (idade%365)%30;
		System.out.println(idadeemanos + " ano(s)");
		System.out.println(idadeemmeses + " mes(es)");
		System.out.println(idadeemdias + " dia(s)");
	}
}

