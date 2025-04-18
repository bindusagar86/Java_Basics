package com.bbtech.solidPrinciple.ocp;

import java.security.InvalidParameterException;

public class Calculator {

    public void calculate(CalculateOperation operation){
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        operation.perform();
    }
}
