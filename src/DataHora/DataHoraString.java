package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraString {
    public static void main(String[] args) {

        // Convertendo data-hora para texto

        try {
            LocalDate t01 = LocalDate.parse("2022-06-15");
            LocalDateTime t02 = LocalDateTime.parse("2022-07-18T01:30:23");
            Instant t03 = Instant.parse("2026-06-20T01:30:52Z");

            DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
            DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

            System.out.println("T01 = " + t01.format(fmt2)); // Mesma forma
            System.out.println("T01 = " + fmt2.format(t01)); // Mesma forma
            System.out.println("T01 = " + t01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // Mesma forma

            System.out.println("T03 = " + t02.format(fmt2));
            System.out.println("T03 = " + t02.format(fmt3));

            System.out.println("T03 = " + fmt5.format(t03));
        } catch (Exception e) {
            System.out.println("ERROR NOT IDENTIFIED, PRINT AND SEND FOR OF ADMINISTRADOR OF SYSTEM");
            e.printStackTrace();
        }

    }
}
