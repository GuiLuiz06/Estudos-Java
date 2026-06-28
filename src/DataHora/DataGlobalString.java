package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataGlobalString {
    public static void main(String[] args) {

        // Convertendo data-hora global para local

        LocalDate t01 = LocalDate.parse("2022-06-15");
        LocalDateTime t02 = LocalDateTime.parse("2022-07-18T01:30:23");
        Instant t03 = Instant.parse("2026-06-20T01:30:52Z");

        // Zonas de áreas globais para especificar um fuso horário.
        /* for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }
        */

        LocalDate r1 = LocalDate.ofInstant(t03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(t03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(t03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(t03, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("r4 dia = " + r4.getDayOfMonth());
        System.out.println("r4 mês = " + r4.getMonthValue());
        System.out.println("r4 ano = " + r4.getYear());
        System.out.println("r4 hora = " + r4.getHour());
        System.out.println("r4 minuto = " + r4.getMinute());
        System.out.println("r4 segundo = " + r4.getSecond());

    }
}
