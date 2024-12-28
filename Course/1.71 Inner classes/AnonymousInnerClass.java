// class A {
//     public void drive() {
//         System.out.println("Old class");
//     }
// }

abstract class A{
    public abstract void drive();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        A c = new A() {
            public void drive() {
                System.out.println("New Anonymous class");
            }
        };
    }
}
