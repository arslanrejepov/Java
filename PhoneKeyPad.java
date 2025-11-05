import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String:");
        String str= input.next().toLowerCase();

        String result = "";

        for (int i=0;i<str.length();i++){
            char ch =str.charAt(i);

            switch (ch) {
                case 'a':
                case 'b':
                case 'c':
                    result += "2";
                    break;
                case 'd':
                case 'e':
                case 'f':
                    result += "3";
                    break;
                case 'g':
                case 'h':
                case 'i':
                    result += "4";
                    break;
                case 'j':
                case 'k':
                case 'l':
                    result += "5";
                    break;
                case 'm':
                case 'n':
                case 'o':
                    result += "6";
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    result += "7";
                    break;
                case 't':
                case 'u':
                case 'v':
                    result += "8";
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    result += "9";
                    break;
                default:
                    result += ch;
                    break;
            }
        }
        System.out.println("Phone keypad digits: " + result);
        input.close();
    }
}
