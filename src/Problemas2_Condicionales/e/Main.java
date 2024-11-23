package Problemas2_Condicionales.e;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables globales
        int L = 0;

        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();


        //reglas primordiales no tener menos de 0 y mas de 99
        if(L >= 0 && L <= 99){

            //condiciones
            if(L >= 0 && L <= 3){
                System.out.println("BEBE");
            }
            else if (L >= 4 && L <= 14) {
                System.out.println("NINO");
            }
            else if (L >= 15 && L <= 18) {
                System.out.println("JOVEN");
            }
            else if (L >= 19 && L <= 65) {
                System.out.println("ADULTO");
            }
            else{
                System.out.println("ADULTO 3RA");
            }
        }

    }
}
