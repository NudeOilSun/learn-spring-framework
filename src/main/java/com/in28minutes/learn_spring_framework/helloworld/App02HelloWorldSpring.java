package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //Beans managed by spring
//        System.out.println(context.getBean("name"));
//        System.out.println(context.getBean("age"));
//        System.out.println(context.getBean("person"));
//        System.out.println(context.getBean("person2MethodCall"));
//        System.out.println(context.getBean("address2"));
//        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("person5Qualifier"));
        //System.out.println(context.getBean(Address.class));

//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
