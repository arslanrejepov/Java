public class ArrayMethods {
    public int duplicate(char[] array1, char[] array2) {
        int length = Math.min(array1.length, array2.length);
        for (int i = 0; i < length; i++) {
            array2[i] = array1[i];
        }
        return length;
    }

    public boolean same(char[] array1, char[] array2) {
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }
}
