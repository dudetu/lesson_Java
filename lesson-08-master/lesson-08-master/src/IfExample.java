import java.util.Scanner;

public class IfExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("Положительное число");
        }
        else {
            System.out.println("Отрицательное");
        }
    }

}
