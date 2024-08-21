package org.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GerenciarAgenda {
    static final String[] vetorDatas = {"10/10/2024", "10/10/2023", "10/10/2022"};


    public static void main(String[] args) {
        String[] datasOrdenadas = ordenaDatas(vetorDatas);
        for (String data : datasOrdenadas) {
            System.out.println(data);
        }
    }

    public static String[] ordenaDatas(String[] datas) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        boolean trocou = true;

        try {
            while (trocou) {
                trocou = false;
                for (int x = 0; x < datas.length - 1; x++) {
                    Date datax = format.parse(datas[x]);
                    Date datax1 = format.parse(datas[x + 1]);
                    if (datax.after(datax1)) {
                        datas[x] = format.format(datax1);
                        datas[x+1] = format.format(datax);
                        trocou = true;
                    }
                }
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return datas;
    }
}
