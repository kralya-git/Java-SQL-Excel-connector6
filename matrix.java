package com.test.idea;

import java.util.Scanner;


public class matrix {

    private static int x1;
    private static int x2;
    private static int y1;
    private static int y2;
    private static int[][] a;
    private static int[][] b;

    public static void MatrixInput () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк в первой матрице: ");
        y1 = scan.nextInt();
        System.out.println("Введите количество столбцов в первой матрице: ");
        x1 = scan.nextInt();
        System.out.println("Введите количество строк во второй матрице: ");
        y2 = scan.nextInt();
        System.out.println("Введите количество столбцов во второй матрице: ");
        x2 = scan.nextInt();

        if(x1 == y2) {
            a = new int[y1][x1];
            b = new int[y2][x2];

            System.out.println("Введите первую матрицу: ");
            for(int i = 0; i < y1; i++) {
                for(int j = 0; j < x1; j++) {
                    a[i][j] = scan.nextInt();
                }
            }



            System.out.println("Введите вторую матрицу: ");
            for(int i = 0; i < y2; i++) {
                for(int j = 0; j < x2; j++) {
                    b[i][j] = scan.nextInt();
                }
            }
        }

        else {
            System.out.println("Умножение будет невозможно");
        }

    }

    public static void MatrixPrint (int[][] c, int y1, int x2){

        for(int i = 0; i < y1; i++) {
            for(int j = 0; j < x2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        MatrixInput();
        MatrixMultiplication.multiplication(x1, x2, y1, y2, a, b);
    }
}

//1 1 1 1 1 1 1
//2 2 2 2 2 2 2
//3 3 3 3 3 3 3
//1 1 1 1 1 1 1
//2 2 2 2 2 2 2
//3 3 3 3 3 3 3
//1 1 1 1 1 1 1

//Итоговая матрица:
//13 13 13 13 13 13 13
//26 26 26 26 26 26 26
//39 39 39 39 39 39 39
//13 13 13 13 13 13 13
//26 26 26 26 26 26 26
//39 39 39 39 39 39 39
//13 13 13 13 13 13 13

