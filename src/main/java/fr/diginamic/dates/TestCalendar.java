package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2016, 4, 19, 23, 59, 30);
        Date date1 = cal1.getTime();
        SimpleDateFormat formateurJMA = new SimpleDateFormat("dd MM yyyy");
        System.out.println(formateurJMA.format(date1));

        Date date2 = Calendar.getInstance().getTime();
        SimpleDateFormat formateurAMJhms = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
        System.out.println(formateurAMJhms.format(date2));

        SimpleDateFormat formateurAMJhmsFR = new SimpleDateFormat("yyyy MMMM EEEE HH:mm:ss", Locale.FRANCE);
        System.out.println(formateurAMJhmsFR.format(date2));

        SimpleDateFormat formateurAMJhmsRU = new SimpleDateFormat("yyyy MMMM EEEE HH:mm:ss", Locale.of("ru","RU"));
        System.out.println(formateurAMJhmsRU.format(date2));

        SimpleDateFormat formateurAMJhmsCH = new SimpleDateFormat("yyyy MMMM EEEE HH:mm:ss", Locale.CHINA);
        System.out.println(formateurAMJhmsCH.format(date2));

        SimpleDateFormat formateurAMJhmsGE = new SimpleDateFormat("yyyy MMMM EEEE HH:mm:ss", Locale.GERMANY);
        System.out.println(formateurAMJhmsGE.format(date2));
    }
}
