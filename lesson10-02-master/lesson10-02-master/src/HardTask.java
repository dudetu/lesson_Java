import java.util.Arrays;

public class HardTask {
    public static void main(String[] args) {

        //Числа Фибоначчи
        //1, 1, 2, 3, 5, 8, 13, 21, 34 ....

        //a[i] = a[i-1] + a[i-2]

        int[] array = new int[20];

        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        System.out.println(Arrays.toString(array));


    }
}
