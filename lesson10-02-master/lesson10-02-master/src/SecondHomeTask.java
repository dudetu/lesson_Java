import java.util.Scanner;

public class SecondHomeTask {
    public static void main(String[] args) {
        //Level2:
        //Вводится строка, выведите первый ее символ на экран количество раз, равное длине всей строки. Например, строка "привет", значит результат будет такой:
        //п
        //п
        //п
        //п
        //п
        //п
        //
        //Если строка "Как дела?", то в ней 9 символов, значит ответ будет:
        //К
        //К
        //К
        //К
        //К
        //К
        //К
        //К
        //К

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char symbol = str.charAt(0);
        int size = str.length();

        while (size > 0) {
            System.out.println(symbol);
            size--;
        }





    }
}
