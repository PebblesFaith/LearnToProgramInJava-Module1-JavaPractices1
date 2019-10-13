package book.practice.assignments;

// Name: Sarai Hannah Ajai
// Online Course: Learn to Program in Java (Microsoft Dev276x)
// Book: Building Java Programs 5e
// Instructor: Kasey Champion
// Date: October 11, 2019
// I am learning how to program in static method.

//Draw two box firgures using a static method.

public class PracticeG {
    public static void main(String[] args) {
        drawBox();
        System.out.println();
        drawBox();

    }
    public static void drawBox() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
}
