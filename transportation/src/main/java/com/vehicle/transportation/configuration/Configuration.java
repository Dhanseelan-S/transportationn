package com.vehicle.transportation.configuration;

import org.springframework.context.annotation.Bean;

public class Configuration {
    @Bean
    public String name()
    {
        return "Dhanaseelan";
    }

    @Bean
    public int age(){
        return 22;
    }
    @Bean
    public Student student(){
        return new Student("Dhanaseelan", 22, new Address("BTM", "asd"));
    }

    @Bean
    public Address address(){
        return new Address("firstline", "secondline");
    }
    @Bean
    public Student student1(){
        return new Student(name(), age(), address());//by using method calls
    }

    @Bean(name = "Vijay") //(name = "Vijay") is used here to change the bean's name
    public Student student2(String name, int age, Address address){
        return new Student(name, age, address);//by using parameter calling, in this we must also pass the datatype of the parametr in the method paranthesis
    }

}
