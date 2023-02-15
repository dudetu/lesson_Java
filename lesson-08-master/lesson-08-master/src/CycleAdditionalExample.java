import java.util.Scanner;

public class CycleAdditionalExample {

    public static void main(String[] args) {

        //вводится первое число с консоли, вводится второе число. Вывести все числа между этими значениями

        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int finish = scanner.nextInt();

        int counter = start + 1;

        while (counter < finish) {
            System.out.println(counter);
            counter++;
        }


    }
}
