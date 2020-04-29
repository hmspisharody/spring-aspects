package com.springframework.demo;

import com.springframework.demo.config.AppConfig;
import com.springframework.demo.service.OutputService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

    public static void main(String[] args) throws Exception {

        AnnotationConfigApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        OutputService outputService = appContext.getBean(OutputService.class);

        for(int i=0; i<5; i++) {
            outputService.generateOutput();
            Thread.sleep(3000);
        }

        appContext.close();
    }
}
