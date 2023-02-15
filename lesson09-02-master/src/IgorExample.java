import java.util.Scanner;

public class IgorExample {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            Scanner scanner = new Scanner(System.in);

            int first = scanner.nextInt();

            int second = scanner.nextInt();

            if (first == 36 && second == 17) {
                System.out.println("JACKPOT!!!");
            }
            else if (first == 36 || second == 17) {
                System.out.println("Small prize!!!");
            }
            else {
                System.out.println("You lost everything \uD83D\uDE31");
            }

        }

    }
}
