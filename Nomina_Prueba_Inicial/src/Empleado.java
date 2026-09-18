public class Empleado extends Persona {

    /*Atributos Empleados*/

    private int categoria;
    public int añosTrabajados;


    /**Constructor Empleado con nombre,dni y sexo*/

    public Empleado(String nombre, String dni, char sexo)throws DatosNoCorrectosException {
        super(nombre, dni, sexo);
    }

    /**Constructor Empleado con nombre,dni, sexo, categoria y años trabajados*/
    public Empleado(String nombre, String dni, char sexo, int categoria, int añosTrabajados) throws DatosNoCorrectosException{
        super(nombre, dni, sexo);
        if(categoria<0 && categoria>10){
            System.out.println("No valido");
        }else{
            this.categoria = categoria;
        }
        if(añosTrabajados<0){
            System.out.println("No valido");
        }else{
            this.añosTrabajados = añosTrabajados;
        }

    }

    /** Set de categoria*/

    public void setCategoria(int categoria)throws DatosNoCorrectosException {
        this.categoria = categoria;
    }

    /** Get de categoria*/
    public int getCategoria(){
        return categoria;
    }

    /**Método para incrementar los años trabajados*/

    public void incrAnyo(){
        añosTrabajados++;;
    }

    /**Método imprime*/

    public void imprime(String dni, String nombre,char sexo,int categoria,int añosTrabajados){
        System.out.println(dni+" "+nombre+" "+sexo+" Años trabajados:"+añosTrabajados+" Categoria:"+categoria);

    }
}
