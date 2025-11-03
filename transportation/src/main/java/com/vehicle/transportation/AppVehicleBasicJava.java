package com.vehicle.transportation;/*package com.vehicle.transportation;
import com.vehicle.transportation.configuration.Student;
import com.vehicle.transportation.configuration.Address;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.vehicle.transportation.configuration.Configuration;

import java.util.Arrays;


public class AppVehicleBasicJava {
    public static void main(String []args){
        var context = new AnnotationConfigApplicationContext(Configuration.class);
        System.out.println(context);
        var nameBean = context.getBean("name");
        System.out.println(nameBean);

        System.out.println(context.getBean("student"));
        //System.out.println(context.getBean(Student.class));

        System.out.println(context.getBean("address"));//method
        System.out.println(context.getBean(Address.class));//record

        System.out.println(context.getBean("student1"));
        //System.out.println(context.getBean(Student.class));//This causes error, as the student class has two beans and it doesn't know whcih one to call -- student or student1

        System.out.println(context.getBean("Vijay"));

        System.out.println(context.getBeanDefinitionCount());//to get the total number of beans
        /*String[] beans = context.getBeanDefinitionNames();to know the bean names
        for(int i = 0; i < beans.length; i++){
            System.out.println(beans[i]);
        } or using forEach
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}*/

import com.vehicle.transportation.vehicle.Car;
import com.vehicle.transportation.vehicle.VehicleRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.vehicle.transportation.vehicle")
public class AppVehicleBasicJava {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AppVehicleBasicJava.class)) {
            var car = context.getBean(Car.class);
            var vehicleRunner = context.getBean(VehicleRunner.class);
            vehicleRunner.run();

        }
    }
}
//Spring uses autowiring concept to achieve dependency injection pattern (dependency injection is a type of ddesign patter)