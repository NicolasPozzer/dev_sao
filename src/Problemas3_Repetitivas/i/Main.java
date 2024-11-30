package Problemas3_Repetitivas.i;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();
        int M = teclado.nextInt();

        char [][] matriz = new char[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = '*';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
