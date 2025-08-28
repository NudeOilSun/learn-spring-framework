package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);){
            context.getBean(GamingConsole.class).Up();
            context.getBean(GameRunner.class).Run();
        }

    }
}
