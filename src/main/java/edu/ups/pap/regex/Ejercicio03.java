package edu.ups.pap.regex;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/** E03: Correos institucionales. Contrato completo en README.md. */
public class Ejercicio03 {

    private static Pattern FORMATO = Pattern.compile("[A-Za-z0-9](?:[A-Za-z0-9._-]*[A-Za-z0-9])?@(?:ups\\.edu\\.ec|est\\.ups\\.edu\\.ec)" ,  Pattern.CASE_INSENSITIVE);
    
    public static boolean validar(String texto) {

        return  texto != null && !texto.contains("..") && FORMATO.matcher(texto).matches();

        
    }
}
