public class TestStudent{
    public static void main(String[] args){
        Student st1 = new Student();
        st1.setName("Mike James");
        st1.setAge(20);
        Student st2 = new Student("Eduard Chris",21);
        Student st3=new Student("Anna Khilova",20);

        System.out.println(st1.getName()+ " is "+st1.getAge()+" years old;");
        System.out.println(st2.getName()+ " is "+st2.getAge()+" years old;");
        System.out.println(st3.getName()+ " is "+st3.getAge()+" years old;");

        System.out.println(st1.getName()+ " and "+ st2.getName()+" are in same age:"+st1.isSameAge(st2));
        System.out.println(st2.getName()+ " and "+ st3.getName()+" are in same age:"+st2.isSameAge(st3));
        System.out.println(st1.getName()+ " and "+ st3.getName()+" are in same age:"+st1.isSameAge(st3));

    }
}