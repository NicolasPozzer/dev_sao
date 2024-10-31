package Extras.d;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int A = 0;
        int B = 0;
        int C = 0;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();

        int contarMultiplo = 0;

        for(int x = A; x <= B; x++){
            if(x % C == 0){
                contarMultiplo = contarMultiplo + 1;
            }
        }

        System.out.println(contarMultiplo);

    }
}
