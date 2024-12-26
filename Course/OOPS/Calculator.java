package OOPS;

class Calculator{
    public void add(int a, int b){
        System.out.println("Sum: " + (a+b));
    }
    public void sub(int a, int b){
        System.out.println("Difference: " + (a-b));
    }
    public void mul(int a, int b){
        System.out.println("Product: " + (a*b));
    }
    public void div(int a, int b){
        System.out.println("Quotient: " + (a/b));
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int sub(int a, int b, int c){
        return a-b-c;
    }

    public int mul(int a, int b, int c){
        return a*b*c;
    }

    
}