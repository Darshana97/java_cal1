package com.company.v1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String operation = args[0]; //first argument, add/sub/mul/div
        List<Double> inputNumbers = new ArrayList<>();

        try {
            List<String> inputNumberStrs = Files.readAllLines(Paths.get("/home/asankah/kelaniya_uni/se/calculator/src/com/company/numbers.txt"));
            for (String inputNumberStr : inputNumberStrs) {
                inputNumbers.add(Double.parseDouble(inputNumberStr));
            }

            if ("add".equals(operation)) {
                System.out.println(inputNumbers.get(0) + inputNumbers.get(1));
            }

            else if ("sub".equals(operation)) {
                System.out.println(inputNumbers.get(0) - inputNumbers.get(1));
            }

            else if ("mul".equals(operation)) {
                System.out.println(inputNumbers.get(0) * inputNumbers.get(1));
            }
            else if ("div".equals(operation)) {
                //check if the second number is 0, then show an error to the user without crashing....

                System.out.println(inputNumbers.get(0) / inputNumbers.get(1));
            }

        } catch (IOException e) {
            e.printStackTrace(); //bad
        }


        // write your code here
    }

}
