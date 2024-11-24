package Problemas3_Repetitivas.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n = 1;
        int acum = 0;

        Scanner teclado = new Scanner(System.in);

        while (n != 0) {

            n = teclado.nextInt();
            acum = acum + n;
        }
        //mostrar resultado
        System.out.println(acum);
    }

}
