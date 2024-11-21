package Problemas2_Condicionales.d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables globales
        int A = 0;
        int B = 0;
        int suma = 0;

        //scanner
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        suma = A + B;

        // SI
        if(suma == 5){
            B = B + 3;
            System.out.println(2* A + B);
        }else{ //SI NO
            // variable local para luego calcular si es par
            int esPar = 0;
            A = A - 1;

            esPar = 7 * A + B;
            if(esPar % 2 == 0){
                System.out.println(A - B);
            }else{
                System.out.println(A * B);
            }
        }

    }
}
