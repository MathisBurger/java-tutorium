package de.thi.java2.tut240425;

class Animal {
    public String speak() {
        return "...";
    }
}

class Dog extends Animal {

    @Override
    public String speak() {
        return "Wuff";
    }
}



public class Speak {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.speak());
    }
}
