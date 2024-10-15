package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {

        Date dateActuelle = new Date();
        SimpleDateFormat formateurJMA = new SimpleDateFormat("dd MM yyyy");
        System.out.println("Date actuelle formatée : " + formateurJMA.format(dateActuelle));

        Date date1 = new Date(116, 04, 19, 23, 59, 30);
        SimpleDateFormat formateurAMJhms = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
        System.out.println(formateurAMJhms.format(date1));

        System.out.println(formateurAMJhms.format(dateActuelle));
    }
}
