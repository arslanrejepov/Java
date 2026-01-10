public class TestMyDate {
    public static void main(String[] args) {
        // Test the no-arg constructor (current date)
        MyDate date1 = new MyDate();
        System.out.println("Current date: " + date1.getYear() + "/" + date1.getMonth() + "/" + date1.getDay());

        // Test the constructor with elapsed time (milliseconds)
        MyDate date2 = new MyDate(34355555133101L);
        System.out.println("Date from elapsed time: " + date2.getYear() + "/" + date2.getMonth() + "/" + date2.getDay());
    }
}
