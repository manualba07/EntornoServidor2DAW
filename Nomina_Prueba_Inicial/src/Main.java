//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Empleado e= new Empleado("James Coling","32000032G",'m',4,4);
    Empleado e2=new Empleado("Ada Lovelace ","32000031R",'f');

    escribe(e);
    escribe(e2);

    e2.incrAnyo();
    e2.setCategoria(9);

    escribe(e);
    escribe(e2);
}

private void escribe (Empleado e){
    System.out.println(e.nombre+" "+e.dni+" "+e.sexo+" "+e.getCategoria()+" "+e.añosTrabajados);
}