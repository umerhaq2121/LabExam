import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is Even number");

        else if (num / 2 != 0) {
            System.out.println(num + " is Prime Number");

        }
    }
}
