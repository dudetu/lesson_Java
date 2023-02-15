import java.util.Scanner;

public class ForTask {

    //Вывести четные числа от 0 до n, n - вводится с консоли

    //Вывести четные числа от n до m, причем каждое четное число должно кончаться на 2 или 6

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        //базу - 0
        //условие <= n
        //шаг +2

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        //база - n
        //условие <=m
        //шаг +2

        long start = System.currentTimeMillis();

        if (n % 2 != 0) {
            n++;
        }

        for (int i = n; i <= m; i += 2) {
            if (i % 10 == 2) {
                System.out.println(i);
            }
            if (i % 10 == 6) {
                System.out.println(i);
            }
        }

        long finish = System.currentTimeMillis();

        System.out.println(finish - start / 1000);


        //for (int i = 0; i < n; i += 2) {
        //    System.out.println(i);
        //}
    }

}
