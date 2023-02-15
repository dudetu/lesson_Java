import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Level1:
        //1) В программу (в консоль) вводится строка. Найдите длину строки, если она больше 10, то выведите true, иначе false
        //2) В программу (в консоль) вводится строка. Если первый и последний символ равны - выведите true, иначе false
        //
        //Level2:
        //В программу вводится строка из двух букв A и B, замените все буквы A на B, а все B на A. Например ABBA -> BAAB

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int len = str.length();

        //boolean answer = len > 10;
        //System.out.println(answer);

        if (len > 10) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        char first = str.charAt(0);
        char last = str.charAt(len - 1);

        if (first == last) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }






    }
}