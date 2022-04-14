import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int Inter = 0;
	int Gremio = 0;
	int Empates = 0;
	int grenais = 0;
	int grenal = 0;
	do{
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x>y) {
	
		Inter ++;
	}else{
		Gremio ++;
	}
	if(x==y) {
		Empates++;
	}
	System.out.println("Novo grenal (1-sim 2-nao)");
	grenal = sc.nextInt();
	grenais++;
} while (grenal == 1);
	
	System.out.println(grenais + " grenais");
	System.out.println("Inter:" + Inter);
	System.out.println("Gremio:"+ Gremio);
	System.out.println("Empates:"+ Empates);
	if(Gremio > Inter){
System.out.println("Gremio venceu mais");

	}else {
		System.out.println("Inter venceu mais");

	}
}
}
