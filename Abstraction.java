
interface Animal {
    void makeSound();
}
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
        Animal myCat = new Cat();
        myCat.makeSound();
    }
}
