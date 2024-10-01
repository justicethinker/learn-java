package com.demo.helloworld;

// This is a package declaration, which organizes the code into a namespace. 
// 'com.demo.helloworld' is the package name and helps prevent naming conflicts with other code.

public class helloworld {
    // This is the declaration of a public class named 'helloworld'. 
    // A class is a blueprint for creating objects in Java. The keyword 'public' means that the class is accessible to other classes.
    
    // Main function; you can also write "static public"
    // 'public' means the function is accessible from outside the class.
    // 'static' means that the method belongs to the class, not to instances of the class (objects), and can be called without creating an object.
    // 'void' indicates that the function does not return any value.
    public static void main(String[] args) {
        // 'main' is the entry point of the program. The Java Virtual Machine (JVM) looks for this method to start execution.
        // 'String[] args' is an array of strings that stores command-line arguments passed to the program when executed.
        
        // This line prints the text "Hello World !!!" to the console.
        // 'System' is a built-in Java class that provides access to system-related resources.
        // 'out' is a static member of the System class, which represents the standard output stream (usually the console).
        // 'println' is a method that prints the argument passed to it and moves the cursor to the next line.
        System.out.println("Hello World !!!"); 
    }
}
