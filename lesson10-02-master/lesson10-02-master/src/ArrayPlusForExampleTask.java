import java.util.Arrays;
import java.util.Scanner;

public class ArrayPlusForExampleTask {
    public static void main(String[] args) {
        //Вводится число. Это скорость машины.
        //Водитель машины торзит, каждый метр машина тормозит на 5%
        //найти, какая скорость будет у машины через 100 метров тормозного пути
        //сохранить данные о каждом метре

        Scanner scanner = new Scanner(System.in);
        double speed = scanner.nextDouble();
        double[] speedArray = new double[101];

        speedArray[0] = speed;

        for (int i = 1; i < speedArray.length; i++) {
            speedArray[i] = speedArray[i - 1] * 0.99;
        }

        //скорость на текущий метр = скорость на прошлый метр * 0.95

        System.out.println(Arrays.toString(speedArray));





    }
}
