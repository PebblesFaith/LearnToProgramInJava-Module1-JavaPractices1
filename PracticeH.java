package book.practice.assignments;

// Name: Sarai Hannah Ajai
// Online Course: Learn to Program in Java (Microsoft Dev276x)
// Book: Building Java Programs 5e
// Instructor: Kasey Champion
// Date: October 11, 2019
// I am learning how to program in static method.

public class PracticeH {
    public static void main(String[] args) {
        foo();
        bar();
        System.out.println("mumble");
    }

    public static void foo() {
        System.out.println("foo");
    }

    public static void bar() {
        baz();
        System.out.println("bar");
    }

    public static void baz() {
        System.out.println("baz");
    }
}
