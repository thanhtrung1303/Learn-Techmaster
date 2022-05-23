package util;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Util {

    public static String formatDate(LocalDate date) {
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(myFormat);
    }
}
