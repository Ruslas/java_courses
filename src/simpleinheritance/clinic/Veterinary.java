package simpleinheritance.clinic;

public class Veterinary {
    public void treatAnimal(Animal animal){
        System.out.println(animal.getFood() + " " + animal.getLocation());
    }
}
