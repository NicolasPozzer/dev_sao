package Extras.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double precio;
        int cantidadNegocios; // para el for
        Double menorPrecio = 0.00;
        int negocioMasBarato = 0;
        double menor = 9999999.0F;

        Scanner teclado= new Scanner(System.in);

        //System.out.println("ingresé la cantidad de negocios que recorrió: ");
        cantidadNegocios = teclado.nextInt();


        for(int i=1; i <= cantidadNegocios; i++){

            //System.out.println("ingresé el precio del producto: ");
            precio = teclado.nextDouble();

            if(precio < menor){
                menor = precio;
                negocioMasBarato = i;
            }
        }

        System.out.println(negocioMasBarato);
        System.out.printf("%.2f%n", menor);

    }
}