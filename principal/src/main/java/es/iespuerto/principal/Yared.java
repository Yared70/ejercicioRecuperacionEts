package es.iespuerto.principal;

public class Yared {

    private String nombre;
    private String apellido1;
    private String apellido2;

    /**
     * Constructor por defecto que no recibe ningun parametro;
     */
    public Yared(){};

    /**
     * Constructor que recibe un parametro
     * @param nombre del alumno
     */
    public Yared(String nombre){

        this.nombre = nombre;

    }

    /**
     * Constructor que recibe dos parametros
     * @param nombre del alumno
     * @param apellido1 del alumno
     */
    public Yared(String nombre, String apellido1){

        this.nombre = nombre;
        this.apellido1 = apellido1;

    }

    /**
     * Constructor que recibe tres parametros
     * @param nombre del alumno
     * @param apellido1 del alumno
     * @param apellido2 del alumno
     */
    public Yared(String nombre, String apellido1, String apellido2){

        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    /**
     * Metodo para validar si parametros pasados corresponden a los datos de la clase
     * @param nombre del alumno a validar
     * @param apellido1 del alumno a validar
     * @param apellido2 del alumno a validar
     */
    public boolean ValidarNombre(String nombre, String apellido1, String apellido2){

        boolean correcto = false;
        if(nombre.equals(this.nombre) && apellido1.equals(this.apellido1) && apellido2.equals(this.apellido2)){
            correcto = true;
        }else{
            correcto = false;
        }

        return correcto;

    };


}
