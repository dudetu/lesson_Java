import java.util.Scanner;

public class HomeworkSecond {

    public static void main(String[] args) {
        //Джон едет на поезде к Мэри. Шерлок Холмс решил вычислить, где сейчас находится Джон:
        //ближе к нему или к Мэри.
        //Шерлок знает, с какой скоростью едет поезд и сколько часов он уже едет.
        //Также он знает, сколько километров длится полная дорога от него к  Мэри.
        //В программу вводится 3 числа: время в пути, скорость поезда, длина полного пути.
        //Вывести на экран имя персонажа, к которому сейчас ближе Джон

        Scanner scanner = new Scanner(System.in);

        int speed = scanner.nextInt();
        int time = scanner.nextInt();
        int sizeOfPath = scanner.nextInt();

        int firstPart = speed * time; //сколько проехал поезд
        int secondPart = sizeOfPath - firstPart; //сколько осталось до Мэри

        if (firstPart > secondPart) {
            System.out.println("Шерлок ближе");
        }

        if (firstPart < secondPart) {
            System.out.println("Джон ближе");
        }

        if (firstPart == secondPart) {
            System.out.println("Одинаково");
        }
    }
}
