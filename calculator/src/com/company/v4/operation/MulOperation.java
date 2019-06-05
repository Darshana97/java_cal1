package com.company.v4.operation;

public class MulOperation implements Operation {

    private final double a;
    private final double b;

    public MulOperation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perform() {

        return a*b;

    }
}
