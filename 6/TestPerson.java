public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St", "123-456-7890", "john@example.com");
        Student student = new Student("Jane Doe", "456 Oak St", "987-654-3210", "jane@example.com", Student.FRESHMAN);
        Employee employee = new Employee("Jim Beam", "789 Pine St", "555-555-5555", "jim@example.com", "Room 101", 50000, "2020-01-01");
        Faculty faculty = new Faculty("Dr. Smith", "123 Maple St", "444-444-4444", "smith@example.com", "Room 202", 70000, "2015-08-15", "9 AM - 5 PM", "Professor");
        Staff staff = new Staff("Alice Johnson", "789 Birch St", "333-333-3333", "alice@example.com", "Room 303", 40000, "2018-09-01", "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
