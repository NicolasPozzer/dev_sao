package Problemas1.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declaracion de variables
        float x;
        float y;
        float z;

        float numerador;
        float denominador;
        float resultadoFinal;

        Scanner teclado = new Scanner(System.in);
        x = teclado.nextFloat();
        y = teclado.nextFloat();
        z = teclado.nextFloat();

        numerador = x + x * (y + (z * z));
        denominador = (float) ((x + Math.PI) * (y + Math.PI));

        resultadoFinal = numerador / denominador;

        System.out.println(resultadoFinal);

    }
}