package Clase1;

public class c1 implements interfaz {
    public static void main(String[] args) {
        // System.out.println(aritmeticos.resta(0, aritmeticos.resta(5, -8)));

        System.out.println("Suma: " + new c1().suma(1, 6));
        System.out.println("Resta: " + new c1().resta(8, 3));
        System.out.println("Division: " + new c1().division(2, 2));
        System.out.println("Multi: " + new c1().multiplicacion(9, 1));

    }// end main

    @Override // met suma
    public int suma(int x, int y) {
        return x + y;
    }

    @Override // met resta
    public int resta(int x, int y) {
        return x - y;
    }

    @Override // met multi
    public int multiplicacion(int x, int y) {
        return x * y;
    }

    @Override // met division
    public int division(int x, int y) {
        int resultado = 0;
        try {
            resultado = x / y;

        } catch (Exception e) {
            System.out.print(e.getMessage() + ". ");
            System.out.print("NO SE PUEDE DIVIDIR ENTRE ");
            return 0;

        }

        return resultado;

    }

    /*
     * abstract class aritmeticos {
     * public abstract int suma(int x, int y);
     * 
     * public static int resta(int x, int y) {
     * return x - y;
     * }
     * 
     * }
     */

}// end class c1
