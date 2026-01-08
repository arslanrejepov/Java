class TestMyInteger{
    public static void main(String[] args) {
        MyInteger num1 = new MyInteger(17);
        MyInteger num2 = new MyInteger(24);
        MyInteger num3 = new MyInteger(17);
    
        System.out.println("num1.getValue(): " + num1.getValue());
        System.out.println("num2.getValue(): " + num2.getValue());
        System.out.println();

        System.out.println("num1 (" + num1.getValue() + "):");
        System.out.println("  isEven(): " + num1.isEven());
        System.out.println("  isOdd(): " + num1.isOdd());
        System.out.println("  isPrime(): " + num1.isPrime());
        System.out.println();
        
        System.out.println("num2 (" + num2.getValue() + "):");
        System.out.println("  isEven(): " + num2.isEven());
        System.out.println("  isOdd(): " + num2.isOdd());
        System.out.println("  isPrime(): " + num2.isPrime());
        System.out.println();
    
        System.out.println("MyInteger.isEven(10): " + MyInteger.isEven(10));
        System.out.println("MyInteger.isOdd(15): " + MyInteger.isOdd(15));
        System.out.println("MyInteger.isPrime(23): " + MyInteger.isPrime(23));
        System.out.println("MyInteger.isPrime(20): " + MyInteger.isPrime(20));
        System.out.println();
        
        System.out.println("MyInteger.isEven(num2): " + MyInteger.isEven(num2));
        System.out.println("MyInteger.isOdd(num1): " + MyInteger.isOdd(num1));
        System.out.println("MyInteger.isPrime(num1): " + MyInteger.isPrime(num1));
        System.out.println();
        
        System.out.println("num1.equals(17): " + num1.equals(17));
        System.out.println("num1.equals(24): " + num1.equals(24));
        System.out.println("num1.equals(num2): " + num1.equals(num2));
        System.out.println("num1.equals(num3): " + num1.equals(num3));
        System.out.println();
        
        char[] chars1 = {'1', '2', '3', '4'};
        char[] chars2 = {'-', '5', '6', '7'};
        char[] chars3 = {'+', '9', '8', '7'};
        System.out.println("parseInt(['1','2','3','4']): " + MyInteger.parseInt(chars1));
        System.out.println("parseInt(['-','5','6','7']): " + MyInteger.parseInt(chars2));
        System.out.println("parseInt(['+','9','8','7']): " + MyInteger.parseInt(chars3));
        System.out.println();
        
        System.out.println("parseInt(\"456\"): " + MyInteger.parseInt("456"));
        System.out.println("parseInt(\"-789\"): " + MyInteger.parseInt("-789"));
        System.out.println("parseInt(\"+321\"): " + MyInteger.parseInt("+321"));
        System.out.println();
        
        int[] testPrimes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int[] testNonPrimes = {1, 4, 6, 8, 9, 10, 12, 15, 18, 20};
        
        System.out.print("Prime numbers: ");
        for (int p : testPrimes) {
            System.out.print(p+" ");
        }
        System.out.println();
        
        System.out.print("Non-prime numbers: ");
        for (int np : testNonPrimes) {
            System.out.print(np+" ");
        }
    }
}