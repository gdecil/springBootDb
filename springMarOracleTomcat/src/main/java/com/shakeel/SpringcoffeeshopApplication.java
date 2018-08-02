package com.shakeel;

import com.shakeel.model.MarCompoundMolT;
import com.shakeel.repository.MarCompoundMolRepository;
//import com.java2novice.springboot.SpringBootWebApplication;
import com.shakeel.readFile;
import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringcoffeeshopApplication extends SpringBootServletInitializer  implements CommandLineRunner {

    @Autowired
    MarCompoundMolRepository marcomprepo;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringcoffeeshopApplication.class);
    }

    public static void main(String[] args) {
		SpringApplication.run(SpringcoffeeshopApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {

    }


}
