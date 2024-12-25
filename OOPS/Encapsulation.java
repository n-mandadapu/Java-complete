package OOPS;

class Human{
    private String name;
    private int age;
    private String address;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
        //this keyword is used to refer to the current object.
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}
public class Encapsulation {
    
    // Encapsulation is a mechanism where you bind your data(variables) and code(methods) together as a single unit.
    // Encapsulation is a technique used for making the fields in a class private and providing access to the fields via public methods.
    // Encapsulation is used to hide the values or state of a structured data object inside a class, preventing unauthorized parties' direct access to them.
    // Encapsulation is used to restrict access to the variables and methods of the class.
    // Encapsulation is used to prevent the accidental modification of the data.
    // Encapsulation is used to improve the maintainability and flexibility of the code.
    // Encapsulation is used to improve the reusability of the code.
    // Encapsulation is used to improve the security of the code.
    // Encapsulation is used to improve the performance of the code.
    // Encapsulation is used to improve the readability of the code.
    // Encapsulation is used to improve the scalability of the code.
    // purpose of encapsulation is to protect an object from unwanted access by clients.
    public static void main(String[] args) {
        Human e = new Human();
        e.setName("John");
        e.setAge(25);
        e.setAddress("USA");
        
        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
        System.out.println("Address: " + e.getAddress());
    }
}
