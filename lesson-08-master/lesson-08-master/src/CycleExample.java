public class CycleExample {
    public static void main(String[] args) throws InterruptedException {
        int a = 0;
        //while (a < 10_000) {
        //    a++;
        //    String str = (a % 2 == 0) ? "четное" : "нечетное";
        //    System.out.println(str);
        //}

        //while (a > 0) {
        //    Thread.sleep(1000);
        //    a--;
        //    System.out.println(a);
        //}
        //System.out.println("Таймер завершил счет");

        //while (a <= 1000) {
        //    if (a % 2 == 0) {
        //        System.out.println(a);
        //    }
        //    a++;
        //}

        //задача 1

        int b = 1;
        while (b < 100) {
            System.out.println(b);
            b += 2;
        }

        int d = 0;
        while (d < 100) {
            d++;
            if (d % 2 != 0) {
                System.out.println(d);
            }
        }


        //задача 2


        int c = 7;
        while (c < 1000) {
            System.out.println(c);
            c += 10;
        }

        int e = 0;
        while (e < 1000) {
            e++;
            if (e % 10 == 7) {
                System.out.println(e);
            }
        }


        //Вывести нечетные числа от 1 до 100
        //Вывести все числа от 0 до 10000, которые заканчиваются на 7


        //20-50



    }
}
