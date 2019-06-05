package com.company.v3;

import com.company.v3.input.CMDLineInputs;
import com.company.v3.input.Inputs;
import com.company.v3.repository.FIleNumberRepository;
import com.company.v3.repository.NumberRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Inputs inputs = new CMDLineInputs(args);
        String operation = inputs.read();

        NumberRepository numberRepository = new FIleNumberRepository();
        List<Double> inputNumbers = numberRepository.read();


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




        // write your code here
    }

}
