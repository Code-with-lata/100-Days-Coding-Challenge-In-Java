public class Multi_Inheritance {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.eat();
        doggy.legs = 4;
        System.out.println(doggy.legs);
    }
}
class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("Breathes");
    }
}
class Mammals extends Animal{
    int legs;
}
class Dog extends Mammals {
    String breed;
}