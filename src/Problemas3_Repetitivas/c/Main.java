package Problemas3_Repetitivas.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        String numeroStr = Integer.toString(numero); // convertir a String
        int suma = 0;

        if(numero > 0){
            for (char digito : numeroStr.toCharArray()) { // Iterar sobre los caracteres
                suma += Character.getNumericValue(digito); // Convertir el carácter a número
            }
        }


        System.out.println(suma);
    }

}
