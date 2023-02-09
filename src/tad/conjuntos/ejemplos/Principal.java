package tad.conjuntos.ejemplos;


import java.util.TreeSet;

public class Principal {
    public static void main(String[] args) {

        TreeSet <Persona>treeSetPersona = new TreeSet<>();
        Persona ana = new Persona("Ana", 15);
        Persona pepe = new Persona("Pepe", 31);
        Persona berto = new Persona("Breto", 89);
        Persona Raphael = new Persona("Raphael", 75);

        treeSetPersona.add(ana);
        treeSetPersona.add(pepe);
        treeSetPersona.add(Raphael);
        treeSetPersona.add(berto);

        System.out.println();

    }
}
