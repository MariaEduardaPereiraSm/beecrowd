import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = 0;
do {
	x = sc.nextInt();
	if(x == 2002){
		System.out.println("Acesso Permitido");
	}
	else {
		System.out.println("Senha Invalida");
	}
		
}while(x != 2002);
}}
