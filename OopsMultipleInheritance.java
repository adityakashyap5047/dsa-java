public class OopsMultipleInheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.HerbivorousAnimal();
        b.carnivorousAnimal();
    }
}

interface Herbivore{
    void HerbivorousAnimal();
}

interface Carnivore{
    void carnivorousAnimal();
}

class Bear implements Herbivore, Carnivore {
    public void HerbivorousAnimal(){
        System.out.println("Bear is a herbivorous animal and it eats plants, grass etc.");
    }

    public void carnivorousAnimal(){
        System.out.println("Bear is also a carnivorous animal and it eats small insects, fish etc.");
    }
}
