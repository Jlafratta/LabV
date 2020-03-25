package com.Main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Ejercicio 1

        List<Integer> arrayGenerico = new ArrayList<>();
        Integer int1 = 1;
        Integer int2 = 10;
        arrayGenerico.add(int1);
        arrayGenerico.add(int2);

        Generic claseGenerica = new Generic();

        claseGenerica.setgArray(arrayGenerico);

        System.out.println("El max en el array generico es : " + claseGenerica.getMax());
        System.out.println("El min en el array generico es : " + claseGenerica.getMin());

        // Ejercicio 2

        System.out.println("El ultimo elemento eliminado es : " + claseGenerica.deleteLast());

        // Ejercicio 3

        Pila pilita = new Pila();

        pilita.push(new Integer(10));
        pilita.push(new Integer(15));
        pilita.push(new Integer(20));

        System.out.println("Contenido de pilita : " + pilita);

        System.out.println("El primer elemento de la pila es : " + pilita.pop());

        System.out.println("La cantidad de elementos de pilita es : " + pilita.size());
    }
}
