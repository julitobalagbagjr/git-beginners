public class Task14 {

    static abstract class abstractClass {
        abstract void abstractMethod();

        void concreteMethod() {
            System.out.println("This is a concrete method.");
        }
    }

    static class B extends abstractClass {
        void abstractMethod() {
            System.out.println("B's implementation of abstractMethod.");
        }
    }

    static class C extends abstractClass {
        void abstractMethod() {
            System.out.println("C's implementation of abstractMethod.");
        }
    }

    public static void main(String args[]) {
        B b = new B();
        b.abstractMethod();
        b.concreteMethod();

        C c = new C();
        c.abstractMethod();
        c.concreteMethod();
    }
}