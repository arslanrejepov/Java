import java.util.GregorianCalendar;

public class CalendarDemo {
    public static void main(String[] args) {
        // 1) Current date
        GregorianCalendar cal = new GregorianCalendar();
        printYMD("Current date", cal);

        // 2) Set milliseconds since Jan 1, 1970
        cal.setTimeInMillis(1234567898765L);
        printYMD("Date for 1234567898765L", cal);
    }

    public static void printYMD(String label, GregorianCalendar cal) {
        int year = cal.get(GregorianCalendar.YEAR);
        int month = cal.get(GregorianCalendar.MONTH) + 1; // +1 because MONTH is 0-based
        int day = cal.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println(label + ": " + year + "-" + month + "-" + day);
    }
}
