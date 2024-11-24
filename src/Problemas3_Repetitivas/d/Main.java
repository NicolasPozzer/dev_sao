package Problemas3_Repetitivas.d;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.close();

        // patrón base
        int[] patron = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        StringBuilder resultado = new StringBuilder();

        if(n <= 1000){
            // Generar la secuencia como una cadena continua
            for (int i = 0; i < n; i++) {
                resultado.append(patron[i % patron.length]); // Concatenar sin espacios
                resultado = new StringBuilder(resultado.toString() + " ");
            }
        }


        // Imprimir el resultado como número
        System.out.println(resultado);
    }
}
