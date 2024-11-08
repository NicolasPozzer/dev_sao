package Problemas2_Condicionales.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        int N = 0;
        int vecesModificado = 0;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        if (1 <= N && N <= 1000) {

            if (N % 2 == 0) {
                N = N / 2;
                vecesModificado++;
            } else {
                N++;
                vecesModificado++;
            }


            if (N >= 100) {  // Tres o más cifras
                N = N / 100;
                vecesModificado++;
            } else if (N >= 10) {  // Exactamente dos cifras
                N = N / 10;
                vecesModificado++;
            }


            if (N % 3 == 0) {
                N = N - 1;
                vecesModificado++;
            }

            // Salida
            System.out.println(N + " " + vecesModificado);
        }
    }
}