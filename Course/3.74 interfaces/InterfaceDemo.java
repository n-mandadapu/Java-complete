// class -> class - extends 
// class -> interface - implements
// interface -> interface - extends
// interface -> class - not possible 


interface A{
    void drive(); // by default, all methods in an interface are public and abstract
    void stop();

    int a = 10; // by default, all variables in an interface are public, static, and final
}

interface X{
    void run();
}

interface Y extends A,X{ // we can extend multiple interfaces at a time
    void walk();
}

class B implements A,X{// in implements we only get the method signature , not the variables
    // we can implement multiple interfaces at a time
    
    public void drive(){
        System.out.println("New class");
    }
    public void stop(){
        System.out.println("New class");
    }
    public void run(){
        System.out.println("New class");
    }

    
}

class Devoper{
    public void code(Computer l){
        l.code();
    }
}

class Laptop extends Computer{
    public void code(){
        System.out.println("Compile");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("Compile");
    }
}

abstract class Computer{
    public abstract void code();
}

public class InterfaceDemo implements A {
    public void drive() {
        System.out.println("New class");
    }
    public void stop() {
        System.out.println("Stop");
    }
    public static void main(String[] args) {
        InterfaceDemo c = new InterfaceDemo();
        c.drive();
        c.stop();

        A b = new B();
        b.drive();

        Devoper me = new Devoper();
        Computer l = new Laptop();
        @SuppressWarnings("unused")
        Computer d1 = new Desktop();
        me.code(l);
    }
}