import java.util.Arrays;

public class ElonMask {

    public static void main(String[] args) {
        int[] rocketTemp = new int[100];

        System.out.println(Arrays.toString(rocketTemp));

        rocketTemp[5] = 10_000;
        rocketTemp[0] = -100;
        rocketTemp[9] = 99;

        System.out.println(Arrays.toString(rocketTemp));

        rocketTemp[0] = 11;
        rocketTemp[1] = 11;
        rocketTemp[2] = 11;
        rocketTemp[3] = 11;
        rocketTemp[4] = 11;
        rocketTemp[5] = 11;
        rocketTemp[6] = 11;
        rocketTemp[7] = 11;
        rocketTemp[8] = 11;
        rocketTemp[9] = 11;

        System.out.println(Arrays.toString(rocketTemp));

        for (int i = 90; i < 100; i++) {
            rocketTemp[i] = 777;
            System.out.println(Arrays.toString(rocketTemp));
        }



        //60 мин. 1 мин = 60с. 60*60=3600

    }
}
