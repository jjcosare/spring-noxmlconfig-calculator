/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jjcosare.calculator.form;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author jjcosare
 */
public class CalculatorForm {
    
    @JsonIgnore
    @NotBlank(message="Empty, please add parameters like this http://localhost:8080/calculator?command=add&a=5&b=8 .")
    @Pattern(regexp="add|subtract|multiply|divide", message="Wrong command, supported keywords are add, subtract, multiply, divide.")
    private String command;
    
    @Pattern(regexp="[+-]?\\d+([\\.]?\\d+)?+", message="Only valid numbers allowed.")
    private String a;
    
    @Pattern(regexp="[+-]?\\d+([\\.]?\\d+)?+", message="Only valid numbers allowed.")
    private String b;
    
    private Double result;

    /**
     * @return the command
     */
    public String getCommand() {
        return command;
    }

    /**
     * @param command the command to set
     */
    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * @return the a
     */
    public String getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(String a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public String getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(String b) {
        this.b = b;
    }

    /**
     * @return the result
     */
    public Double getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(Double result) {
        this.result = result;
    }

}
