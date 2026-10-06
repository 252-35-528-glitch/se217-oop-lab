import java.util.Scanner;

public class JavaClass18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.println("You entered: " + num);
        sc.close();
    }
}
