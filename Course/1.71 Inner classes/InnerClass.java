class Cars{
    public void start(){
        System.out.println("Car is starting");
    }
    public void stop(){
        System.out.println("Car is stopping");
    }

    class Audi{
        public void drive(){
            System.out.println("Audi is driving");
        }
    }

    static class BMW{ 
        //static can be only used with inner class, not with outer class
        // static inner class , static inner class can have static methods and static variables 
        public void drive(){
            System.out.println("BMW is driving");
        }
    }


}


public class InnerClass {
    public static void main(String[] args) {
        Cars c = new Cars();
        c.start();
        Cars.Audi a; // As Audi is inner class of Car, we need to use Car.Audi to access it
        a = c.new Audi(); // To create object of inner class, we need to use c.new where c is object of outer class
        a.drive();

        @SuppressWarnings("unused")
        Cars.BMW b = new Cars.BMW(); // As BMW is static inner class, we can access it directly
    }
}
