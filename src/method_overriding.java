public class method_overriding {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.animalSound(); // called child class method not parent
    }
}
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }

    // this method is not called by runtime polymorphism
    public void animalColor() {
        System.out.println("The dog color: black");
    }
}
