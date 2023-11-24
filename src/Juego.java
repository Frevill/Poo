//Ejercicio en clase
public class Juego {
    String titulo;
    int ano;
    String tipo;
    String categoria;

    public Juego(String titulo, int ano, String tipo, String categoria ) {
        this.titulo = titulo;
        this.ano = ano;
        this.tipo = tipo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void titulo(){
        System.out.println("El titulo de este juego es: " + titulo);
    }

    public void aviso(){
        if(ano<2000){
            System.out.println("Este es un juego retro");
        }
        else {
            System.out.println("Este es un juego relativamente nuevo");
        }
    }

}
