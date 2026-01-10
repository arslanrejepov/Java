import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test the no-arg constructor
        Student student1 = new Student();
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 Age: " + student1.getAge());

        // Test the constructor with parameters
        System.out.print("Enter student 2 name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student 2 age: ");
        int age = scanner.nextInt();
        Student student2 = new Student(name, age);

        // Test the isSameAge() method
        System.out.println("Is student1 and student2 of the same age? " + student1.isSameAge(student2));

        // Close scanner
        scanner.close();
    }
}
