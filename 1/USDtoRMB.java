import java.util.Scanner;

public class USDtoRMB {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter exchange rate from USD to RMB: ");
        float rate = input.nextFloat();

        System.out.print("Enter 0 for converting USD to RMB and 1 vice versa: ");
        int converter = input.nextInt();

        switch (converter) {
            case 0: {
                System.out.print("Enter USD amount: ");
                double dollar = input.nextDouble();
                double yuan = dollar * rate;
                System.out.println("$" + dollar + " is " + yuan + " RMB.");
                break;
            }
            case 1: {
                System.out.print("Enter RMB amount: ");
                double yuan = input.nextDouble();
                double dollar = yuan / rate;
                System.out.println(yuan + " RMB is $" + dollar + ".");
                break;
            }
            default:
                System.out.println("Invalid input! Please enter 0 or 1.");
        }
    }
}
