package Problemas3_Repetitivas.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N = 0;
        int num = 0;
        int mayor = 0;

        Scanner teclado = new Scanner(System.in);
        N = teclado.nextInt();

        if(N >= 0){
            for (int i = 0; i < N; i++) {
                num = teclado.nextInt();
                if(num > mayor){
                    mayor = num;
                }
            }
            System.out.println(mayor);
        }
    }

}
