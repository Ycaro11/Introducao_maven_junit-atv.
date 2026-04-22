package Exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareSubstringsTest {

    @Test
    public void testGetSmallestAndLargest() {
        CompareSubstrings comparador = new CompareSubstrings();
        
        String expected = "ava\nwel";
        assertEquals(expected, comparador.getSmallestAndLargest("welcometojava", 3));
        
        String expected2 = "a\nz";
        assertEquals(expected2, comparador.getSmallestAndLargest("aveloz", 1));
    }
}