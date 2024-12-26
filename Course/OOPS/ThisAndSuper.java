package OOPS;

class A{
    public A(){ // every calss in java extends Object class by default

        //every constructor has super() as its first statement
        super(); // this super is calling the constructor of Object class

        System.out.println("Constructor A");
    }

    public A(int a){
        super();
        System.out.println("in paramaterized constructor of A");
    }
    void show(){
        System.out.println("Hello");
    }

}

class B extends A{
    public B(){
        //every constructor has super() as its first statement
        super();

        System.out.println("Constructor B");
    }

    public B(int a){
        
        //even a parametrized constructor will have super()
        // super(a);

        //this() will execute the constructer of the same class 

        this();
        System.out.println("in paramaterized constructor of B");
    }
    void show(){
        System.out.println("Hello B");
    }

}

public class ThisAndSuper {

    public static void main(String[] args) {
        // super keyword is used to refer immediate parent class instance variable.
        // super keyword is used to invoke immediate parent class method.
        // super() is used to invoke immediate parent class constructor

        // this keyword is used to refer current class instance variable.
        // this keyword is used to invoke current class method.
        // this() is used to invoke current class constructor

        B obj = new B();

    }
    
}
