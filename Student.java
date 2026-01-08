public class Student{
    private String name;
    private int age;

    public Student(){
        this.name="unknown";
        this.age=18;
    }

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public boolean isSameAge(Student other){
        return this.age==other.age;
    }
}