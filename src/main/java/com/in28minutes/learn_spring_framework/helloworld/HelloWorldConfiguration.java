package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Louise";
    }

    @Bean
    public int age(){
        return 29;
    }

    @Bean
    public Person person(){
        return new Person("Pepsi", 4, new Address("a road", "Bournemouth"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    public Person person4parameters(String name, int age, Address address){
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3Qualifier") Address address){
        return new Person(name, age, address);
    }

    @Bean(name = "address2")
    @Primary
    public Address address(){
        return new Address("a road", "Bournemouth");
    }

    @Bean(name = "address3")
    @Qualifier("address3Qualifier")
    public Address address3(){
        return new Address("a street", "Didcot");
    }
}
