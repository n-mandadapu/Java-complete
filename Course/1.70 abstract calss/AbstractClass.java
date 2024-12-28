
abstract class Car{ //abstract class can have abstract methods and non-abstract methods
    public void start(){
        System.out.println("Car is starting");
    }
    public void stop(){
        System.out.println("Car is stopping");
    }

    public abstract void drive(); // Abstract method can only be in abstract class
    public abstract void fly(); // Abstract method can only be in abstract cla
}

abstract class Audi extends Car{
    public void drive(){
        System.out.println("Audi is driving");
    }
}

class FlyingCar extends Audi{
    public void drive(){
        System.out.println("Flying car is driving");
    }
    public void fly(){
        System.out.println("Flying car is flying");
    }

    
}



public class AbstractClass {
    public static void main(String[] args) {
        Car a = new FlyingCar();
        a.start();
        // a.drive();
        a.stop();
    }
}
