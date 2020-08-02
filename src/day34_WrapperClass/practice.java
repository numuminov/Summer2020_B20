package day34_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class practice {
    public static void main(String[] args) {
        DateTimeFormatter day =DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        System.out.println(LocalDateTime.now().format(day));
        DateTimeFormatter year = DateTimeFormatter.ofPattern("EEE,MMM/dd/yyy");
        System.out.println(LocalDate.of(2007,07,03).format(year));

    }
}
