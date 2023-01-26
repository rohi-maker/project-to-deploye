package com.testDeployedProject.projecttodeploye;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProjectToDeployeApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ProjectToDeployeApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ProjectToDeployeApplication.class);
    }




    @GetMapping("/")
    public String myTestMethod() {
        return "THIS IS WORKING FINE SHIVAY";
    }

    @RequestMapping("/shivay")
    public String myTestMethod2() {
        return "THIS IS WORKING FINE 2nd SHIVAY";
    }
}
