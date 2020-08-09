package JavaRushLect8;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class ExamplesDate {

    public static void main(String[] args) throws InterruptedException {

        //Получение текущей даты:
        Date today = new Date();
        System.out.println(today);
        System.out.println("===================================================");

        //Вычисление разницы между двумя датами:
        Date currentTime = new Date();
        Thread.sleep(5000);
        Date currentTime2 = new Date();

        //Наступило ли уже некоторое время:
        long secondsDelay = currentTime2.getTime() - currentTime.getTime();
        System.out.println("Задержка - " + secondsDelay / 1000 + " секунд(а)");
        System.out.println("=====================================================");

        //Сколько прошло времени с начала сегодняшнего дня:
        Date currentTime3 = new Date();
        int hours = Calendar.HOUR_OF_DAY;
        int minutes = Calendar.MINUTE;
        int seconds = Calendar.SECOND;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
