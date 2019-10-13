package book.practice.assignments;

// Name: Sarai Hannah Ajai
// Online Course: Learn to Program in Java (Microsoft Dev276x)
// Book: Building Java Programs 5e
// Chapter 1 - Procedural Decomposition Number 23
// Instructor: Kasey Champion
// Date: October 13, 2019

public class PracticeY_Chapter1_ProceduralDecomposition23 {
    public static void first() {
        System.out.println("Inside the first method");
    }

    public static void second() {
        System.out.println("Inside the second method");
        first();
    }

    public static void third() {
        System.out.println("Inside the third method");
        first();
        second();
    }

    public static void main(String[] args) {
        first();
        third();
        second();
        third();
    }
}
