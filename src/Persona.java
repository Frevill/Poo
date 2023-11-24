//repaso
public class Persona {
    //declaracion de atributos
    int cedula;
    int edad;
    String nombre;
    //metodo constructor vacio
    public Persona() {
    }
    //metodo constructor con parametros
    public Persona(int cedula, int edad, String nombre) {
        //se usa el this por que el parametro tiene el mismo numero que el atributo
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
    }

    //getters y setters
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo
    public void saludar(){
        System.out.println("Hola como te va " + nombre + "?");
    }
}

