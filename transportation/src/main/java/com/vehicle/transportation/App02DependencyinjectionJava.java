/* Field inection
package com.vehicle.transportation;

import com.vehicle.transportation.vehicle.Car;
import com.vehicle.transportation.vehicle.VehicleRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class DependecyBusinessClass{
    @Autowired
    Dependency1 dependency1;

    @Autowired
    Dependency2 dependency2;

    @Override
    public String toString(){
        return "DependencyBusinessClass{" + "dependency1    " + dependency1 + "  , dependency2    " + dependency2+"}";
    }
}

@Component
class Dependency1{

}

@Component
class Dependency2{

}

@Configuration
@ComponentScan("com.vehicle.transportation")
public class App02DependencyinjectionJava {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App02DependencyinjectionJava.class)) {
            var dependecyBusinessClass = context.getBean(DependecyBusinessClass.class);
            System.out.println(dependecyBusinessClass);

        }
    }
}
//there are three injections...1.field injection 2.setter injection 3.Constructor injection ---- the 1st two requires autowiring annotation to typed buy us but for (3) it will include automatically*/

/*setter injection
package com.vehicle.transportation;

import com.vehicle.transportation.vehicle.Car;
import com.vehicle.transportation.vehicle.VehicleRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class DependencyBusinessClass{

    private Dependency1 dependency1;
    private Dependency2 dependency2;

    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        this.dependency2 = dependency2;
    }

    @Override
    public String toString(){
        return "DependencyBusinessClass{" + "dependency1    " + dependency1 + "  , dependency2    " + dependency2+"}";
    }
}

@Component
class Dependency1{

}

@Component
class Dependency2{

}

@Configuration
@ComponentScan("com.vehicle.transportation")
public class App02DependencyinjectionJava {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App02DependencyinjectionJava.class)) {
            var dependencyBusinessClass = context.getBean(DependencyBusinessClass.class);
            System.out.println(dependencyBusinessClass);

        }
    }
}*/

//Constructor Injection --- note here mentioning autowired is optionall
package com.vehicle.transportation;

import com.vehicle.transportation.vehicle.Car;
import com.vehicle.transportation.vehicle.VehicleRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class DependencyBusinessClass{

    private Dependency1 dependency1;
    private Dependency2 dependency2;

    @Autowired
    public DependencyBusinessClass(Dependency1 dependency1, Dependency2 dependency2){
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;

    }

    @Override
    public String toString(){
        return "DependencyBusinessClass{" + "dependency1    " + dependency1 + "  , dependency2    " + dependency2+"}";
    }
}

@Component
class Dependency1{

}

@Component
class Dependency2{

}

@Configuration
@ComponentScan("com.vehicle.transportation")
public class App02DependencyinjectionJava {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App02DependencyinjectionJava.class)) {
            var dependencyBusinessClass = context.getBean(DependencyBusinessClass.class);
            System.out.println(dependencyBusinessClass);

        }
    }
}
