import java.util.Scanner;

public class SecondLevel {
    public static void main(String[] args) {

        //Level2:
        //В программу вводится строка из двух букв A и B, замените все буквы A на B, а все B на A. Например ABBA -> BAAB

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //ABBA
        str = str.toLowerCase();
        //abba
        str = str.replace('a', 'B'); //BbbB
        str = str.replace('b', 'A'); //BAAB

        System.out.println(str);
    }
}
