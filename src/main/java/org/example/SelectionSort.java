package org.example;

import java.time.LocalDateTime;
import java.util.Arrays;

public class SelectionSort {
    private static int[] selectionSort(int vetor[]) {
        int tamanaho = vetor.length;
        for (int x = 0; x < tamanaho; x++) {
            int indiceMenor = x;
            for (int y = indiceMenor + 1; y < tamanaho; y++) {
                if (vetor[y] < vetor[indiceMenor]) {
                    indiceMenor = y;
                }
            }
            if (indiceMenor != x) {
                int temp = vetor[x];
                vetor[x] = vetor[indiceMenor];
                vetor[indiceMenor] = temp;
            }
        }
        return vetor;
    }

    public static int[] insertionSort(int[] vetor) {
        int comparacoes = 0;
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int key = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > key) {
                comparacoes++;
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            if (j >= 0) comparacoes++;
            vetor[j + 1] = key;
        }
        return vetor;
    }

    public static int[] bubbleSortfRANK(int[] vetor) {
        int comparacoes = 0;
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparacoes++;
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        return vetor;
    }

    private static LocalDateTime[] selectionSortDatas(LocalDateTime vetor[]) {
        int tamanaho = vetor.length;
        for (int x = 0; x < tamanaho; x++) {
            int indiceMenor = x;
            for (int y = indiceMenor + 1; y < tamanaho; y++) {
                if (vetor[y].isBefore(vetor[indiceMenor])) {
                    indiceMenor = y;
                }
            }
            if (indiceMenor != x) {
                LocalDateTime temp = vetor[x];
                vetor[x] = vetor[indiceMenor];
                vetor[indiceMenor] = temp;
            }
        }
        return vetor;
    }

    public static void main(String[] args) {
        int[] data = ReadFIle.fileReader("100k_numbers.txt");
        //LocalDateTime[] datas = {LocalDateTime.of(2021, 12, 28, 8, 0),
        //        LocalDateTime.of(2028, 1, 9, 2, 15),
        //        LocalDateTime.of(2023, 12, 1, 23, 25),
        //        LocalDateTime.of(2015, 12, 28, 8, 0)
        //};

        int[] data1 = Arrays.copyOf(data, data.length);
        long comeco = System.nanoTime();
        bubbleSortfRANK(data1);
        long fim = System.nanoTime();
        long bubleDuracao = (fim - comeco) / 1000000;

        int[] data2 = Arrays.copyOf(data, data.length);
        long comeco1 = System.nanoTime();
        insertionSort(data2);
        long fim1 = System.nanoTime();
        long insertionDuracao = (fim1 - comeco1) / 1000000;

        int[] data3 = Arrays.copyOf(data, data.length);
        long comeco2 = System.nanoTime();
        selectionSort(data3);
        long fim2 = System.nanoTime();
        long selectionDuracao = (fim2 - comeco2) / 1000000;

        System.out.println("Bubble Sort: " + bubleDuracao + " ms");

        System.out.println("Insertion Sort: " + insertionDuracao + " ms");

        System.out.println("Selection Sort: " + selectionDuracao + " ms");

        //selectionSort(listaSelectionSort);
        //selectionSortDatas(datas);
        //System.out.println("Lista ordenada:" + Arrays.toString(listaSelectionSort));
        //System.out.println("Datas ordenadas:" + Arrays.toString(datas));
    }
}
