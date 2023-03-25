import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = Integer.parseInt(sc.nextLine());
        int sum = 0;

        while (num > 0){
            sum += num % 10;
            num /= 10;
        }

        System.out.print("Result: " + sum);
    }


}