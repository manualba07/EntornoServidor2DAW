void main(String[] args) {
    try {
        /**Creación objetos (Empleado)*/

        Empleado e = new Empleado("James Coling", "32000032G", 'm', 4, 4);
        Empleado e2 = new Empleado("Ada Lovelace ", "32000031R", 'f');

        /**Método escribe de empleado*/
        escribe(e);
        /**Método escribe de empleado*/
        escribe(e2);

        /**Llamada a método incrementar años*/
        e2.incrAnyo();
        /**Método set categoria*/
        e2.setCategoria(9);

        /**Método escribe de empleado*/
        escribe(e);
        /**Método escribe de empleado*/
        escribe(e2);
    /**Captar excepcion*/
    }catch (DatosNoCorrectosException e) {
        System.out.println("Datos no correctos");
        System.exit(1);
    }
}

/**Creación de método escribe*/

private void escribe (Empleado e){
    System.out.println(e.nombre+" "+e.dni+" "+e.sexo+" "+e.getCategoria()+" "+e.añosTrabajados);
}