/*package com.vehicle.transportation.vehicle;
//POJO--plain old java object
class Student {
    String name = "Vijay";
    int age = 24;

    public String toString(){
        return "Student{name = "+name+ " ,age = "+age+"}";
    }
}

class Main{
    public static void main(String [ ]args){
        Student student = new Student();
        System.out.println(student);
    }
}*/
package com.vehicle.transportation.vehicle;

import java.io.Serializable;
/*JavaBean - EJB (enterprise java bean) style
rules:
1. it must have no arg constructor(zero argument constructor
2.it must have getters and setters
3.it must implement serializable interface
 */

class Student implements Serializable {
    String name = "Vijay";
    int age = 22;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String toString(){
        return "Student{name = "+name+ " ,age = "+age+"}";
    }
}
class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
    }
}