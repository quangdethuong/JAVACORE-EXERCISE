import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String reverse = "";
        for (int i = str.length()-1; i>=0 ; i--) {
            reverse += str.charAt(i);
        }

        System.out.print("Reverse String is: " + reverse);
    }

}