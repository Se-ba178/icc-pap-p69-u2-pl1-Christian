package edu.ups.pap.regex;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/** E04: Tramas de sensores. Contrato completo en README.md. */
public class Ejercicio04 {

    private static final Pattern FORMATO = Pattern.compile(
        "(?:T(?!000)[0-9]{3};-?(?:0|[1-9][0-9]{0,3})(?:,[0-9]{1,2})?;C"
      + "|H(?!000)[0-9]{3};-?(?:0|[1-9][0-9]{0,3})(?:,[0-9]{1,2})?;PCT"
      + "|P(?!000)[0-9]{3};-?(?:0|[1-9][0-9]{0,3})(?:,[0-9]{1,2})?;HPA)"
    );

    public static boolean validar(String texto) {
        return texto != null && FORMATO.matcher(texto).matches();
    }
}


