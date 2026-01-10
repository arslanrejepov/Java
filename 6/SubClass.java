public class SubClass extends BaseClass {
    int yVar = 16;
    String strVar = "java program!";

    public void myPrint() {
        System.out.println("Value of yVar: " + yVar);
        System.out.println("Value of strVar: " + strVar);
    }

    public void printAll() {
        super.myPrint();
        this.myPrint();
    }
}
