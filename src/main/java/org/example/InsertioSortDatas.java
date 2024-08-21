package org.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InsertioSortDatas {
    public static void main(String[] args) throws ParseException {
        List<Long> datas = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        datas.add(format.parse("10/10/2024").getTime());
        datas.add(format.parse("09/10/2024").getTime());
        datas.add(format.parse("15/11/1988").getTime());
        datas.add(format.parse("29/12/2024").getTime());
        datas.add(format.parse("03/05/2024").getTime());


        System.out.println("Odatas:");
        imprimirDatas(datas, format);

        long[] datasLista = datas.stream().mapToLong(Long::longValue).toArray();

        insertionSort(datasLista);

        System.out.println("datas organizadas:");
        imprimirDatas(datasLista, format);
    }

    public static void insertionSort(long[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            long key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void imprimirDatas(List<Long> datas, DateFormat format) {
        for (long tempo : datas) {
            System.out.println(format.format(new Date(tempo)));
        }
        System.out.println();
    }

    public static void imprimirDatas(long[] datas, DateFormat format) {
        for (long tempo : datas) {
            System.out.println(format.format(new Date(tempo)));
        }
        System.out.println();
    }
}