package Exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateIPTest {

    @Test
    public void testIpsValidosEClasses() {
        ValidateIP validador = new ValidateIP();
        
        assertEquals("Classe A", validador.validate("10.0.0.1"));
        assertEquals("Classe B", validador.validate("172.16.0.1"));
        assertEquals("Classe C", validador.validate("192.168.1.1"));
        assertEquals("Classe D", validador.validate("224.0.0.1"));
        assertEquals("Classe E", validador.validate("240.0.0.1"));
    }

    @Test
    public void testIpsInvalidos() {
        ValidateIP validador = new ValidateIP();
        
        assertEquals("IP Inválido", validador.validate("192.168.1.256"));
        
        assertEquals("IP Inválido", validador.validate("192.168.1"));
        
        assertEquals("IP Inválido", validador.validate("abc.def.ghi.jkl"));
        
        assertEquals("IP Inválido", validador.validate(null));
    }
}