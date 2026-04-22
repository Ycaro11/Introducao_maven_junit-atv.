package Exemplo;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.DateTimeException;

public class CalendarDay {
    
    public String findDay(int day, int month, int year) {
        try {
            LocalDate date = LocalDate.of(year, month, day);
            
            String diaSemana = date.getDayOfWeek()
                                   .getDisplayName(TextStyle.FULL, Locale.of("pt", "BR"))
                                   .toUpperCase();
            
            String bissextoInfo = date.isLeapYear() ? "Ano Bissexto" : "Não é Bissexto";
            
            return diaSemana + " - Data Válida - " + bissextoInfo;
            
        } catch (DateTimeException e) {
            return "Data Inválida";
        }
    }
}