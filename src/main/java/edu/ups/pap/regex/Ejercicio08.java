package edu.ups.pap.regex;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio08 {

    private static final String OCTETO =
        "(?:25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])";

    private static final String VALOR =
        "-?(?:0|[1-9][0-9]{0,3})(?:,[0-9]{1,2})?";

    private static final String TRAMA =
        "(?:T(?!000)[0-9]{3};" + VALOR + ";C"
      + "|H(?!000)[0-9]{3};" + VALOR + ";PCT"
      + "|P(?!000)[0-9]{3};" + VALOR + ";HPA)";

    private static final Pattern FORMATO = Pattern.compile(
        "(INFO|WARN|ERROR) "
      + "(" + OCTETO + "(?:\\." + OCTETO + "){3}) "
      + "(" + TRAMA + ")"
    );

    public static List<String> analizar(String texto) {
        List<String> resultado = new ArrayList<>();

        if (texto == null) {
            return resultado;
        }

        for (String linea : texto.split("\\r?\\n", -1)) {
            Matcher matcher = FORMATO.matcher(linea);

            if (matcher.matches()) {
                resultado.add(
                    matcher.group(1) + "|"
                  + matcher.group(2) + "|"
                  + matcher.group(3).replace(';', '|')
                );
            }
        }

        return resultado;
    }
}