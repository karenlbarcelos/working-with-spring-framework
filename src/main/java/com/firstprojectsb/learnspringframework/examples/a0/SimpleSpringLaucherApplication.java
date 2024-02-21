package com.firstprojectsb.learnspringframework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("firstprojectsb.learnspringframework.examples.a1")  //nao eh necessario especificar o pacote aqui
public class SimpleSpringLaucherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (SimpleSpringLaucherApplication.class)){

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
