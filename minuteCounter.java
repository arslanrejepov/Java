import java.util.Scanner;

public class minuteCounter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the minutes:");
        int num=input.nextInt();
        int days = num / (24 * 60);
        int years = num / (365 * 24 * 60);
        System.out.println("Days: " + days);
        System.out.println("Years: " + years);
    }
}
