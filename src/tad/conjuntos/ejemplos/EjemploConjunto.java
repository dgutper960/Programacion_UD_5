package tad.conjuntos.ejemplos;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploConjunto {
    public static void main(String[] args) {
        /** Ponemos Set y elegimos el de java.utils(Set<E>) */
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Alcachofa");
        conjunto.add("Periquito");
        conjunto.add("Berenjena");
        conjunto.add("Sandía");
        conjunto.add("Guarnición");
        conjunto.add("Guarnición");// Si ponemos dos String iguales no se introduce el segundo
        conjunto.add(null); // Vemos que se admiten valores nulos

        System.out.println(conjunto.isEmpty());;//Para ver si en conjunto está vacío

        System.out.println(conjunto); // Se imprime el contenido de conjunto

        /** Para recorrer conjunto */
        String e; // Variable para almacenar los valores de conjunto
        Iterator<String> it = conjunto.iterator(); // it será el nombre del iterador (como la i de for)
        while (it.hasNext()) { // hasNext solo pregunta si hay algo más en it
            e = it.next(); // nex Toma los valores de it
            System.out.println(e); // Imprime el valor de i
        }

        /** Para eliminar un elemento de conjunto, en este caso, "Sandía" */
        conjunto.remove("Sandía");
        System.out.println(conjunto);

        Set<String> conjunto2 = new HashSet<>();
        conjunto.removeAll(conjunto2);
        conjunto2.add("Berenjena");
        conjunto2.add("Periquito");
        conjunto2.add("Alcachofa");
        conjunto2.add("Guarnición");
        System.out.println(conjunto);
    }

}
