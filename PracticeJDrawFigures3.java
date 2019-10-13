package book.practice.assignments;

// Name: Sarai Hannah Ajai
// Online Course: Learn to Program in Java (Microsoft Dev276x)
// Book: Building Java Programs 5e
// Instructor: Kasey Champion
// Date: October 11, 2019
// Case Study: Final DrawFigures Structured Version without Redundancy using Method Calls for Flow of Control.

//This program draw three text figures using static methods for structure and to avoid redundancy.
public class PracticeJDrawFigures3 {
    public static void main(String[] args) {
        System.out.println();
        drawDiamond();
        drawX();
        drawRocket();
    }

    public static void drawDiamond() {
        drawCone();
        drawV();
        System.out.println();
    }

    public static void drawX() {
        drawV();
        drawCone();
        System.out.println();
    }

    public static void drawRocket() {
        drawCone();
        drawBox();
        System.out.println("United");
        System.out.println("States");
        drawBox();
        drawCone();
        System.out.println();
    }

    public static void drawBox() {
        System.out.println("+-------+");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("+-------+");
    }

    public static void drawCone() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /     \\");
    }

    public static void drawV() {
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }
 }
