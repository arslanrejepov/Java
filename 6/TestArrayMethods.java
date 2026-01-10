public class TestArrayMethods {
    public static void main(String[] args) {
        ArrayMethods am = new ArrayMethods();
        char[] array1 = {'s', 't', 'r', 'e', 's', 's'};
        char[] array2 = new char[array1.length];

        // Duplicate array1 into array2
        int copied = am.duplicate(array1, array2);
        // Check if arrays are the same
        boolean ok = am.same(array1, array2);

        // Display the results
        System.out.println("Array1: " + new String(array1));
        System.out.println("Array2: " + new String(array2));
        System.out.println("Number of elements copied: " + copied);
        System.out.println("Arrays are the same: " + ok);
    }
}
