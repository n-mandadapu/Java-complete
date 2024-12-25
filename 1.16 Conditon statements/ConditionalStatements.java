public class ConditionalStatements {
    
    public static void main(String[] args) {
        
        // int myInt = 5;
        // int myInt2 = 3;
        
        // // if statement
        // if (myInt > myInt2) {
        //     System.out.println("myInt is greater than myInt2");
        // }
        
        // // if else statement
        // if (myInt < myInt2) {
        //     System.out.println("myInt is less than myInt2");
        // } else {
        //     System.out.println("myInt is not less than myInt2");
        // }
        
        // // if else if statement
        // if (myInt < myInt2) {
        //     System.out.println("myInt is less than myInt2");
        // } else if (myInt > myInt2) {
        //     System.out.println("myInt is greater than myInt2");
        // } else {
        //     System.out.println("myInt is equal to myInt2");
        // }
        
        // // switch statement
        // int myInt3 = 5;
        // switch (myInt3) {
        //     case 1:
        //         System.out.println("myInt3 is 1");
        //         break;
        //     case 2:
        //         System.out.println("myInt3 is 2");
        //         break;
        //     case 3:
        //         System.out.println("myInt3 is 3");
        //         break;
        //     case 4:
        //         System.out.println("myInt3 is 4");
        //         break;
        //     case 5:
        //         System.out.println("myInt3 is 5");
        //         break;
        //     default:
        //         System.out.println("myInt3 is not 1, 2, 3, 4, or 5");
        // }

        // what happens if we remove the break statement
        int myInt4 = 2;
        
        switch (myInt4) {
            case 1:
                System.out.println("myInt4 is 1");
            case 2:
                System.out.println("myInt4 is 2");
            case 3:
                System.out.println("myInt4 is 3");
            case 4:
                System.out.println("myInt4 is 4");
            case 5:
                System.out.println("myInt4 is 5");
            default:
                System.out.println("myInt4 is not 1, 2, 3, 4, or 5");
        }

        // output: 
        // myInt4 is 2
        // myInt4 is 3
        // myInt4 is 4
        // myInt4 is 5
        // myInt4 is not 1, 2, 3, 4, or 5

        //why is this happening?
        // The switch statement will execute all the statements after the matching case statement until it reaches a break statement.
        
    }
    
}
