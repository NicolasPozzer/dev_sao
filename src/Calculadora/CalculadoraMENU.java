package Calculadora;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculadoraMENU {
    public static void main(String[] args) {

        // inicializacion de variables
        int opcion = 9;
        String pregunta = "N";

        Scanner teclado = new Scanner(System.in);

        System.out.println("\t CALCULADORA");

        // Llamada al menu y sus opciones
        menu();
        opcion = teclado.nextInt();

        //Menu
        while(opcion != 9){

            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            double porcentaje = 0.0;

            switch(opcion){
                case 1:

                    System.out.print("Ingrese el Primer Numero: ");
                    n1 = teclado.nextInt();
                    System.out.print("Ingrese el Segundo Numero: ");
                    n2 = teclado.nextInt();

                    System.out.println("\nResultado de la Suma: "+suma(n1,n2));
                    break;
                case 2:
                    System.out.print("Ingrese el Primer Numero: ");
                    n1 = teclado.nextInt();
                    System.out.print("Ingrese el Segundo Numero: ");
                    n2 = teclado.nextInt();

                    System.out.println("\nResultado de la Resta: "+resta(n1,n2));
                    break;
                case 3:
                    System.out.print("Ingrese el Primer Numero: ");
                    n1 = teclado.nextInt();
                    System.out.print("Ingrese el Segundo Numero: ");
                    n2 = teclado.nextInt();

                    System.out.println("\nResultado de la Multiplicacino: "+multiplicacion(n1,n2));
                    break;
                case 4:
                    System.out.print("Ingrese el Primer Numero: ");
                    n1 = teclado.nextInt();
                    System.out.print("Ingrese el Segundo Numero: ");
                    n2 = teclado.nextInt();

                    System.out.println("\nResultado de la Division: "+division(n1,n2));
                    break;
                case 5:
                    System.out.print("Ingrese el Primer Numero: ");
                    n1 = teclado.nextInt();
                    System.out.print("Ingrese el Segundo Numero: ");
                    n2 = teclado.nextInt();
                    System.out.print("Ingrese el Tercer Numero: ");
                    n3 = teclado.nextInt();

                    System.out.println("\nEl Promedio de los numeros"+n1+", "+n2+" y "+n3+ " es: "+calcularPromedio(n1,n2,n3));
                    break;
                case 6:
                    System.out.print("Ingrese el Numero a calcular: ");
                    n1 = teclado.nextInt();

                    System.out.println("\nResultado de el Nro:  -> "+n1+" al cuadrado: "+cuadradoDeUnNumero(n1));
                    break;
                case 7:
                    System.out.print("Ingrese el numero a calcular: ");
                    n1 = teclado.nextInt();
                    System.out.print("Ingrese el Porcentaje que desea obtener del numero -> "+n1+": ");
                    porcentaje = teclado.nextDouble();

                    System.out.println("\nResultado del porcentaje: %"+calcularPorcentaje(n1, porcentaje));
                    break;
                default:
                    System.out.println("No existe una operacion para la opcion: "+opcion);
            }

            //Pregunta luego de realizar operacion seleccionada
            System.out.println("\nQuieres realizar otra operacion? S o s = Si | N o n = no");
            pregunta = teclado.next();
            if(pregunta.equals("S")||pregunta.equals("s")){
                menu();
                opcion = teclado.nextInt();
            }else {
                opcion = 9;
            }
        }

        System.out.println("Fin de Programa!");

    }


    // Suma
    public static int suma(int n1, int n2) {
        return (n1 + n2);
    }

    // resta
    public static int resta(int n1, int n2) {
        return n1 - n2;
    }

    // Multiplicacion
    public static int multiplicacion(int n1, int n2) {
        return n1 * n2;
    }

    // Division
    public static int division(int n1, int n2) {
        return n1 / n2;
    }

    // Calcular Prommedio de 3 numeros
    public static double calcularPromedio(int n1, int n2 , int n3){
        //Cantidad de numeros
        int cantNumeros = 3;

        double promedio = 0.0;
        promedio = (double) ((n1 + n2 + n3) / cantNumeros);
        return promedio;
    }

    // Calcular el cuadrado de un numero
    public static double cuadradoDeUnNumero(int n){
        return n * n;
    }

    // Calcular Porcentaje
    public static double calcularPorcentaje(int numeroAcumulado, double porcentaje){
        double resultado = 0.0;
        resultado = (porcentaje * numeroAcumulado) / 100;
        return resultado;
    }

    public static void menu(){
        System.out.println("\nMenu | Seleccione una Opcion!");
        System.out.println("1_ Suma");
        System.out.println("2_ Resta");
        System.out.println("3_ Multiplicacion");
        System.out.println("4_ Division");
        System.out.println("5_ Promedio de tres numeros");
        System.out.println("6_ Cuadrado de un numero");
        System.out.println("7_ Porcentaje de un numero");
        System.out.println("9_ Salir");
        System.out.print("--> ");
    }

}
