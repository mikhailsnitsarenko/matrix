package com.epam.mikhail.operations;

import com.epam.mikhail.matrix.Matrix;
import java.util.Random;

public class Operations {
    //метод для рандомной инициализации матрицы
    public static void initialization(Matrix matrix) {

        Random random = new Random();

        for (int i = 0; i < matrix.getMatrix().length; i++) {
            for (int j = 0; j < matrix.getMatrix()[i].length; j++)
                matrix.getMatrix()[i][j] = random.nextInt(10);
        }
    }

    //метод реализующий вывод матрицы на экран
    public static void show(Matrix matrix) {
        for (int[] temp : matrix.getMatrix()) {
            for (int i : temp)
                System.out.printf("%4d", i);
            System.out.println();
        }
        System.out.println();
    }

    //метод для сложения матриц
    public static Matrix summation(Matrix matrixA, Matrix matrixB) {

        Matrix res = new Matrix(matrixA.getRows(), matrixB.getColumns());

        if (Matrix.class != matrixA.getClass() || Matrix.class != matrixB.getClass()) {
            System.out.println("Сложение не возможно!");
        } else {
            System.out.println("Сложение:\n");

            for (int i = 0; i < matrixA.getMatrix().length; ++i) {
                for (int j = 0; j < matrixA.getMatrix()[i].length; ++j) {
                    res.getMatrix()[i][j] = matrixA.getMatrix()[i][j] + matrixB.getElementOfMatrix(i, j);
                }
            }
        }
        return res;
    }

    //метод для вычитания матриц
    public static Matrix subtraction(Matrix matrixA, Matrix matrixB) {

        Matrix res = new Matrix(matrixA.getRows(), matrixB.getColumns());

        if (Matrix.class != matrixA.getClass() || Matrix.class != matrixB.getClass()) {
            System.out.println("Вычитание не возможно!");
        } else {
            System.out.println("Вычитание:\n");

            for (int i = 0; i < matrixA.getMatrix().length; ++i) {
                for (int j = 0; j < matrixA.getMatrix()[i].length; ++j) {
                    res.getMatrix()[i][j] = matrixA.getMatrix()[i][j] - matrixB.getElementOfMatrix(i, j);
                }
            }
        }
        return res;
    }

    //метод для умножения матриц
    public static Matrix multiplication(Matrix matrixA, Matrix matrixB) {

        Matrix res = null;

        if (Matrix.class != matrixA.getClass() || Matrix.class != matrixB.getClass()) {
            System.out.println("Умножение не возможно!");
        } else {
            System.out.println("Умножение:\n");

            int m = matrixA.getMatrix().length;
            int n = matrixB.getMatrix()[0].length;
            int o = matrixB.getMatrix().length;
            res = new Matrix(m, n);

            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    for (int k = 0; k < o; k++) {
                        res.getMatrix()[i][j] += matrixA.getMatrix()[i][k] * matrixB.getMatrix()[k][j];
                    }
                }
            }
        }
        return res;
    }
}
