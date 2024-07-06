public class Hybrid_Inheritance {
    public static void main(String[] args) {
        Dog pet = new Dog();
        pet.eat();
        pet.bark();
        pet.walk();
    }
}
class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}        
class Shark extends Fish {

}
class Dog extends Mammal{
    void bark(){
        System.out.println("bark");
    }
}