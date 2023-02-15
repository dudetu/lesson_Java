import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {
        int first = getNumber();
        int second = getNumber();

        int sum = sum(first, second);
        System.out.println(sum);
    }
    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static int sum(int a, int b) {
        return a + b;
    }


}
