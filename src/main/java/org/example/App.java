package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld1 = context.getBean("helloWorld", HelloWorld.class);
        System.out.println(helloWorld1.getMessage());
        HelloWorld helloWorld2 = context.getBean("helloWorld", HelloWorld.class);
        System.out.println(helloWorld2.getMessage());
        Cat cat1 =context.getBean("cat", Cat.class);
        System.out.println(cat1.getName() + " " + cat1.getAge());
        Cat cat2 = context.getBean("cat", Cat.class);
        System.out.println(cat2.getName() + " " + cat2.getAge());
        System.out.println(helloWorld1 == helloWorld2);
        System.out.println(cat1 == cat2);
    }
}
