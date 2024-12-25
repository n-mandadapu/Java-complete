class Mobile {
    int price;
    String brand ;
    String model;

    public Mobile() {
        System.out.println("Constructor");
        brand = "Samsung";

    }

    static String country = "India"; // static variable

    // static method
    static void showCountry() {
        System.out.println("Country: " + country);
    }

    // we cant access non static variable in static method
    // void showPrice() {
    //     System.out.println("Price: " + price);
    // }

    // we can access static variable in non static method
    void showBrand() {
        System.out.println("Brand: " + brand);
        System.out.println("Country: " + country);
    }

    // static block
    static {

        country = "USA";

        System.out.println("Static block");
    }

}
public class StaticKeyWord {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.price = 1000;
        m1.brand = "Samsung";
        m1.model = "Galaxy";
        System.out.println(m1.price + " " + m1.brand + " " + m1.model);

        Mobile m2 = new Mobile();
        m2.price = 2000;
        m2.brand = "Apple";
        m2.model = "Iphone";
        System.out.println(m2.price + " " + m2.brand + " " + m2.model);

        Mobile m3 = new Mobile();
        m3.price = 3000;
        m3.brand = "OnePlus";
        m3.model = "One";
        System.out.println(m3.price + " " + m3.brand + " " + m3.model);
    
        System.out.println(Mobile.country); // India
        // Mobile.country = "USA";
        // System.out.println(Mobile.country); // USA

        System.out.println(Mobile.country); // USA
        
        //static block will be executed only once 
        // even if we create multiple objects
        // static block will load before main method 
        // and before object creation
        // static block will be executed
    }
    
}
