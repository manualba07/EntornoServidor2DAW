public class Empleado extends Persona {

    private int categoria;
    public int añosTrabajados;


    public Empleado(String nombre, String dni, char sexo) {
        super(nombre, dni, sexo);
    }

    public Empleado(String nombre, String dni, char sexo, int categoria, int añosTrabajados) {
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

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }

    public void incrAnyo(){
        añosTrabajados++;;
    }

    public void imprime(String dni, String nombre,char sexo,int categoria,int añosTrabajados) {
        System.out.println(dni+" "+nombre+" "+sexo+" Años trabajados:"+añosTrabajados+" Categoria:"+categoria);

    }
}
