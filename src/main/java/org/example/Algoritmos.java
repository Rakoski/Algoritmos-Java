package org.example;

import java.util.Arrays;

public class Algoritmos {
    public static void main(String[] args) {
        int[] vetor = {10, 5, 3, 2};
        int[][] matriz = {{3,5,2}, {5, 2, 3}, {5 ,6 ,3}};

        for (int x = 0; x < matriz.length; x++) {
            MateriaFrank2.ordenar(matriz[x]);
            System.out.println(Arrays.toString(matriz[x]));
        }
    }
}
