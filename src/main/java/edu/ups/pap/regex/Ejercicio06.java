package edu.ups.pap.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/** E06: Palabras dentro de un texto. Contrato completo en README.md. */
public class Ejercicio06 {
     private static final Pattern FORMATO =
        Pattern.compile("[A-Za-z]+");

    public static List<String> buscar(String texto, String palabra) {

        List<String> lista = new ArrayList<>();

        if (texto == null || palabra == null
                || !FORMATO.matcher(palabra).matches()) {
            return lista;
        }

        Matcher matcher = Pattern.compile(
            "(?<![A-Za-z0-9_])" + palabra + "(?![A-Za-z0-9_])",
            Pattern.CASE_INSENSITIVE
        ).matcher(texto);

        while (matcher.find()) {
            lista.add(matcher.group());
        }

        return lista;
    }
}
