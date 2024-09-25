public class OopsSuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);

        Chicken c = new Chicken();
        System.out.println(c.color);
    }
}

class Animal{
    String color;
    Animal() {
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super();    // if we don't write super() here then java bydefault call super() constructor
        System.out.println("horse constructor is called");
        //super(); //it gives error 
        super.color = "brown";
    }
}

class Chicken extends Animal{
    Chicken(){
        super.color = "yellow";
    }
}