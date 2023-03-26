import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number(n>0): ");
        int n = sc.nextInt();
        int sum = 0;
        boolean isFrist= true;
        boolean check = true;
        System.out.print("Prime number: ");
        for (int i = 2; i <= n; i++){
            for (int j = 2; j < Math.sqrt(i); i++){
                if (i % j == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                if (isFrist)
                {

                    System.out.print(i);
                    isFrist= false;
                }
                else {
                    sum = sum + i;
                    System.out.print(", " + i);

                }
            }

        }
        System.out.println();
        System.out.print("Sum prime = " + sum);

//        String str = "Hello World";
//        String subStr1 = str.substring(0, 5); // trích xuất từ ký tự đầu tiên đến ký tự thứ 5: "Hello"
//        String subStr2 = str.substring(6);
//        System.out.println(subStr2);







//        System.out.print("\nResult: " + sum);
    }
}