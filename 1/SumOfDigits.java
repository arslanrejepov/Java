import java.util.Scanner;

public class SumOfDigits{
    static void main(String[] args){
        System.out.println("Input Integer:");

        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        int sum = 0;
        while (num>0){
            sum+=(num%10);
            num/=10;
        }
        System.out.println("Sum of Digits:" + sum );
    }
}
