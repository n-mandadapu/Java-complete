public class ArrayDemo {
    
    public static void main(String[] args) { //string[] args is an array of strings that stores the command-line arguments passed to the program

        // we can also use String a[] 
        
        // declare an array of integers
        int[] myArray; // this is a reference to an array of integers
        myArray = new int[5]; // this creates an array of integers with 5 elements
        
        // assign values to the array
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
        
        // access the elements of the array
        System.out.println(myArray[0]); // prints 1
        System.out.println(myArray[1]); // prints 2
        System.out.println(myArray[2]); // prints 3
        System.out.println(myArray[3]); // prints 4
        System.out.println(myArray[4]); // prints 5
        
        // declare and initialize an array of integers
        int[] myArray2 = {1, 2, 3, 4, 5};
        
        // access the elements of the array
        System.out.println(myArray2[0]); // prints 1
        System.out.println(myArray2[1]); // prints 2
        System.out.println(myArray2[2]); // prints 3
        System.out.println(myArray2[3]); // prints 4
        System.out.println(myArray2[4]); // prints 5
        
        // declare and initialize an array of strings
        String[] myArray3 = {"apple", "banana", "cherry"};
        
        // access the elements of the array
        System.out.println(myArray3[0]); // prints apple
        System.out.println(myArray3[1]); // prints banana
        System.out.println(myArray3[2]); // prints cherry
        

        // default values
        int[] myArray5 = new int[5];
        System.out.println(myArray5[0]); // prints 0
        System.out.println(myArray5[1]); // prints 0

        // length of an array
        System.out.println(myArray.length); // prints 5

        // iterate over an array
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        // enhanced for loop
        for (int element : myArray) {
            System.out.println(element);
        }


        // declare and initialize a two-dimensional array
        int[][] myArray4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        // access the elements of the array
        System.out.println(myArray4[0][0]); // prints 1
        System.out.println(myArray4[0][1]); // prints 2
        System.out.println(myArray4[0][2]); // prints 3
        System.out.println(myArray4[1][0]); // prints 4
        System.out.println(myArray4[1][1]); // prints 5

        // print in a matrix format
        for (int i = 0; i < myArray4.length; i++) {
            for (int j = 0; j < myArray4[i].length; j++) {
                System.out.print(myArray4[i][j] + " ");
            }
            System.out.println();
        }

        // enhanced for loop
        for (int[] row : myArray4) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // jagged array

        int[][] myArray6 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        // print in a matrix format
        for (int i = 0; i < myArray6.length; i++) {
            for (int j = 0; j < myArray6[i].length; j++) {
                System.out.print(myArray6[i][j] + " ");
            }
            System.out.println();
        }

        // enhanced for loop
        for (int[] row : myArray6) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        int[][] myArray7 = new int[5][];
        myArray7[0] = new int[1];
        myArray7[1] = new int[2];
        myArray7[2] = new int[3];
        myArray7[3] = new int[4];
        myArray7[4] = new int[5];

        //assign the values using math.random

        for (int i = 0; i < myArray7.length; i++) {
            for (int j = 0; j < myArray7[i].length; j++) {
                myArray7[i][j] = (int) (Math.random() * 100);
            }
        }

        // print in a matrix format
        for (int i = 0; i < myArray7.length; i++) {
            for (int j = 0; j < myArray7[i].length; j++) {
                System.out.print(myArray7[i][j] + " ");
            }
            System.out.println();
        }


        //drawbacks of arrays
        // 1. fixed size
        // 2. homogeneous elements
        // 3. no built-in methods
        

    }
    
}
