package simpleclasses;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Римус Люпин", 38);

        person1.setFullName("Гарри Поттер");
        person1.setAge(13);

        person1.printPerson();
        person2.printPerson();

        person1.move();
        person2.talk();
        System.out.println(person1);
    }
}
