package Problemas3_Repetitivas.g;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n = 0;

        n = teclado.nextInt();


        //condicional antes que nada
        if(n >= 1){
            //repetir mientras sea menor a 100
            while (n < 100){

                if(n % 2 == 0){
                    n = n + 3;
                }else {
                    n = n * 2;
                }

            }
        }

        System.out.println(n);
    }
}
