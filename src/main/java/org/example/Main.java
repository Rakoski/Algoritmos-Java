package org.example;

import java.nio.charset.StandardCharsets;
import java.util.*;

import static org.example.MateriaFrank1.materiaFrank1;
import static org.example.MateriaFrank2.ordenar;
import static org.example.MateriaFrank3.ordenarString;

public class Main {
    public static void main(String[] args) {


        // materiaFrank1();

        int[] valores = {1, 2, 3, 1, 2};
//        int [] valoresOrdenados = new MateriaFrank2().ordenar(valores);
//        System.out.println("valores ordenados: "+ Arrays.toString(valoresOrdenados));
//        System.out.println(Arrays.toString(ordenarString("adfehr")));
//        trocaNumero(5, 9);
        //cont = quantidade de elemento x quantidade de elemento - 1
//        for (int valor:valoresOrdenados) {
//            System.out.print(valor + " ");
//        }
    }

    public static void trocaNumero(int numA, int numB) {
        int temp = numA;
        numA = numB;
        numB = temp;
        System.out.printf("numA "+ numA);
        System.out.printf("numB: "+ numB);
    }
}
