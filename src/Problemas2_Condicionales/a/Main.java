package Problemas2_Condicionales.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();

        int salida = -1;

        if(A < B && B < C){
            salida = 0;
        }

        else if (A > B && B > C && C < A){
            salida = 1;
        }

        else if(A > B && B < C && C < A){
            salida = 2;
        }

        else if (A > B && B < C && C > A){
            salida = 1;
        }

        else if (A < B && B > C  && C < A){
            salida = 2;
        }

        else if (A < B && B > C && C > A){
            salida = 1;
        }


        System.out.println(salida);
    }
}
