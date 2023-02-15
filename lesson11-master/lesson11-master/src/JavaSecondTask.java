import java.util.Scanner;

public class JavaSecondTask {

    public static void main(String[] args) {

        //В программу вводится 1 число. Выведите на экран его факториал, используя цикл while
        //https://math-prosto.ru/ru/pages/factorial/factorial/

        //7!=1*2*3*4*5*6*7=5040

        //3!=1*2*3=6

        //5!=1*2*3*4*5=120
        //

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int answer = 1;

        for (int i = 1; i <= x; i++) {
            answer = answer * i;
        }


        System.out.print(x);
        System.out.print("!=");

        for (int i = 1; i < x; i++) {
            System.out.print(i);
            System.out.print("*");
        }

        System.out.print(x);
        System.out.print("=");
        System.out.print(answer);


        //Скинуть на гитхаб уроки
        //конспект скинуть
        //найти пост



        //в теле и вне его

    }
}
