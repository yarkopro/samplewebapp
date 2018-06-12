package com.yarkopro.samplewebapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.yarkopro.samplewebapp.*")
public class WebConfig implements WebMvcConfigurer {

}
