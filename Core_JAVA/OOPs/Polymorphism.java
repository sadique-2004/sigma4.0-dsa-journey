package OOPs;

public class Polymorphism {

    public static void main(String[] args) {
        Person P1 = new Person();
        P1.name = "Sadique";
        P1.age = 25;

        System.out.println(P1.name +" " +P1.age);
        P1.eat();
        // P1.walk();
        P1.walk(100);
        
    }
}

class Person {
     String name;
     int age;

     void walk(){
        System.out.println(name + " is walking");
     }

     void eat(){
        System.out.println(name + " is eating");
     }

     void walk(int steps){
System.out.println(name + " is walking " + steps + " steps");
     }
}

