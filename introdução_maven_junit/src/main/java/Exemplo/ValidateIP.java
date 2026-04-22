package Exemplo;

import java.util.regex.Pattern;

public class ValidateIP {
    private static final String IPV4_REGEX =
            "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    
    private static final Pattern PATTERN = Pattern.compile(IPV4_REGEX);

    public String validate(String ip) {
        if (ip == null || !PATTERN.matcher(ip).matches()) {
            return "IP Inválido";
        }
        
        int primeiroOcteto = Integer.parseInt(ip.split("\\.")[0]);
        
        if (primeiroOcteto >= 0 && primeiroOcteto <= 127) {
            return "Classe A";
        } else if (primeiroOcteto >= 128 && primeiroOcteto <= 191) {
            return "Classe B";
        } else if (primeiroOcteto >= 192 && primeiroOcteto <= 223) {
            return "Classe C";
        } else if (primeiroOcteto >= 224 && primeiroOcteto <= 239) {
            return "Classe D";
        } else {
            return "Classe E";
        }
    }
}