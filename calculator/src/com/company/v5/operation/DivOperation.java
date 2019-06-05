package com.company.v5.operation;

public class DivOperation implements Operation {

    private final double a;
    private final double b;

    public DivOperation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perform() {

        return a/b;

    }
}
