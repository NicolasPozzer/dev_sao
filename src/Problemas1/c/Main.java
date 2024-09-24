package Problemas1.c; // Borrar a la hora de subir a omegaUp

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  Variables
        float numeroInicial = 3.1F;
        float suma;
        float tercio;

        //  Entrada
        Scanner teclado = new Scanner(System.in);
        numeroInicial = teclado.nextFloat();


        //  Calculos
        System.out.printf("%.6f%n", numeroInicial);
        suma = numeroInicial + 5;
        System.out.printf("%.6f%n", suma);
        suma = suma * suma;
        System.out.printf("%.6f%n", suma);

        tercio = (float) (numeroInicial * 0.33333333);
        suma = suma / tercio;
        System.out.printf("%.6f%n", suma);

        suma = suma * (suma * suma);
        System.out.printf("%.6f%n", suma);


    }
}