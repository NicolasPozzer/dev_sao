package Modelo_Parcial.C;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int tecnicos = 3;
        int servicios = 4;

        int [] costos = {2500, 5000, 10000, 15000};
        int [][] matriz = new int [tecnicos][servicios];

        //cargar
        for(int i = 0; i < tecnicos; i++) {
            for(int j = 0; j < servicios; j++) {
                matriz[i][j] = random.nextInt(1,3);
            }
        }

        //mostrar
        for(int i = 0; i < tecnicos; i++) {
            for(int j = 0; j < servicios; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }

        tecnicoQueGanoMayorComision(matriz, tecnicos, servicios, costos);

    }

    public static void tecnicoQueGanoMayorComision(int [][] matriz, int tecnicos, int servicios, int [] costos) {
        double comisionMayor = 0.0;
        int tecnicoConMayorComision = 0;


        for(int i = 0; i < tecnicos; i++) {
            int dineroActual = 0;
            double comisionObtenida = 0.00;

            for(int j = 0; j < servicios; j++) {
                switch (j){
                    case 0:
                        dineroActual = dineroActual + (matriz[i][j] * 2500);
                        break;
                    case 1:
                        dineroActual = dineroActual + (matriz[i][j] * 5000);
                        break;
                    case 2:
                        dineroActual = dineroActual + (matriz[i][j] * 10000);
                        break;
                    case 3:
                        dineroActual = dineroActual + (matriz[i][j] * 15000);
                        break;
                }
            }

            comisionObtenida = 0.05 * dineroActual;
            System.out.printf("\nLa comision total es: %.2f", comisionObtenida);

            if(comisionObtenida > comisionMayor){
                comisionMayor = comisionObtenida;
                tecnicoConMayorComision = i;
            }
        }

        System.out.println("\nEl tecnico con mayor comision es: "+ tecnicoConMayorComision+ " Con una comision de: $"+ comisionMayor);
    }
}














