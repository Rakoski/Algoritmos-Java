package org.example;

public class InsertionSortDecimal {


    public static void main(String[] args) {
        double[] vetor = {12.9, 11.23, 13.1, 5.98, 6.0};

        System.out.println("vetor original:");
        imprimirVetor(vetor);

        ordenar(vetor);

        System.out.println("vetor ordenado:");
        imprimirVetor(vetor);
    }

    public static void ordenar(double[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            double key = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = key;
        }
    }

    public static void imprimirVetor(double[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

}
