public class Literals {
    
    public static void main(String[] args) {

        //literal integer
        int myInt = 5;
        System.out.println(myInt); // use myInt

        int myInt2 = 0b101; // binary literal
        System.out.println(myInt2); // use myInt2
        int myInt3 = 05; // octal literal
        int myInt4 = 0x5; // hexadecimal literal


        
        //literal long
        long myLong = 9223372036854775807L;
        long myLong2 = 10_000_000_000L; // underscore in number

        //literal float
        float myFloat = 3.4f;
        float myFloat2 = 3.4F; // f or F for float

        //literal double
        double myDouble = 3.4;
        double myDouble2 = 3.4d;
        double myDouble3 = 3.4D; // d or D for double
        double myDouble4 = 3.4e2; // scientific notation

        //literal char
        char myChar = 'a';
        char myChar2 = '\u0061'; // unicode for a

        System.out.println(myChar);

        myChar++; // increment char  // myChar is now b
        System.out.println(myChar); // prints b  // myChar is now b
    }
}
