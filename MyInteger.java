public class MyInteger{
    private int value;

    public MyInteger(int value){
        this.value=value;
    }

    public int getValue(){
        return this.value;
    }

    public boolean isEven(){
        return isEven(value);
    }
    
    public boolean isOdd(){
        return isOdd(value);
    }

    public boolean isPrime(){
        return isPrime(value);
    }

    public static boolean isEven(int value){
        return value%2==0;
    }
    
    public static boolean isOdd(int value){
        return value%2!=0;
    }

    public static boolean isPrime(int value){
         if (value <= 1) {
            return false;
        }
        if (value == 2) {
            return true;
        }
        if (value % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(value); i += 2) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isEven(MyInteger int1){
        return int1.isEven();
    }

    public static boolean isOdd(MyInteger int1){
        return int1.isOdd();
    }

    public static boolean isPrime(MyInteger int1){
        return int1.isPrime();
    }

    public  boolean equals(int value){
        return this.value==value;
    }

    public boolean equals(MyInteger int1){
        return this.value==int1.value;
    }

    public static int parseInt(char[] chars) {
        int result = 0;
        int sign = 1;
        int startIndex = 0;
        
        if (chars[0] == '-') {
            sign = -1;
            startIndex = 1;
        } else if (chars[0] == '+') {
            startIndex = 1;
        }
        
        for (int i = startIndex; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                result = result * 10 + (chars[i] - '0');
            } else {
                throw new NumberFormatException("Invalid character: " + chars[i]);
            }
        }
        return result * sign;
    }
    
    public static int parseInt(String str) {
        return parseInt(str.toCharArray());
    }
}