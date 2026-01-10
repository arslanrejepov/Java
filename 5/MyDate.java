import java.util.GregorianCalendar;

public class MyDate {
    // Private data fields for year, month, and day
    private int year;
    private int month;
    private int day;

    // No-arg constructor that sets the current date
    public MyDate() {
        GregorianCalendar currentDate = new GregorianCalendar();
        this.year = currentDate.get(GregorianCalendar.YEAR);
        this.month = currentDate.get(GregorianCalendar.MONTH);
        this.day = currentDate.get(GregorianCalendar.DAY_OF_MONTH);
    }

    // Constructor that takes elapsed time in milliseconds
    public MyDate(long elapsedTime) {
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.setTimeInMillis(elapsedTime);
        this.year = currentDate.get(GregorianCalendar.YEAR);
        this.month = currentDate.get(GregorianCalendar.MONTH);
        this.day = currentDate.get(GregorianCalendar.DAY_OF_MONTH);
    }

    // Constructor with year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter methods
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // Method to set the date using elapsed time in milliseconds
    public void setDate(long elapsedTime) {
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.setTimeInMillis(elapsedTime);
        this.year = currentDate.get(GregorianCalendar.YEAR);
        this.month = currentDate.get(GregorianCalendar.MONTH);
        this.day = currentDate.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
