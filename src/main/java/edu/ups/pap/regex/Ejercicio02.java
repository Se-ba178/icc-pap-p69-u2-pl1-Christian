package edu.ups.pap.regex;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/** E02: Códigos de dispositivos. Contrato completo en README.md. */
public class Ejercicio02 {

    private final static Pattern REGEX = Pattern.compile("[THP][]{4,12}");


    public static boolean validar(String texto) {
        return texto != null && REGEX.matcher(texto).matches();
    }
}
