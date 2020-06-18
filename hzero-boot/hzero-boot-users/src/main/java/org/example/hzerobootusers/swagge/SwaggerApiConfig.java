package org.example.hzerobootusers.swagge;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerApiConfig {
    public static final String USER = "User";
    public static final String TASK = "Task";

    @Autowired
    public SwaggerApiConfig(Docket docket) {

    }
}