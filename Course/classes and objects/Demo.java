class  Calculator {
    
    // attributes
    int num1;
    int num2; // instance variables

    // constructors
    Calculator() {
        num1 = 0;
        num2 = 0;
    }

    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    
    // methods
    void add() {
        System.out.println(num1 + num2);
    }
    
    void subtract() {
        System.out.println(num1 - num2);
    }
    
    void multiply() {
        System.out.println(num1 * num2);
    }
    
    void divide() {
        System.out.println(num1 / num2);
    }

    public int add(int num1, int num2) {
        return num1 + num2;  // num1 and num2 are local variables
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }



    
}

public class Demo {
    
    public static void main(String[] args) {
        
        // classes and objects
        
        // create a new object of the class Calculator

        int myInt = 5; // local variable

        Calculator myCalculator; // reference variable
        myCalculator = new Calculator(); // object

        // set the values of the attributes

        myCalculator.num1 = myInt; // instance variables
        myCalculator.num2 = 3;

        // call the methods

        myCalculator.add();
        myCalculator.subtract();
        myCalculator.multiply();
        myCalculator.divide();


        // method overloading

        Calculator myCalculator2 = new Calculator();

        System.out.println(myCalculator2.add(5, 3));
        System.out.println(myCalculator2.subtract(5, 3));
        System.out.println(myCalculator2.multiply(5, 3));
        System.out.println(myCalculator2.divide(5, 3));


        System.out.println(myCalculator2.add(5, 3, 2));

        // 
    }
}