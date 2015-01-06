/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jjcosare.calculator.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author jjcosare
 */
@Configuration
@EnableWebMvc
@Import({ WebInitializer.class, DispatcherConfig.class})
public class WebConfig extends WebMvcConfigurerAdapter {

}
