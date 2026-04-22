package Exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalendarDayTest {

    @Test
    public void testDatasValidasEBissexto() {
        CalendarDay calendar = new CalendarDay();
        
        assertEquals("SEGUNDA-FEIRA - Data Válida - Ano Bissexto", calendar.findDay(1, 1, 2024));
        
        assertEquals("TERÇA-FEIRA - Data Válida - Não é Bissexto", calendar.findDay(28, 2, 2023));
    }

    @Test
    public void testDatasInvalidas() {
        CalendarDay calendar = new CalendarDay();
        
        assertEquals("Data Inválida", calendar.findDay(29, 2, 2023));
        
        assertEquals("Data Inválida", calendar.findDay(10, 13, 2022));
        
        assertEquals("Data Inválida", calendar.findDay(31, 4, 2023));
    }
}