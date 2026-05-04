/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //int[][] matrizA = {{2, 4, 3}, {8, 9, 6}, {3, 6, 0}, {4, 8, 9}};
        //recorrerMatriz(matrizA);
        //matrizA[2][2] = 2;
        //recorrerMatriz(matrizA);
        int[][] matrizB = crearMatrizB();

        presentarMatriz(matrizB);

        presentarDiagonalMatrizB(matrizB);

    }

    public static void recorrerMatriz(int[][] matrizA) {

        for (int i = 0; i < matrizA.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrizA[i].length; j++) {

                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println();
    }

    public static int[][] crearMatrizB() {

        Scanner entrada = new Scanner(System.in);

        int fil;
        int col;
        int num;

        System.out.println("Ingrese el numero de filas de la matriz");
        fil = entrada.nextInt();

        System.out.println("Ingrese el numero de columnas de la matriz");
        col = entrada.nextInt();

        int[][] matrizB = new int[fil][col];

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.println("Ingrese un valor para la matriz en la posicion [" + i + "][" + j + "]");
                num = entrada.nextInt();
                matrizB[i][j] = num;
            }
        }

        return matrizB;

    }

    public static void presentarMatriz(int[][] matrizB) {

        System.out.println();
        System.out.println("Presentacion de la matriz llenada por el usuario ");
        System.out.println();

        for (int i = 0; i < matrizB.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println();
    }

    public static void presentarDiagonalMatrizB(int[][] matrizB) {

        if (matrizB.length != matrizB[0].length) {
            System.out.println("La matriz no es cuadrada, no se puede obtener la diagonal principal completa.");
            return;
        }
        
        System.out.println("Presentacion diagonal principal de la matriz");
        System.out.println();
        
        for (int i = 0; i < matrizB.length; i++) {
            System.out.print(matrizB[i][i] + " ");
        }

        System.out.println("\n");
    }
}
