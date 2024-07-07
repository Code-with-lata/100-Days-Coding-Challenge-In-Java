public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken C = new Chicken();
        C.eat();
        C.walk();

        
    }
}
abstract class Animal {
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}