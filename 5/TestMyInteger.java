public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger myInt = new MyInteger(17);

        // Test instance methods
        System.out.println("Is 17 even? " + myInt.isEven());
        System.out.println("Is 17 odd? " + myInt.isOdd());
        System.out.println("Is 17 prime? " + myInt.isPrime());

        // Test static methods
        System.out.println("Is 20 even? " + MyInteger.isEven(20));
        System.out.println("Is 20 odd? " + MyInteger.isOdd(20));
        System.out.println("Is 20 prime? " + MyInteger.isPrime(20));

        // Test equals method
        System.out.println("Does 17 equal 17? " + myInt.equals(17));
        System.out.println("Does 17 equal another MyInteger(17)? " + myInt.equals(new MyInteger(17)));

        // Test parseInt method
        char[] charArray = {'1', '2', '3'};
        System.out.println("Parsed int from char array: " + MyInteger.parseInt(charArray));
        System.out.println("Parsed int from string: " + MyInteger.parseInt("123"));
    }
}
