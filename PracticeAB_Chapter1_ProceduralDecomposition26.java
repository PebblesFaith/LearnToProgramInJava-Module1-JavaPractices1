package book.practice.assignments;

// Name: Sarai Hannah Ajai
// Online Course: Learn to Program in Java (Microsoft Dev276x)
// Book: Building Java Programs 5e
// Chapter 1 - Procedural Decomposition Number 26
// Instructor: Kasey Champion
// Date: October 13, 2019

public class PracticeAB_Chapter1_ProceduralDecomposition26 {
    public static void method2() {
        method1();
        System.out.println("I am method 2.");
    }

    public static void method3() {
        method2();
        System.out.println("I am method 3.");
        method1();
    }
    public static void method1() {
        System.out.println("I am method 1.");
    }


    public static void main(String[] args) {
        method1();
        method3();
        method2();
        method3();
    }
}
