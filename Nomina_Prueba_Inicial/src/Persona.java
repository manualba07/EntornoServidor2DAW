public class Persona {

    /*Atributos Persona*/

    public String nombre;
    public String dni;
    public char sexo;

    /**Constructor de Persona con nombre,dni y sexo*/

    public Persona(String nombre, String dni, char sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
    }

    /**Constructor de Persona con nombre y sexo*/

    public Persona(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    /**Método set*/

    public void setDni(String dni) {
        this.dni = dni;
    }

    /**Método imprime*/

    public void imprime (String dni, String nombre) {
        System.out.println(dni + "  " + nombre);
    }
}
