package com.spring.rest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
@ComponentScan("com.spring.rest.controller")
public class StudentWebConfig extends WebMvcConfigurerAdapter{

}
