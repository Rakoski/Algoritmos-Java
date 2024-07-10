package org.example;

import java.util.*;

import static org.example.MateriaFrank1.materiaFrank1;
import static org.example.MateriaFrank2.ordenar;

public class Main {
    public static void main(String[] args) {
        materiaFrank1();

        int[] valores = {9, 2, 6, 4, 5};
        System.out.println(Arrays.toString(ordenar(valores)));
    }
}
