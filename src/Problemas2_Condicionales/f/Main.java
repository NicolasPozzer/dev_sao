package Problemas2_Condicionales.f;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables globales
        int a = 0;
        int b = 0;
        int c = 0;

        //scanners
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        //ascenso
        if(a<b && b<c){
            System.out.println("ascenso");
        }

        //descenso
        else if(a>b && b>c){
            System.out.println("descenso");
        }

        //pico
        else if (a<b && b>c){
            System.out.println("pico");
        }

        //abismo
        else{
            System.out.println("abismo");
        }
    }
}
