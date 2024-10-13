package Extras.b;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nota;
        int cantidadParcialesRendidos;

        //calcular Promedio
        float promedio = 0.0F;
        float promedioSinUltimaNota = 0.0F;
        float acum = 0.0F;
        float acumMas10 = 0.0F;

        Scanner teclado = new Scanner(System.in);

        // decimal
        Locale.setDefault(Locale.US);

        // parciales rendidos
        cantidadParcialesRendidos = teclado.nextInt();

        for (int i = 1; i <= cantidadParcialesRendidos; i++) {
            // Ingresar notas
            nota = teclado.nextInt();
            acum += nota;
        }

        // suma 10 para probar si alcandza
        acumMas10 = acum + 10;

        promedio = acumMas10 / (cantidadParcialesRendidos + 1);
        promedioSinUltimaNota = acum / cantidadParcialesRendidos;

        // Mostrar promedio con 2 decimales y punto decimal
        System.out.printf("%.2f%n", promedioSinUltimaNota);

        if (promedio >= 6.00) {
            Double notaFaltanteParaAprobar = 0.00;
            Double acumViejo = (double) acum;

            for (int i = 1; i <= 10; i++) {
                acum = 0.0F;
                promedioSinUltimaNota = 0.0F;
                acum = (float) (acumViejo + i);

                promedioSinUltimaNota = acum / (cantidadParcialesRendidos + 1);
                if (promedioSinUltimaNota == 6.00) {
                    // Guardar la nota que falta
                    notaFaltanteParaAprobar = Double.valueOf(i);
                }
            }

            // Mostrar nota faltante para aprobar con punto decimal
            System.out.printf("%.2f%n", notaFaltanteParaAprobar);
        } else {
            System.out.println("Disculpa Emilia, deberas rendir la materia completa en Diciembre");
        }

    }
}
