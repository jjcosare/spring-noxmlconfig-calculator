/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jjcosare.calculator.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Examinee
 */
@Configuration
@ComponentScan(basePackages = {
    "com.jjcosare.calculator.service"
    ,"com.jjcosare.calculator.controller"
})
public class DispatcherConfig {
    
}
