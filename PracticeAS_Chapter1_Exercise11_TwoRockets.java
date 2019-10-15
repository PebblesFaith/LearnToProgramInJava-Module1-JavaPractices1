package book.practice.assignments;

// Name: Sarai Hannah Ajai
// Online Course: Learn to Program in Java (Microsoft Dev276x)
// Book: Building Java Programs 5e
// Chapter 1 - Exercise Number 11
// Instructor: Kasey Champion
// Date: October 14, 2019

// Write a Java program called TwoRockets that generates the following output.  Use static methods
// to show structure and eliminate redundancy in your solution. Note that there are two rocket ships
// next to each other.  What redundancy can you eliminate using static methods? What redundancy
// cannot be eliminated?
public class PracticeAS_Chapter1_Exercise11_TwoRockets {
    public static void main(String[] args) {
        System.out.println();
        drawRockets(); ;
    }


    public static void drawRockets() {
        drawCone();
        drawBox();
        System.out.println("| United|     | United|");
        System.out.println("| States|     | States|");
        drawBox();
        drawCone();
        System.out.println();
        System.out.println("I had coded one static method to eliminate two rockets redundancy drawings.");
        System.out.println("And, I could not eliminate the defined methods two rockets drawing redundancies.");
        System.out.println("in created two rockets shapes.");
    }

    public static void drawBox() {
        System.out.println("+-------+     +-------+");
        System.out.println("|       |     |       | ");
        System.out.println("|       |     |       |");
        System.out.println("+-------+     +-------+");
    }

    public static void drawCone() {
        System.out.println("   /\\            /\\      ");
        System.out.println("  /   \\         /   \\    ");
        System.out.println(" /     \\       /     \\   ");
    }

    public static void drawV() {
        System.out.println(" \\    /        \\    /   ");
        System.out.println("  \\  /          \\  /    ");
        System.out.println("   \\/            \\/     ");
    }


}
