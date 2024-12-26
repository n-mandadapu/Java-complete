public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);

        String str1 = new String();
        str1 = "World";
        System.out.println(str1);

        String str2 = new String("Hello World");
        System.out.println(str2);

        System.out.println("hello"+ "world"); //helloworld
        System.out.println("hello"+ 10);  // hello10
        System.out.println("hello"+ 10.5); // hello10.5
        System.out.println("hello"+ 'a'); // helloa

        //string is immutable
        String s = "Hello";
        String s2 = s.concat("World");
        System.out.println(s); //Hello
        System.out.println(s2); //HelloWorld


        //StringBuffer is mutable and synchronized (thread safe) 
        //StringBuider is mutable and not synchronized (not thread safe)

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity()); //21
        System.out.println(sb.length()); //5
        sb.append("World");
        System.out.println(sb); //HelloWorld
        System.out.println(sb.capacity()); //21


        String s3 = sb.toString();
        System.out.println(s3); //HelloWorld
        


    }
}