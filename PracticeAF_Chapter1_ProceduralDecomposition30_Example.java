package book.practice.assignments;

// Name: Sarai Hannah Ajai
// Online Course: Learn to Program in Java (Microsoft Dev276x)
// Book: Building Java Programs 5e
// Chapter 1 - Procedural Decomposition Number 30
// Instructor: Kasey Champion
// Date: October 13, 2019

public class PracticeAF_Chapter1_ProceduralDecomposition30_Example {
    public static void showMessage() {
        System.out.println("The first rule of Java Club is,");
        System.out.println("The first rule of Java Club is,");
        System.out.println();
        System.out.println("you do not talk about Java Club.");
    }

    public static void main(String[] args) {
        System.out.println("The rules of Java Club.");
        showMessage();
        System.out.println();
        showMessage();
        System.out.println();
        System.out.println("a: If I change my current class header identifier to \"Demonstration\" the compiler will generate an error message because the Java file name must match the class header identifier name.");
        System.out.println("b: If I change my current method header identifier to \"MAIN\" the compiler will generate an error message because the method header identifier must start with a lowercase letter, subsequent words must be capitalized.");
        System.out.println("c: I have inserted a new line after line 21 that read \"System.out.printIn();\" that has no effect onto line 21.");
        System.out.println("d: If I change my second current method header identifier to \'printMessage\' will generate an error message because my method call statement must match my define call statement.");
        System.out.println("e: I have change line 11 to display \'public static void showMessage() and lines 20 and 22 to showMessage()\' and there are no effect in syntax errors. ");
        System.out.println("f: I have replaced line 12 and 13 with \"System.out.printIn(\'The first rule of Java Club is,\'\" and, there are no effect in syntax errors.");
    }
}
