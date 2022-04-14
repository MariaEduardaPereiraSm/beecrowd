import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int inicial = sc.nextInt();
	int fina = sc.nextInt();
	if(inicial>fina) {
	int conta = 24-inicial;
	int x = conta + fina;
	System.out.println("O JOGO DUROU " + x + " HORA(S)");
	}
	else if(inicial<fina) {
		int conta = fina - inicial;
		System.out.println("O JOGO DUROU " + conta + " HORA(S)");
	}
	else if(fina==inicial) {
		System.out.println("O JOGO DUROU " + 24 + " HORA(S)");
	}
}
}

