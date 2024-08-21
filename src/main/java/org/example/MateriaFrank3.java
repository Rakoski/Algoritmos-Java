package org.example;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class MateriaFrank3 {

    public static String[] ordenarString(String palavra) {

//        System.out.println(Arrays.toString(palavra.getBytes(StandardCharsets.UTF_8)));

        char[] cadaLetra = palavra.toCharArray();
        for (int x = 0; x < palavra.length(); x++) {
            char letra = palavra.charAt(x);
            int codigoAscii = letra;
            System.out.println("letra: " + letra + codigoAscii);
        }
        return new String[]{palavra};
    }

}
