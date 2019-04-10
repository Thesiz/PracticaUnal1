/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Thesiz
 */
public class Practica {

    private static int[][] crearMatrizA() {

        int X[][] = new int[3][3];
        X[0][0] = 1;
        X[0][1] = 2;
        X[0][2] = 3;
        X[1][0] = 4;
        X[1][1] = 5;
        X[1][2] = 6;
        X[2][0] = 7;
        X[2][1] = 8;
        X[2][2] = 9;

        return X;
    }

    private static char[][] crearMatrizB() {

        char X[][] = new char[4][4];
        X[0][0] = 'a';
        X[0][1] = 'b';
        X[0][2] = 'c';
        X[0][3] = 'd';
        X[1][0] = 'e';
        X[1][1] = 'f';
        X[1][2] = 'g';
        X[1][3] = 'h';
        X[2][0] = 'i';
        X[2][1] = 'j';
        X[2][2] = 'k';
        X[2][3] = 'l';
        X[3][0] = 'm';
        X[3][1] = 'n';
        X[3][2] = 'o';
        X[3][3] = 'p';

        return X;
    }

    private static void DiagonalMatrizA(int X[][]) {

        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if (i == j) {
                    System.out.print(X[i][j] + " ");
                }
            }
        }
        System.out.println(" ");
    }

    private static void DiagonalMatrizB(char X[][]) {

        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if (i == j) {
                    System.out.print(X[i][j] + " ");
                }
            }
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        System.out.println("Diagonal principal de la matriz A: ");
        DiagonalMatrizA(crearMatrizA());
        System.out.println("Diagonal principal de la matriz B: ");
        DiagonalMatrizB(crearMatrizB());

    }

}
