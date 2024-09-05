package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFIle {
    public static int[] fileReader(String fileName) {
        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextInt()) {
                int number = myReader.nextInt();
                numbers.add(number);
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return numbers.stream().mapToInt(Integer::intValue).toArray();
    }
}