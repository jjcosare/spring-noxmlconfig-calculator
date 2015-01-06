/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jjcosare.calculator.controller;

import com.jjcosare.calculator.form.CalculatorForm;
import com.jjcosare.calculator.service.ICalculatorService;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author jjcosare
 */
@Controller
public class CalculatorController {
    
    @Autowired
    ICalculatorService calculatorService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody Object getCalculation(
            @Valid CalculatorForm calculatorForm, BindingResult bindingResult){

        Object result = null;
        if(bindingResult.hasErrors()){
            Map<String, String> errorMap = new HashMap<>();
            for(FieldError error: bindingResult.getFieldErrors()){
                errorMap.put(error.getField(), error.getDefaultMessage());
            }
            result = errorMap;
        }else{
            result = calculatorService.getCalculation(calculatorForm);
        }
        return result;
    }
    
}
