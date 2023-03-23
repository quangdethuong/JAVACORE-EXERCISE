import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number (greater than zero): ");
        int decimal = sc.nextInt();
        int decimal2 = decimal;
        String binary = "";

        while (decimal > 0) {
            binary = (decimal % 2 ) + binary;
            decimal = decimal / 2;

        }
        System.out.println("Binary representation of " + decimal2 + " is " + binary);
//        String binary = Integer.toBinaryString(decimal);
//        System.out.println("Binary representation of " + decimal + " is " + binary);





        System.out.print("Enter binary number: ");
//        String str = sc.nextLine();
//        int decimal3 = Integer.parseInt(str, 2);  // sẽ bị nhận chuỗi rỗng
        int str = sc.nextInt();
        int decimal3 = Integer.parseInt(String.valueOf(str), 2);

        System.out.println("Decimal representation of " + str + " is " + decimal3);

// thắc mắc

    }
}