    public class Arithmetic {
        public static void main(String[] args) {
            if (args.length != 3) {
                System.out.println("Usage: java Arithmetic <num1> <num2> <operator>");
                return;
            }

            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            char op = args[2].charAt(0);
            double result = 0;
            boolean valid = true;

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':   // <-- multiplication works here
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else {
                        System.out.println("Error: Division by zero!");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator! Use +, -, *, or /");
                    valid = false;
            }

            if (valid)
                System.out.println(num1 + "" + op + num2 + "=" + result);
        }
    }
