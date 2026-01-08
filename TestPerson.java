public class TestPerson {
    public static void main(String[] args) {
        // Test 1: set valid age
        try {
            Person p1 = new Person();
            p1.setName("Alice");
            p1.setAge(20);
            System.out.println("Valid person: " + p1);
        } catch (MinusAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Test 2: set invalid age
        try {
            Person p2 = new Person();
            p2.setName("Bob");
            p2.setAge(-5); // should throw
            System.out.println("Person: " + p2); // won't run
        } catch (MinusAgeException e) {
            System.out.println("Caught MinusAgeException: " + e.getMessage());
        }

        // Test 3: constructor with invalid age
        try {
            Person p3 = new Person("Chris", -10); // should throw
            System.out.println("Person: " + p3); // won't run
        } catch (MinusAgeException e) {
            System.out.println("Caught MinusAgeException (constructor): " + e.getMessage());
        }
    }
}
