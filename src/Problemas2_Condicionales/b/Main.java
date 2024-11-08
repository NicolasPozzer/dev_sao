package Problemas2_Condicionales.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        int A = 0;
        int B = 0;
        int C = 0;

        Scanner teclado = new Scanner(System.in);
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();


        if((A <= B && B < C) || (C >= B && B > A)){
            System.out.println("C");
        }
        else if ((A >= B && B > C) || (C <= B && B < A)) {
            System.out.println("D");
        }
        else if (A == B && B == C)  {
            System.out.println("I");
        }else{
            System.out.println("X");
        }


    }
}
