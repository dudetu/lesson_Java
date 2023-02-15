import java.util.Scanner;

public class CycleSuperAdditionalExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int a = 1;

        while (a <= max) {
            System.out.println(a);
            a *= 2;                         // a = 2 * a;
        }
    }
}
