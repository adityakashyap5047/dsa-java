public class OopsAbstraction {
    public static void main(String[] args) {

        Mustang myHorse = new Mustang();

        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);    //constructor of Animal will be called first
        h.changeColor();
        System.out.println(h.color);
        
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);    //constructor of Animal will be called first
        c.changeColor();
        System.out.println(c.color);

        //Animal a = new Animal();  This will give error because we can not create the instance of abstract class
    }
}

abstract class Animal{
    String color;
    Animal(){
        color = "brown";
        System.out.println("Animal constructor called...");
    }
    void eat(){
        System.out.println("eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called...");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called...");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructor called...");
    }
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
