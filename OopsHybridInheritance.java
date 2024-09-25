public class OopsHybridInheritance {
    public static void main(String[] args) {
        Bird parrot = new Bird();
        parrot.fly();
        parrot.eat();

        Dog dobby = new Dog();
        dobby.legs = 4;
        dobby.speaks();
        System.out.println(dobby.legs);

        Human zenny = new Human();
        zenny.legs = 2;
        zenny.speaks();
        System.out.println(zenny.legs);
    }
}


//Base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derived class
class Mammal extends Animal {
    void walk(){
        System.out.println("walks");
    }
}

//Derived class
class Dog extends Mammal {
    int legs;
    void speaks(){
        System.out.println("can't speak");
    }
}

//Derived class
class Human extends Mammal {
    int legs;
    void speaks(){
        System.out.println("can speak");
    }
}

//Derived class
class Bird extends Animal {
    void fly(){
        System.out.println("fly");
    }
}

