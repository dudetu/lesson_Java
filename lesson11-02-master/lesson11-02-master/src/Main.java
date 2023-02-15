import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int first = getRandomNumber();
//        System.out.println(first);

//        int second = getRandomNumber();
//        System.out.println("+" + second);

//        int answer = sum(second, first);
//        System.out.println("=" + answer);

        //с возвращаемым значением - ДЗ с проверкой
        //без возвращаемого значения - побуждающие функции - ДЗ без проверки

        //int min = Math.min(5, 4);
        //System.out.println(min);
//
        //String str = "1233";
//
        //char a = str.charAt(str.length() - 1);
//
//
        //System.out.println(Math.min(2, 5));

        //DRY - don't repeat yourself

        //Scanner scanner = new Scanner(System.in);
//
        //printHelloMessage();
        //int a = scanner.nextInt();
//
        //printHelloMessage();
        //int b = scanner.nextInt();
//
        //printHelloMessage();
        //int c = scanner.nextInt();
//
        //printHelloMessage();
        //int d = scanner.nextInt();


        int a = getNumberFromConsole();
        int b = getNumberFromConsole();
        int c = getNumberFromConsole();
        int d = getNumberFromConsole();

        int sum = a + b + c + d;
        System.out.println(sum);
    }
    public static void printHelloMessage() {
        System.out.println("Пожалуйста, введите число!");
        System.out.println("Плиз!");
        System.out.println("Вот сюда: ");
    }

    public static int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(0, 10);
        return randomNumber;
    }

    public static int sum(int first, int second) {
        return first + second;
    }

    public static int getNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);

        printHelloMessage();
        int number = scanner.nextInt();
        return number;
    }

}