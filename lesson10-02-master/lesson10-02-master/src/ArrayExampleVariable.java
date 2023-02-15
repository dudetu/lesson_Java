import java.util.Arrays;
import java.util.Scanner;

public class ArrayExampleVariable {
    public static void main(String[] args) {
        String[] questions = new String[3];

        questions[0] = "1) В каком году началась столетняя война?";
        questions[1] = "2) Почему столетняя война началась в этом году";
        questions[2] = "3) Последствия войны";

        System.out.println("Введите число от 1 до 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt() - 1;

        System.out.println(questions[number]);

    }
}
