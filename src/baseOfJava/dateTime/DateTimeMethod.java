package baseOfJava.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeMethod {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("До форматта: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("После форматта: " + formattedDate);
    }
}
