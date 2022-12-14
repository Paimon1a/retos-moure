package com.jmd;
/*
 * Reto #0
 * EL FAMOSO "FIZZ BUZZ"
 * Fecha publicación enunciado: 27/12/21
 * Fecha publicación resolución: 03/01/22
 * Dificultad: FACIL
 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

public class Reto0 {
    public static void main(String[] args) {
        Reto0 reto0 = new Reto0();
        String fizzbuzz = "";
        for (int i = 0; i < 100; i++) {
            fizzbuzz += reto0.fizzbuzz(i + 1).isEmpty() ? "" : "%s\n".formatted(reto0.fizzbuzz(i + 1));
            System.out.print(fizzbuzz);
        }
    }

    public String fizzbuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizzbuzz";
        }
        if (num % 3 == 0) {
            return "fizz";
        }
        if (num % 5 == 0) {
            return "buzz";
        }
        return "";
    }
}