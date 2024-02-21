package com.firstprojectsb.learnspringframework.app03gamingspringbeans;

import com.firstprojectsb.learnspringframework.game.GameRunner;
import com.firstprojectsb.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.firstprojectsb.learnspringframework.game")
public class GamingAppLaucherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (GamingAppLaucherApplication.class)){

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
    }
}
