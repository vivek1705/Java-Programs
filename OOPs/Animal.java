package OOPs;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

abstract class Ani {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound(); // Calls the Animal class method
        myDog.makeSound();    // Calls the Dog class method
        myCat.makeSound();    // Calls the Cat class method
    }
}

