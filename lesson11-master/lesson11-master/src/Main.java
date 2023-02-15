import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Вводится число. Напишите на экран сообщение "Я начинаю разбираться с циклами" количество раз, равное этому числу
        Scanner scanner = new Scanner(System.in);

        int countOfStrings = scanner.nextInt();

        while (countOfStrings != 0) {
            System.out.println("Я начинаю разбираться с циклами");
            countOfStrings--;
        }
    }
}