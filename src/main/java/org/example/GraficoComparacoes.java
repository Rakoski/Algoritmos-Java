package org.example;

import java.util.ArrayList;
import java.util.List;

public class GraficoComparacoes {
    public static int insertionSort(int[] vetor) {
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
        return comparacoes;
    }

    public static int bubbleSortfRANK(int[] vetor) {
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
        return comparacoes;
    }

    public static void main(String[] args) {
        int repeticoes = 100;
        long comparacoesInsertion = 0;
        long comparacoesBubble = 0;

        for (int i = 0; i < repeticoes; i++) {
            int[] vetorInsertion = {120, 110, 100, 90, 80, 70, 60};
            int[] vetorBubble = {120, 110, 100, 90, 80, 70, 60};
            comparacoesInsertion += insertionSort(vetorInsertion);
            comparacoesBubble += bubbleSortfRANK(vetorBubble);
        }
        double mediaComparacoesInsertion = (double) comparacoesInsertion / repeticoes;
        double mediaComparacoesBubble = (double) comparacoesBubble / repeticoes;

        List<String> vetorPrintado = new ArrayList<>();
        List<String> vetorPrintadoBubble = new ArrayList<>();

        for (int printou = 0; printou < mediaComparacoesInsertion; printou++) {
            vetorPrintado.add("*");
        }
        System.out.println("Insertion sort: " + vetorPrintado);
        for (int printou = 0; printou < comparacoesBubble; printou++) {
            vetorPrintadoBubble.add("*");
        }
        System.out.println("Bubble sort: " + vetorPrintadoBubble);
    }
}
