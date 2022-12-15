package com.jmd;

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 * Formula del area de un poligono regular:
 * A = p * a / 2
 * donde:
 * A: Area
 * p: perimetro
 * a: apotema
 *
 * Formula para apotema
 * Ap = L / 2 tan(ang)
 * donde:
 * Ap: apotema
 * L: longitud de lado
 * tan(ang): tangente del angulo
 */
public class Reto4 {
    private float longSides;
    private int sides;

    public Reto4(float longSides, int sides) {
        this.longSides = longSides;
        this.sides = sides;
    }

    private double getPerim(){
        return sides * longSides;
    }

    private double getApotem() {
        return longSides / (2 * Math.tan(Math.toRadians(360 / (2f * sides))));
    }

    public double calculateArea() {
        return (getPerim() * getApotem()) / 2;
    }
}
