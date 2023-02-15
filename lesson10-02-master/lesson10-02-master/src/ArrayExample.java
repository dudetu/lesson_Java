import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int a = 5;
        int[] hello = new int[20]; //3 ячейки с индексами 0, 1, 2
        int[][] array = new int[2][3];

        hello[10] = 77;
        array[0][0] = 23;
        array[1][1] = 45;

        System.out.println(Arrays.toString(hello));
        System.out.println(Arrays.deepToString(array));

        //2_000_000_000 * 4 байт = 8_000_000_000 байт =>
        //System.out.println(a);
        //System.out.println(Arrays.toString(hello));
//
        //System.out.println(hello[0]);
//
        //hello[0]++;
        //System.out.println(Arrays.toString(hello));
//
        //hello[10] = 500;
//
        //hello[14] = -100500;
//
        //System.out.println(Arrays.toString(hello));
        //System.out.println(hello[14]);
//
        //int x = 4;
//
        //System.out.println(hello[4]);
    }
}
