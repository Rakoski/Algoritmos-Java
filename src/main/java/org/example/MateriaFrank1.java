package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MateriaFrank1 {
    public static void materiaFrank1() {
        String frase = "Algoritmos e estrutura de dados";

        Map<Integer, List<String>> buracos = new HashMap<>();
        buracos.put(0, new ArrayList<>(List.of(
                "C", "c", "E", "F", "G", "g", "H", "h", "I",
                "i", "j", "J", "k", "K", "l", "L", "M", "m", "N", "n",
                "r", "s", "S", "t", "T", "u", "U", "v", "V", "w", "W",
                "X", "x", "y", "Y", "Z", "z"
        )));
        buracos.put(1, new ArrayList<>(List.of(
                "a", "A", "b", "D", "d", "e", "o", "O", "p",
                "P", "q", "Q", "R"
        )));
        buracos.put(2, new ArrayList<>(List.of("B")));

        System.out.printf("buracos: " + contarCaracteres(buracos, frase));
    }

    public static int contarCaracteres(Map<Integer, List<String>> buracos, String frase) {
        int quantBuracos = 0;
        for (char letra : frase.toCharArray()) {
            for (Map.Entry<Integer, List<String>> entrada : buracos.entrySet()) {
                if (entrada.getValue().contains(String.valueOf(letra))) {
                    quantBuracos += entrada.getKey();
                    break;
                }
            }
        }
        return quantBuracos;
    }
}
