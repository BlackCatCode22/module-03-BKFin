package mystudents;

public class App {
    public static void main(String[] args) {
        System.out.println("\n Hello from class App \n\n");

        // Create a student object
        Student myStudent = new Student();

        // Fill the new myStudent object's data fields
        myStudent.firstName = "Dennis";
        myStudent.lastName = "Mohle";
        myStudent.gpa = 3.4;
        myStudent.major = "Computer Science";
        myStudent.city = "Fresno";

        System.out.println("\n The first name of the student is: " + myStudent.firstName + "\n");
        System.out.println("\n The last name of the student is: " + myStudent.lastName + "\n");

        moreStudents();
    }

    private static void moreStudents() {

        Student anotherStudent = new Student();

        anotherStudent.firstName = "Brian";
        anotherStudent.lastName = "Finley";
        anotherStudent.gpa = 3.8;
        anotherStudent.major = "CIT";
        anotherStudent.city = "Mariposa";

        System.out.println("\n The first name of the student is: " + anotherStudent.firstName + "\n");
        System.out.println("\n They live in the city of: " + anotherStudent.city + "\n");

        Student yetAnotherStudent = new Student();

        yetAnotherStudent.firstName = "John";
        yetAnotherStudent.lastName = "Doe";
        yetAnotherStudent.gpa = 4.0;
        yetAnotherStudent.major = "CIT";
        yetAnotherStudent.city = "Merced";

        System.out.println("\n The first name of the student is: " + yetAnotherStudent.firstName + "\n");
        System.out.println("\n Their major is: " + yetAnotherStudent.major + "\n");

    }
}
