import java.util.Scanner;

public class HomeworkSecondTask {

    public static void main(String[] args) {
        //В программу вводится 1 число. Выведите на экран его факториал, используя цикл while
        //https://math-prosto.ru/ru/pages/factorial/factorial/

        //7!=1*2*3*4*5*6*7
        //3!=1*2*3
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int i = 1;
        int answer = 1;

        while (i <= x) {
            answer *= i;
            i++;
        }


        System.out.println(answer);
    }
}
