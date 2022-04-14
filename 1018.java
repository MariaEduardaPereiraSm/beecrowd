import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner um = new Scanner(System.in);
		int N = um.nextInt();
		int cem = N / 100;
		int ck = ((N % 100) / 50);
		int vk = ((N % 100) % 50) / 20;
		int dk = (((N % 100) % 50) % 20 / 10);
		int cck = (((N % 100) % 50) % 20 % 10) / 5;
		int ddk = ((((N % 100) % 50) % 20 % 10) % 5) / 2;
		int uk = (((((N % 100) % 50) % 20 % 10) % 5) % 2) / 1;

		System.out.println(N);
		System.out.println(cem + " nota(s) de R$ 100,00");
		System.out.println(ck + " nota(s) de R$ 50,00");
		System.out.println(vk + " nota(s) de R$ 20,00");
		System.out.println(dk + " nota(s) de R$ 10,00");
		System.out.println(cck + " nota(s) de R$ 5,00");
		System.out.println(ddk + " nota(s) de R$ 2,00");
		System.out.println(uk + " nota(s) de R$ 1,00");
	}

}

