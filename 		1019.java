import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner um = new Scanner(System.in);
		int x = um.nextInt();
		
		int horas = x/3600;
		int segundosSobrando = x%3600;
		int min = segundosSobrando/60;
		segundosSobrando = (segundosSobrando%60); 
		int seg =segundosSobrando;
		System.out.println(horas+":"+min+":"+seg);
	}

}

