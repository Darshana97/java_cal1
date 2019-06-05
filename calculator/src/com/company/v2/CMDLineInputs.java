package com.company.v2;

public class CMDLineInputs implements Inputs {

    private String arguments[];

    public CMDLineInputs (String args[]){
        this.arguments = args;
    }

    @Override
    public String read() {

        return arguments[0]; //first argument, add/sub/mul/di

    }

}
