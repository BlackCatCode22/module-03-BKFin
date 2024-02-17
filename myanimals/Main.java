package myanimals;

public class Main {

    public static void main(String[] args) {

        Dog myDog = new Dog();

        myDog.name = "Rover";
        myDog.age = 2;
        myDog.color = "Black";
        myDog.gender = "Female";
        myDog.breed = "Retriever";
        myDog.bark();

        System.out.println("\n The name of the cat is: " + myDog.name + "\n");
        System.out.println("\n The type of dog is: " + myDog.breed + "\n");
        System.out.println("\n The number of Animal objects is: " + Animal.animalCount + "\n");
        System.out.println("\n The number of Dog objects is: " + Dog.dogCount + "\n");

        Dog myDog2 = new Dog();
        myDog2.name = "Fido";
        myDog2.age = 3;
        myDog2.color = "Brown";
        myDog2.gender = "Male";
        myDog2.breed = "Labrador";

        System.out.println("\n The name of the cat is: " + myDog2.name + "\n");
        System.out.println("\n The type of dog is: " + myDog2.breed + "\n");
        System.out.println("\n The number of Animal objects is: " + Animal.animalCount + "\n");
        System.out.println("\n The number of Dog objects is: " + Dog.dogCount + "\n");

        Cat myCat = new Cat();

        myCat.name = "Spot";
        myCat.age = 2;
        myCat.color = "Black";
        myCat.gender = "Female";
        myCat.type = "Tabby";
        myCat.livesRemaining = 9;
        myCat.meow();

        System.out.println("\n The name of the cat is: " + myCat.name + "\n");
        System.out.println("\n The type of cat is: " + myCat.type + "\n");
        System.out.println("\n The number of Animal objects is: " + Animal.animalCount + "\n");
        System.out.println("\n The number of Cat objects is: " + Cat.catCount + "\n");

        Cat myCat2 = new Cat();

        myCat2.name = "Spot";
        myCat2.age = 2;
        myCat2.color = "Black";
        myCat2.gender = "Female";
        myCat2.type = "Tabby";
        myCat2.livesRemaining = 9;

        System.out.println("\n The name of the cat is: " + myCat2.name + "\n");
        System.out.println("\n The type of cat is: " + myCat2.type + "\n");
        System.out.println("\n The number of Animal objects is: " + Animal.animalCount + "\n");
        System.out.println("\n The number of Cat objects is: " + Cat.catCount + "\n");

    }

}
