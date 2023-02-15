public class ForExamplesHard {

    public static void main(String[] args) {

        //for (int i = 0; i < 100;) { //бесконечный цикл
        //    System.out.println(i);
        //}

        //for (int i = 0; ; i++) { //бесконечный цикл
        //    System.out.println(i);
        //}

        //for (;;) { //бесконечный цикл
        //    System.out.println(123);
        //}

        //Найти наименьший делитель числа.
        //Найти число, на которое наше число делится без остатка. (не считая 1)

        //4 -> 2

        //7 -> 7

        //100 -> 2

        //13 -> 13

        //int number = 456;
        //int saver = 0;
//
        //for (int i = 2; i <= number; i++) {
        //    if (number % i == 0) {
        //        System.out.println(i);
        //        saver = i;
        //        break;
        //    }
        //}

        //System.out.println("Я все еще работаю");
        //System.out.println(saver);


        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("---------------------------------");
            System.out.println("Как прекрасно жизнь без continue. I=" + i);
            System.out.println("Супер-мега-класс");
            System.out.println("Вообще суппер");
        }

        for (int i = 0; i < 5; i++) {
            if (i != 3) {
                System.out.println("---------------------------------");
                System.out.println("Как прекрасно жизнь без continue. I=" + i);
                System.out.println("Супер-мега-класс");
                System.out.println("Вообще суппер");
            }
        }


    }
}
