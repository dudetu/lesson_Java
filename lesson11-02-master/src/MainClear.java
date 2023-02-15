import java.util.Random;
import java.util.Scanner;

public class MainClear {
    public static void main(String[] args) {
        int sum = solve();
        System.out.println(sum);

        int a = getNumberFromConsole();
        int b = getNumberFromConsole();
    }
    public static int solve() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += getNumberFromConsole();
        }
        return sum;
    }
    public static int getNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        printHelloMessage();
        int number = scanner.nextInt();
        return number;
    }
    public static void printHelloMessage() {
        Random random = new Random();
        System.out.println("Пожалуйста, введите число!");
        System.out.println("Плиз!");
        System.out.println("Вот сюда: ");
    }
    public static int sum (int a, int b) {
        return a + b;
    }

    //для void методов - return не обязателен, использоваать по необходимости. редко, тут играет роль break
    //для любых других return строго обязателен, без него код не запустится

}