package myanimals;

public class Cat extends Animal{

    // Make the catCount variable available globally
    public static int catCount = 0;
    
    // Add more variables, but these are specific to the Cat Class and any subclass under the Cat class    
    String type;
    int livesRemaining;

    // Just a method, specific to the Cat class.
    public void meow() {
        System.out.println("Meow");
    }

    public Cat () {
        catCount++;
    }

}
