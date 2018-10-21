package com.dk.main;

import com.dk.beans.Game;
import com.dk.configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        System.out.println("Hello World");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(applicationContext.getApplicationName());
        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        Game game = (Game)applicationContext.getBean("games");
//        game.playGame();

    }
}
