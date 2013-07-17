/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner tabla = new Scanner(System.in);
        System.out.println("Ingrese el número de tabla que desee: ");
        int numertabla = tabla.nextInt();
        sumar(numertabla);
        restar(numertabla);
        multiplicar(numertabla);
        dividir(numertabla);
    }

    public static void sumar(int numertabla) {
        System.out.println("TABLA DE SUMAR");
        int num = numertabla;
        for (int i = 1; i <= 12; i++) {
            int su = num + i;

            System.out.println(num + " + " + i + " = " + su);
        }
    }

    public static void restar(int numertabla) {
        System.out.println("_____________________");
        System.out.println("TABLA DE RESTAR");
        int num = numertabla;
        for (int i = 1; i <= 12; i++) {
            int res = num - i;
            System.out.println(num + " - " + i + " = " + res);
        }
    }

    private static void multiplicar(int numertabla) {
        System.out.println("_____________________");
        System.out.println("TABLA DE MULTIPLICAR");
        int num = numertabla;
        for (int i = 1; i <= 12; i++) {
            int res = num * i;
            System.out.println(num + " * " + i + " = " + res);
        }
    }

    private static void dividir(double numertabla) {
        System.out.println("_____________________");
        System.out.println("TABLA DE DIVIDIR");
        double num = numertabla;
        for (int i = 1; i <= 12; i++) {
            double res = num / i;
            System.out.println(num + " / " + i + " = " + res);

        }
    }
}
