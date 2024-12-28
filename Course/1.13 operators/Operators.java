public class Operators {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        int myInt = 5;
        int myInt2 = 3;

        // arithmetic operators
        int sum = myInt + myInt2; // addition

        int difference = myInt - myInt2; // subtraction

        int product = myInt * myInt2; // multiplication

        int quotient = myInt / myInt2; // division

        int remainder = myInt % myInt2; // modulus

        // increment and decrement operators

        int myInt3 = 5;
        myInt3++; // increment by 1
        System.out.println(myInt3); // prints 6

        int myInt4 = 5;
        myInt4--; // decrement by 1

        // assignment operators
        int myInt5 = 5;
        myInt5 += 3; // equivalent to myInt5 = myInt5 + 3;

        int myInt6 = 5;
        myInt6 -= 3; // equivalent to myInt6 = myInt6 - 3;

        int myInt7 = 5;
        myInt7 *= 3; // equivalent to myInt7 = myInt7 * 3;

        int myInt8 = 5;
        myInt8 /= 3; // equivalent to myInt8 = myInt8 / 3;


        int myInt9 = 5;
        myInt9 %= 3; // equivalent to myInt9 = myInt9 % 3;

        // comparison operators

        int myInt10 = 5;
        int myInt11 = 3;
        
        boolean isEqual = myInt10 == myInt11; // equal to

        boolean isNotEqual = myInt10 != myInt11; // not equal to

        boolean isGreaterThan = myInt10 > myInt11; // greater than

        boolean isLessThan = myInt10 < myInt11; // less than

        boolean isGreaterThanOrEqual = myInt10 >= myInt11; // greater than or equal to

        boolean isLessThanOrEqual = myInt10 <= myInt11; // less than or equal to

        // logical operators

        boolean myBoolean = true;
        boolean myBoolean2 = false;

        boolean and = myBoolean && myBoolean2; // and

        boolean or = myBoolean || myBoolean2; // or

        boolean not = !myBoolean; // not

        // bitwise operators

        int myInt12 = 5;
        int myInt13 = 3;

        int and2 = myInt12 & myInt13; // and // 1 & 1 = 1, 1 & 0 = 0, 0 & 0 = 0

        int or2 = myInt12 | myInt13; // or // 1 | 1 = 1, 1 | 0 = 1, 0 | 0 = 0

        int xor = myInt12 ^ myInt13; // xor // 1 ^ 1 = 0, 1 ^ 0 = 1, 0 ^ 0 = 0

        int not2 = ~myInt12; // not // ~1 = 0, ~0 = 1

        int leftShift = myInt12 << 1; // left shift // 5 << 1 = 10

        int rightShift = myInt12 >> 1; // right shift // 5 >> 1 = 2

        int zeroFillRightShift = myInt12 >>> 1; // zero fill right shift // 5 >>> 1 = 2

        // ternary operator

        int myInt14 = 5;
        int myInt15 = 3;

        int result = myInt14 > myInt15 ? myInt14 : myInt15; // if myInt14 > myInt15 then result = myInt14 else result = myInt15

        //difference between ++i and i++

        int i = 5;
        int j = 5;

        int k = i++; // k = 5, i = 6
        int l = ++j; // l = 6, j = 6

        // difference between and and &&
        int m = 5;
        int n = 3;

        if (m > n & m < n) { // both conditions are checked
            System.out.println("This will not be printed"); //
        }

        if (m > n && m < n) { // second condition is not checked
            System.out.println("This will not be printed");
        }

        



    }
    
}
