import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        //Без остановки вводятся в программу числа.
        //Остановить считывание новых чисел, когда будет введено отрицательное число

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        //while (x > 0) {
        //    System.out.println(x);
        //    x--;
        //}

        do {
            System.out.println(x);
            x--;
        } while (x > 0);

        //do {
        //    //что надо делать
        //} while (условие);
        //
        //while (условие) {
        //    //что надо делать
        //}

        //цикл while может не выполниться ни разу - думай, делай
        //но цикл do-while выполнится минимум один раз - делай, думай
        //отличаются только на 1 итерации

    }
}
