import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPlusFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }

        //Сохранить в массив такие числа:

        //  0   |  1   |    2   |    3   |    4    |   5 - индексы
        //------------------------------------------------
        //  0  |    1  |    4   |    9   |    16   |   25 - значение



        System.out.println(Arrays.toString(array));
        //7

        //DRY

        //DON'T REPEAT YOURSELF

    }
}
