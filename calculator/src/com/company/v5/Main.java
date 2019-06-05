package com.company.v5;

import com.company.v5.input.CMDLineInputs;
import com.company.v5.input.Inputs;
import com.company.v5.operation.*;
import com.company.v5.output.ConsoleOutput;
import com.company.v5.output.Outputs;
import com.company.v5.repository.FIleNumberRepository;
import com.company.v5.repository.NumberRepository;

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

        Outputs outputs = new ConsoleOutput();
        outputs.show("The result is: " + operation.perform());
        outputs.show("Exiting the program....");
    }

}
