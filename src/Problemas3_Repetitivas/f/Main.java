package Problemas3_Repetitivas.f;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //obtener: minimo, maximo y promedio con 2 dec..
        Scanner teclado = new Scanner(System.in);

        int cantNumeros = 0;
        int n = 0;

        int max = -100;
        int min = 100;

        //sacar prom
        int acum = 0;
        double promedio = 0.00;


        cantNumeros = teclado.nextInt();

        for (int i = 0; i < cantNumeros; i++){
            n = teclado.nextInt();
            acum = acum + n;

            if(n > max){
                max = n;
            }
            if(n < min){
                min = n;
            }
        }

        promedio = (double) acum / cantNumeros;

        //mostrar por pantalla
        System.out.printf("\n" + min + " " + max + " " + "%.2f%n", promedio);
    }
}
