package mystuff;

public class Driver {

    public static void main(String[] args) {

        Stuff myComputer = new Stuff();

        myComputer.type = "PC";
        myComputer.brand = "Custom";
        myComputer.speed = 3.7;
        myComputer.memory = 32;
        myComputer.cooling = "Water";

        System.out.println("My Computer is a " + myComputer.brand + " " + myComputer.type + " with " + myComputer.memory
                + " gigs of memory, running at " + myComputer.speed + " Ghz, using " + myComputer.cooling
                + " Cooling.");

    }

}
