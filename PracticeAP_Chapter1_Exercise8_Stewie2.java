package book.practice.assignments;

// Name: Sarai Hannah Ajai
// Online Course: Learn to Program in Java (Microsoft Dev276x)
// Book: Building Java Programs 5e
// Chapter 1 - Exercise Number 8
// Instructor: Kasey Champion
// Date: October 13, 2019

// Write a complete Java program call Stewie2 that prints the following output. Use at least
// one static method beside main.
public class PracticeAP_Chapter1_Exercise8_Stewie2 {
    public static void main(String[] args) {
        backslashes();
        barWithWords();
        forwardSlashes();
        barWithWords();
        forwardSlashes();
        barWithWords();
        forwardSlashes();
        barWithWords();
        forwardSlashes();
        barWithWords();
        forwardSlashes();
    }

    public static void backslashes() {
        System.out.println("//////////////////////");
    }

    public static void barWithWords() {
        System.out.println("|| Victory is mine! ||");
    }

    public static void forwardSlashes() {
        System.out.print("\\\\\\\\\\");
        System.out.print("\\\\\\\\\\");
        System.out.print("\\\\\\\\\\");
        System.out.print("\\\\\\\\\\");
        System.out.print("\\\\");
        System.out.println();
    }
}
