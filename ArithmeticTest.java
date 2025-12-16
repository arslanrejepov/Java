public class ArithmeticTest {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java ArithmeticTest <int1> <operator> <int2>");
            return;
        }

        String s1 = args[0];
        String opRaw = args[1];
        String s2 = args[2];

        int a, b;

        // Parse first operand
        try {
            a = Integer.parseInt(s1);
        } catch (NumberFormatException e) {
            System.out.println("Wrong Input: " + s1);
            return;
        }

        // Parse second operand
        try {
            b = Integer.parseInt(s2);
        } catch (NumberFormatException e) {
            System.out.println("Wrong Input: " + s2);
            return;
        }

        // Normalize operator (handle x, and different dash characters)
        String op = opRaw;
        if (op.equalsIgnoreCase("x") || op.equals("×")) op = "*";
        if (op.equals("‐") || op.equals("–") || op.equals("—")) op = "-";

        double result;

        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                // make it real division
                result = (double) a / b;
                break;
            default:
                System.out.println("Wrong Input: " + opRaw);
                return;
        }

        // Print using * for multiplication like the sample
        String printOp = op.equals("*") ? "*" : op;
        System.out.println(a + " " + printOp + " " + b + " = " + result);
    }
}
