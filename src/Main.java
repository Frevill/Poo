import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Main
        //Mostrar por pantalla use getters para traer la información

        Persona per1 = new Persona( 1531654685, 21, "Freddy");
        Persona per2 = new Persona( 1531651515, 19, "Shamyr");
        Persona per3 = new Persona( 1531654685, 15, "Miguel");

        Juego jue1 = new Juego("hollow knigth", 2017, "Metroidvania", "Indie");
        Juego jue2 = new Juego("Mario bros", 1999, "Plataformer", "AAA");
        Juego jue3 = new Juego("League of legends", 2011, "MOBA", "AAA");

        System.out.println("--------------------------");
        System.out.println("El nombre del estudiante uno es: " + per1.getNombre());
        System.out.println("la cedula del estudiante uno es: " + per1.getCedula());
        System.out.println("la edad del estudiante uno es: " + per1.getEdad());
        per1.saludar();
        System.out.println("--------------------------");
        System.out.println("El nombre del estudiante dos es: " + per2.getNombre());
        System.out.println("la cedula del estudiante dos es: " + per2.getCedula());
        System.out.println("la edad del estudiante dos es: " + per2.getEdad());
        per2.saludar();
        System.out.println("--------------------------");
        System.out.println("El nombre del estudiante tres es: " + per3.getNombre());
        System.out.println("la cedula del estudiante tres es: " + per3.getCedula());
        System.out.println("la edad del estudiante tres es: " + per3.getEdad());
        per3.saludar();

        System.out.println("--------------------------");
        jue1.titulo();
        jue1.aviso();
        System.out.println("--------------------------");
        jue2.titulo();
        jue2.aviso();
        System.out.println("--------------------------");
        jue3.titulo();
        jue3.aviso();

        }
    }
