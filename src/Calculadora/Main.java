package Calculadora;

public class Main {
    public static void main(String[] args) {

        // inicializacion de variables para resultados
        int resultadoSuma = 0;
        int resultadoResta = 0;
        int resultadoMulti = 0;
        int resultadoDiv = 0;
        double resultadoProm = 0;
        double resultadoCuadrado = 0;
        double resultadoPorcentaje = 0;

        /*   Pruebas   */

        resultadoSuma = suma(1,3);
        resultadoResta = resta(1,3);
        resultadoMulti = multiplicacion(6,6);
        resultadoDiv = division(4,2);
        resultadoProm = calcularPromedio(9,7,5);
        resultadoCuadrado = cuadradoDeUnNumero(5);
        resultadoPorcentaje = calcularPorcentaje(500,50);

        //Salidas
        System.out.println("Suma: " +resultadoSuma);
        System.out.println("Resta: " +resultadoResta);
        System.out.println("Multiplicacion: " +resultadoMulti);
        System.out.println("Division: " +resultadoDiv);
        System.out.println("Promedio: " +resultadoProm);
        System.out.println("Cuadrado: " +resultadoCuadrado);
        System.out.println("Porcentaje: %" + resultadoPorcentaje);
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

}
