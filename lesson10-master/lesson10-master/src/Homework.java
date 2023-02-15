import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        //Найдите следующее четное число.
        //Например, вводится 140 -> выводим 142, вводится 93 -> выводим 94.
        //Решить задачу с помощью if

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        //1 способ
        //if (number % 2 == 0) {
        //    System.out.println(number + 2);
        //}
        //else {
        //    System.out.println(number + 1);
        //}

        //number /= 2; //1230 -> 615, 1231 -> 615
        //number++;
        //number *= 2;

        System.out.println(number);




        //42 (21-ое четное число) -> 44 (22-ое)
        //38 (19-ое) -> 40 (20-ое)
        //1230 (615-ое) -> 1232 (616-ое)


        //1230 (615-ое), 1231(615-ого + 1) -> 1232 (616-ое)
        //1231 -> 1232 (616-ое)
        //11 -> 12




        System.out.println("Hello world!");
    }
}