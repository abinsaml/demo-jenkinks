package com.jenkins.example.demojenkinks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoJenkinksApplication {

    public static Logger logger= LoggerFactory.getLogger(DemoJenkinksApplication.class);

    @PostConstruct
    public void init(){
        logger.info("Application Started...........+++++++++++");
    }

    public static void main(String[] args) {
        logger.info("Application Executed...........++++++++++");
        SpringApplication.run(DemoJenkinksApplication.class, args);
    }

}
