package com.test.idea;

public final class MatrixMultiplication extends matrix {

    public static void multiplication(int x1, int x2, int y1, int y2, int[][] a, int[][] b) {
        int[][] c = new int[y1][x2];

        for(int i = 0; i < y1; i++) {
            for(int j = 0; j < x2; j++) {
                for(int k = 0; k < x1; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Итоговая матрица: ");
        matrix.MatrixPrint (c, y1, x2);
    }
}
