package com.jmd;

import java.util.Arrays;
import java.util.Objects;

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de
 * otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Reto1 {
    public static void main(String[] args) {
        Reto1 reto1 = new Reto1();
        System.out.printf("Es un Anagrama?: %s%n", reto1.isAnagram("null", "llun"));
    }

    public boolean isAnagram(String word1, String word2) {
        assert (!Objects.equals(word1, "") && !Objects.equals(word2, "")) && (word1 != null && word2 != null);

        if (word1.equals(word2)) return false;

        char[] charsWord1 = word1.toCharArray();
        char[] charsWord2 = word2.toCharArray();
        Arrays.sort(charsWord1);
        Arrays.sort(charsWord2);
        return Arrays.equals(charsWord1, charsWord2);
    }
}
