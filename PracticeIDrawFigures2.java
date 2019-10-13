package book.practice.assignments;

// Name: Sarai Hannah Ajai
// Online Course: Learn to Program in Java (Microsoft Dev276x)
// Book: Building Java Programs 5e
// Instructor: Kasey Champion
// Date: October 11, 2019
// Case Study: DrawFigures Structured Version using Method Calls for Flow of Control.

//This program draws three text figures using a static method to represent each figure.

public class PracticeIDrawFigures2 {
    public static void main(String[] args) {
        System.out.println();
        drawDiamond();
        drawX();
        drawRocket();
    }

    public static void drawDiamond() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /     \\");
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }

    public static void drawX() {
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /     \\");
        System.out.println();
    }

    public static void drawRocket() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /     \\");
        System.out.println("+-------+");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("+-------+");
        System.out.println("|United |");
        System.out.println("|States |");
        System.out.println("+-------+");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("+-------+");
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /     \\");
        System.out.println();
    }

}
