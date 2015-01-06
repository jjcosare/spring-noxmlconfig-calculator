/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jjcosare.calculator.service;

import com.jjcosare.calculator.constants.CalculatorConstants;
import com.jjcosare.calculator.form.CalculatorForm;
import org.springframework.stereotype.Service;

/**
 *
 * @author Examinee
 */
@Service
public class CalculatorService implements ICalculatorService {

    @Override
    public CalculatorForm getCalculation(CalculatorForm calculatorForm) {
        Double result = null;
        Double a = Double.parseDouble(calculatorForm.getA());
        Double b = Double.parseDouble(calculatorForm.getB());
        String operand = calculatorForm.getCommand();
        if(operand.equalsIgnoreCase(CalculatorConstants.ADDITION)){
            result = a + b;
            calculatorForm.setResult(result);
        }else if(operand.equalsIgnoreCase(CalculatorConstants.SUBTRACTION)){
            result = a - b;
            calculatorForm.setResult(result);
        }else if(operand.equalsIgnoreCase(CalculatorConstants.MULTIPLICATION)){
            result = a * b;
            calculatorForm.setResult(result);
        }else if(operand.equalsIgnoreCase(CalculatorConstants.DIVISION)){
            result = a / b;
            calculatorForm.setResult(result);
        }
        return calculatorForm;
    }
    
}
