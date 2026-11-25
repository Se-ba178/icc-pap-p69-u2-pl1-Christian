package edu.ups.pap.regex;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/** E05: Direcciones IPv4. Contrato completo en README.md. */
public class Ejercicio05 {
    private static final Pattern FORMATO = Pattern.compile(
        "(?:(?:25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}"
      + "(?:25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])"
    );

    public static boolean validar(String texto) {
        return texto != null && FORMATO.matcher(texto).matches();
    }
}
