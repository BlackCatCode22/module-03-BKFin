package myanimals;

public class Animal {

    // Make animalCount available globally
    public static int animalCount = 0;
    
    // Assign variables to the Animal class, and any sub classes that use the Animal class
    String name;
    String gender;
    int age;
    String color;

    // Increment the global animal count each time this class is called to create an object
    public Animal () {
        animalCount++;
    }
    
}
