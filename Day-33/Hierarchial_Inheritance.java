public class Hierarchial_Inheritance {
    public static void main(String[] args) {
        Birds crow = new Birds();
        crow.fly();
        crow.eat();
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
class Birds extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
