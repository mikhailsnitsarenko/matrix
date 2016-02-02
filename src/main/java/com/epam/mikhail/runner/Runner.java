package com.epam.mikhail.runner;

import com.epam.mikhail.matrix.Matrix;
import com.epam.mikhail.operations.Operations;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Введите целое число для размерности матриц: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        } else {
            System.out.println("Вы ввели не целое число.");
            return;
        }
        sc.close();

        System.out.println("MatrixA:\n");
        Matrix matrixA = new Matrix(n, n);
        Operations.initialization(matrixA);
        Operations.show(matrixA);

        System.out.println("MatrixB:\n");
        Matrix matrixB = new Matrix(n, n);
        Operations.initialization(matrixB);
        Operations.show(matrixB);

        Operations.show(Operations.summation(matrixA, matrixB));
        Operations.show(Operations.subtraction(matrixA, matrixB));
        Operations.show(Operations.multiplication(matrixA, matrixB));
    }
}
