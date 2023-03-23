import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A(x1): ");
        double x1 = sc.nextDouble();
        System.out.print("Enter A(y1): ");
        double y1 = sc.nextDouble();

        System.out.print("Enter B(x2): ");
        double x2 = sc.nextDouble();
        System.out.print("Enter B(y2): ");
        double y2 = sc.nextDouble();

// A(x1,y1), B(x2,y2)
        double distancneAB = Math.sqrt(Math.pow(x2 - x1 ,2) + Math.pow(y2 - y1, 2));
        System.out.printf("AB = %.2f cm", distancneAB);
    }
}