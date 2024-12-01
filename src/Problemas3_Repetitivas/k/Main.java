package Problemas3_Repetitivas.k;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n = 0;

        //min y maximo
        int min = 999;
        int contMin = 0;

        int max = 0;
        int contMax = 0;

        int cont = 0;
        int acum = 0;
        double promedio = 0.00;

        //while para repetir hasta q sea -1
        while(n != -1){

            n = teclado.nextInt();

            if(n != -1){

                cont = cont + 1;
                acum = acum + n;


                //obtener minimo
                if(n == min){
                    contMin = contMin + 1;
                }
                if(n < min){
                    contMin = 1;
                    min = n;
                }


                //obtener maximo
                if(n == max){
                    contMax = contMax + 1;
                }
                if(n > max){
                    contMax = 1;
                    max = n;
                }


            }
        }

        //si es par
        if(cont % 2 == 0){
            promedio = (double) acum / cont;
            System.out.printf("\n" + "%.2f%n", promedio);
            System.out.println(contMax);
        }else{
            System.out.println(max - min);
            System.out.println(contMin);
        }
    }
}
