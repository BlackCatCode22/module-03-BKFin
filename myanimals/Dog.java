package myanimals;

public class Dog extends Animal{

    public static int dogCount = 0;
    String breed;

    public void bark() {
        System.out.println("Bark");
    }   

    public Dog () {
        dogCount++;
    }
 
}
