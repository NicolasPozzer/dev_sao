package Modelo_Parcial.B;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();



        for(int i = 0; i < 150; i++){
            int num = 0;

            //numeros entre 10 y 30
            num = random.nextInt(30);
            System.out.print(num+ " ");
        }

    }
}
