package com.example;

public class App {
    public static void main(String[] args) {
        // Print a simple message to the console
        System.out.println("Hello, Snyk!");

        // Simulate a vulnerable function call (e.g., logging)
        vulnerableLogging();
    }

    // A method to simulate a vulnerability
    public static void vulnerableLogging() {
        // Example of vulnerable log message (pretend Log4j 1.x is being used)
        // In a real-world example, this would be where the vulnerability could be exploited
        System.out.println("This is a simulated vulnerable log message.");
        System.out.println("This is a simulated vulnerable log message.");
    }
}
