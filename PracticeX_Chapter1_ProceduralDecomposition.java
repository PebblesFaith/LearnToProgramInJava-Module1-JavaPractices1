package book.practice.assignments;

// Name: Sarai Hannah Ajai
// Online Course: Learn to Program in Java (Microsoft Dev276x)
// Book: Building Java Programs 5e
// Chapter 1 - Procedural Decomposition Number 22
// Instructor: Kasey Champion
// Date: October 13, 2019

public class PracticeX_Chapter1_ProceduralDecomposition {
    public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with main.");
    }
        public static void message1() {
            System.out.println("This is message 1.");
        }

        public static void message2() {
            System.out.println("This is message 2.");
            message1();
            System.out.println("Done with message 2.");
        }
}
