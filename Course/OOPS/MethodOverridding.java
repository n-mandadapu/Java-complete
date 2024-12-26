package OOPS;

class A{

    public void show(){
        System.out.println("In A");
    }

    public void display(){
        System.out.println("In A display");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B");
    }
}


public class MethodOverridding {

    public static void main(String[] args) {
        // Method Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
        // Method Overriding is used to provide the specific implementation of a method which is already provided by its superclass.
        // Method Overriding is used for runtime polymorphism.
        // Method Overriding is used to provide the specific implementation of the method that is already provided by its superclass.
        // Method Overriding is used to provide the specific implementation of the method that is already provided by its superclass.
        // Method Overriding is used to provide the specific implementation of the method that is already provided by its superclass.
        // Method Overriding is used to provide the specific implementation of the method that is already provided by its superclass.
        // Method Overriding is used to provide the specific implementation of the method that is already provided by its superclass.
        // Method Overriding is used to provide the specific implementation of the method that is already provided by its superclass.
        // Method Overriding is used to provide the specific implementation of the method that is already provided by its superclass.
        // Method Overriding is used to provide the specific implementation of the method that is already provided by its superclass.
        
        B obj = new B();
        obj.show();
        obj.display();
    }
    
}
