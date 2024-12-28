final class A{
    public final void show(){
        System.out.println("In A");
    }

    public void display(){
        System.out.println("In A display");
    }
}

// class B extends A{ // error: cannot inherit from final A
//     // public void show(){ // error: show() in B cannot override show() in A
//     //     System.out.println("In B");
//     // }
// }

public class FinalKeyWord {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("unused")
        final int x = 100;
        // The final keyword in java is used to restrict the user.
        // x=200; // error: cannot assign a value to final variable x
    }


    // The final keyword in java is used to restrict the user.
    // The final keyword can be used in many contexts.
    // The final keyword can be used with variables, methods, and classes.
    // The final keyword is used to apply restrictions on class, method, and variable.
    // The final keyword is used to restrict the user.
    // The final keyword can be used in many contexts.
    // The final keyword can be used with variables, methods, and classes
}
