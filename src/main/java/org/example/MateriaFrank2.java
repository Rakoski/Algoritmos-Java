package org.example;

public class MateriaFrank2 {
    public static int[] ordenar(int[] vetor) {
        boolean trocou = true;
        do {
            for (int x = 0; x < (vetor.length -1); x++) {
                trocou = false;
                int valor = vetor[x];
                if (valor > vetor[x + 1]) {
                    vetor[x] = vetor[x+1];
                    vetor[x+1] = valor;
                    trocou = true;
                }
            }
        } while (trocou);
        return vetor;
    }
}
