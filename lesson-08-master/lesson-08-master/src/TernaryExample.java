import java.util.Scanner;

public class TernaryExample {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String str = (a > 26 && b > 28) ? "Едем на море" : "Сидим дома";

        System.out.println(str);

        // условие ? выбрать это значение, если условие верное : выбрать это значение, если условие неверное
        //тернарный оператор используется только при присвоении значений к переменной

        //if (a > 0) {
        //    System.out.println("Положительное число");
        //}
        //else {
        //    System.out.println("Отрицательное");
        //}

        //Вводится число, если ввелось число больше или равно 1000 - вывести на экран "Я богат"
        //Если меньше 1000, то "я бедный"
        //решить с помощью тернарного оператора

    }
}

