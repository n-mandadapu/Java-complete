package OOPS;

class A {
    public void show() {
        System.out.println("In A");
    }

    public void show(int a) {
        System.out.println("In A int");

        // Method Overloading is a feature that allows a class to have more than one method having the same name if their argument lists are different.
        //polymorphism
        // Method Overloading is used to provide the specific implementation of the method that is already provided by its superclass.
        //compile time polymorphism
        // early binding
        // static binding

    }
    
}

class B extends A {
    public void show() {
        System.out.println("In B");
    
        // Method Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
        // Method Overriding is used to provide the specific implementation of a method which is already provided by its superclass.
        // Method Overriding is used for runtime polymorphism.
        // runtime polymorphism
        // late binding
        // dynamic binding

    }
}

public class Polymorphism {
    
    public static void main(String[] a){

        A obj = new B();
        obj.show(); // In B

    } 
}
