package Problemas3_Repetitivas.j;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // leer altura de piramide
        int n = teclado.nextInt();

        // Generar la pirámide
        for (int i = 1; i <= n; i++) {
            //espacios iniciales
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
