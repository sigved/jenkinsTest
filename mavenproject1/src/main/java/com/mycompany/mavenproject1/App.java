package com.mycompany.mavenproject1;

/**
 * Hello world!
 *
 */
public final class App {
    /**
     * private constructor, this is a utility class.
     */
    private App() {
    }

    /**
     * the main method.
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        System.out.println("Hello World23!");
    }

    /**
     * this is always true.
     * @return true
     */
    public static boolean alwaysTrue() {
        return true;
    }

    /**
     * always false.
     * @return false
     */
    public static boolean alwaysFalse() {
        return false;
    }
}
