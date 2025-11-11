public class TestMyDate {
    public static void main(String[] args) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", 
                               "July", "August", "September", "October", "November", "December"};
        
        MyDate date1 = new MyDate();
        System.out.println("   Year: " + date1.getYear());
        System.out.println("   Month: " + date1.getMonth() + " (" + monthNames[date1.getMonth()] + ")");
        System.out.println("   Day: " + date1.getDay());
        System.out.println("   Full date: " + monthNames[date1.getMonth()] + " " + 
                         date1.getDay() + ", " + date1.getYear());

        MyDate date2 = new MyDate(34355555133101L);
        System.out.println("   Year: " + date2.getYear());
        System.out.println("   Month: " + date2.getMonth() + " (" + monthNames[date2.getMonth()] + ")");
        System.out.println("   Day: " + date2.getDay());
        System.out.println("   Full date: " + monthNames[date2.getMonth()] + " " + 
                         date2.getDay() + ", " + date2.getYear());
        
        MyDate date3 = new MyDate(2025, 0, 15);
        System.out.println("   Year: " + date3.getYear());
        System.out.println("   Month: " + date3.getMonth() + " (" + monthNames[date3.getMonth()] + ")");
        System.out.println("   Day: " + date3.getDay());
        System.out.println("   Full date: " + monthNames[date3.getMonth()] + " " + 
                         date3.getDay() + ", " + date3.getYear());
        
        date3.setDate(561555550000L);
        System.out.println("   Updated date: " + monthNames[date3.getMonth()] + " " + 
                         date3.getDay() + ", " + date3.getYear());
    }
}