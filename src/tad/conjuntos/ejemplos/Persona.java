package tad.conjuntos.ejemplos;

public class Persona implements Comparable {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() { /** La visibilidad debe de ser pública porque en la clase objet es pública */
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    //TODO PARA HACER LA ORDENACIÓN POR NOMBRE
    @Override
    public int compareTo(Object other){ /** Objet o solo declara la variable, no la inicializa */
        Persona otherPersona = (Persona)other;
       // return this.nombre.compareTo(otherPersona.nombre); /** Usamos el método compareTo para comparar los nombres */
        if(this.edad == (otherPersona.edad)){
            return 0;
        }
        if(this.edad > (otherPersona.edad)){
            return 1;
        }
            return -1;
    }

         //TODO PARA HACER LA COMPARACIÓN POR EDAD

}
