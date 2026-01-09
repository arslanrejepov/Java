public class Arithmetic {
    public static void main(String[] args) {
        // Check if there are exactly three arguments
        if (args.length != 3) {
            System.out.println("Usage: java Arithmetic <int1> <int2> <operator>");
            return;
        }

        // Parse the integers from command line arguments
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String operator = args[2];

        // Perform the corresponding arithmetic operation based on the operator
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                // Handle division by zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = (double) num1 / num2;
                break;
            default:
                System.out.println("Invalid operator. Use one of: +, -, *, /");
                return;
        }

        // Print the result
        System.out.println(result);
    }
}
