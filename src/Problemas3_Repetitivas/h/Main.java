package Problemas3_Repetitivas.h;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        long N = teclado.nextLong();

        if (N == 0) {
            System.out.println(0);
            return;
        }

        //calcular ciclos completos y terminosd restantes
        long ciclosCompletos = N / 3;
        long restantes = N % 3;

        //suma inicial basada en ciclos completos
        long suma = ciclosCompletos * 6;

        // Sumar los términos restantes
        for (int i = 1; i <= restantes; i++) {
            suma += i;
        }

        //mostrar el resultado
        System.out.println(suma);
    }
}
