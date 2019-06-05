package com.company.v4;

import com.company.v4.input.CMDLineInputs;
import com.company.v4.input.Inputs;
import com.company.v4.operation.*;
import com.company.v4.repository.FIleNumberRepository;
import com.company.v4.repository.NumberRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Inputs inputs = new CMDLineInputs(args);
        String operator = inputs.read();

        NumberRepository numberRepository = new FIleNumberRepository();
        List<Double> inputNumbers = numberRepository.read();

        Operation operation = null;

        if ("add".equals(operator)) {
            operation = new AddOperation(inputNumbers.get(0), inputNumbers.get(1));
        } else if ("sub".equals(operator)) {
            operation = new SubOperation(inputNumbers.get(0), inputNumbers.get(1));
        } else if ("mul".equals(operator)) {
            operation = new MulOperation(inputNumbers.get(0), inputNumbers.get(1));
        } else if ("div".equals(operator)) {
            operation = new DivOperation(inputNumbers.get(0), inputNumbers.get(1));
        }

        System.out.println("The result is: " + operation.perform());


        // write your code here
    }

}
