package generics;

import simpleinheritance.clinic.Cat;
import simpleinheritance.clinic.Dog;

public class SimpGenDemo {
    public static void main(String[] args) {
        ThreeGen<String, Cat, Integer> gen1 = new ThreeGen<>("BlackCat", new Cat(), 54);
        gen1.showTypes();
        ThreeGen<String, Dog, Double> gen2 = new ThreeGen<>("SnoopDog", new Dog(), 1.23);
        gen2.showTypes();
    }
}