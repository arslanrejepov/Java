public class Student {
    // Private instance variables
    private String name;
    private int age;

    // No-arg constructor
    public Student() {
        this.name = "nobody";
        this.age = 20;
    }

    // Constructor with parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to compare age with another student
    public boolean isSameAge(Student other) {
        return this.age == other.age;
    }
}
