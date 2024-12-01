package Problemas3_Repetitivas.l;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int A = 0;
        int B = 0;
        int C = 0;

        //contador de multiplos
        int cont = 0;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();


        if (A <= B && C > 0) {
            for (int i = A; i <= B; i++) {
                if (i % C == 0) {
                    cont = cont + 1;
                }
            }
            System.out.println(cont);
        }else{
            System.out.println(0);
        }

    }
}
