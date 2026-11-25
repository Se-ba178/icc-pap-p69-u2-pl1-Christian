package edu.ups.pap.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/** E07: Extracción de tramas. Contrato completo en README.md. */
public class Ejercicio07 {
    private static final Pattern FORMATO = Pattern.compile(
        "(?<![^\\s\\[\\](){}])"
      + "(?:T(?!000)[0-9]{3};-?(?:0|[1-9][0-9]{0,3})(?:,[0-9]{1,2})?;C"
      + "|H(?!000)[0-9]{3};-?(?:0|[1-9][0-9]{0,3})(?:,[0-9]{1,2})?;PCT"
      + "|P(?!000)[0-9]{3};-?(?:0|[1-9][0-9]{0,3})(?:,[0-9]{1,2})?;HPA)"
      + "(?![^\\s\\[\\](){}])"
    );

    public static List<String> extraer(String texto) {
        List<String> resultado = new ArrayList<>();

        if (texto == null) {
            return resultado;
        }

        Matcher matcher = FORMATO.matcher(texto);

        while (matcher.find()) {
            resultado.add(matcher.group());
        }

        return resultado;
    }
}
