import java.util.Arrays;

public class ClassClass {
    public static void main(String[] args) {
        int[] firstMas = new int[100];

        for (int i = 0; i < 99; i++) {
            firstMas[i] = 10;
            System.out.println(Arrays.toString(firstMas));
        }
        firstMas[1] = 0;
        firstMas[99] = 0;
        System.out.println(Arrays.toString(firstMas));
    }
}
