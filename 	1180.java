import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        int n,min = 0,tmpmMin = 0, position = 0;
        boolean checkFirst = false;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            tmpmMin = array[j];
            if (checkFirst == false) {
                min = tmpmMin;
                checkFirst = true;
            }

            if (tmpmMin < min) {
               min = tmpmMin;
                position = j;

            }

        }

        System.out.print("Menor valor: "+min+"\nPosicao: "+position+"\n");

    }
}
