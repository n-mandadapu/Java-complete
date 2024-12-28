public class TypeConversion {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
    
        // conversion and casting

        // implicit conversion
        int myInt = 5;
        long myLong = myInt; // no explicit cast needed
        System.out.println(myLong); // use the variable

        // explicit conversion
        long myLong2 = 5;
        int myInt2 = (int) myLong2; // explicit cast needed

        // implicit casting
        int myInt3 = 5;
        double myDouble = myInt3; // no explicit cast needed

        //what happens if we try to convert a int to a byte which is too large
        int myInt4 = 130;
        byte myByte = (byte) myInt4; // explicit cast needed
        System.out.println(myByte); // prints -126 // 130 - 256 = -126

        int myInt5 = 257;
        byte myByte2 = (byte) myInt5; // explicit cast needed
        System.out.println(myByte2); // prints 1 // 257 - 256 = 1

        // type promotion
        int myInt6 = 5;
        double myDouble2 = 3.4;
        double myDouble3 = myInt6 + myDouble2; // int is promoted to double

        // type promotion with byte
        byte myByte3 = 5;
        byte myByte4 = 3;
        int myInt7 = myByte3 + myByte4; // byte is promoted to int



    }
    
}
