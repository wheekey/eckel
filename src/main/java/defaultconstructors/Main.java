package defaultconstructors;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(3);
        dog.bark(3, "haf");
        dog.bark( "hafff", 3);
        Cat cat = new Cat();
    }

}
