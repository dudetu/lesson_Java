public class Task {

    public static void main(String[] args) {
        // получает зарплату в 5.6 евро в час. Он работает 12 часов в день,
        //  Он работает 364 дня в году.
        //Сколько часов отработает Вася за год и сколько он заработает денег.

        //Ему дали отпуск в течение двух недель, он оплачивается в 50% от зп,
        // пересчитайте зарплату за год

        double salaryForHour = 5.6;
        int hoursPerDay = 12;
        int days = 364;

        double cashFromWork = salaryForHour * hoursPerDay * (days - 14); //350
        System.out.println(cashFromWork);

        double vacationMoney = salaryForHour * hoursPerDay * 14 / 2;
        System.out.println(vacationMoney);

        System.out.println(cashFromWork + vacationMoney);



    }

}
