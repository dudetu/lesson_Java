import java.util.Scanner;

public class DoWhileSecondExample {
    public static void main(String[] args) {
        //Без остановки вводятся в программу числа.
        //Остановить считывание новых чисел, когда будет введено отрицательное число

        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            number = scanner.nextInt();
        } while (number > 0);


    }
}
