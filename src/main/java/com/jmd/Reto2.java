package com.jmd;

import java.util.ArrayList;
import java.util.List;

/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Fecha publicación enunciado: 10/01/22
 * Fecha publicación resolución: 17/01/22
 * Dificultad: DIFICIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre
 * es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Reto2 {
    public static void main(String[] args) {
        System.out.println(new Reto2().fibonacci2(10));
    }
    public String fibonacci(int to) {
        StringBuilder res = new StringBuilder();
        long n1 = 0;
        long n2 = 1;
        long aux;
        for (int i = 0; i < to; i++) {
            if (i == 0) {
                res.append("%s, %s, ".formatted(n1, n2));
            } else {
                aux = n1 + n2;
                n1 = n2;
                n2 = aux;
                res.append("%s, ".formatted(aux));
            }
        }
        return res.toString();
    }

    public String fibonacci2(int to) {
        StringBuilder res = new StringBuilder("0, 1, ");
        List<Long> fib = new ArrayList<>();
        fib.add(0L);
        fib.add(1L);
        for (int i = 2; i <= to; i++) {
            fib.add(i, fib.get(i - 1) + fib.get(i - 2));
            res.append(fib.get(i)).append(", ");
        }
        return res.toString();
    }
}
