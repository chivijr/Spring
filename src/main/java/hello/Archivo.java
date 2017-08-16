package hello;

public class Archivo {

    private final String ruta;
    private final String nombre;
    private final char tipo;

    public Archivo(String ruta, String nombre, char tipo) {
        this.ruta = ruta;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getRuta() {
        return ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public char getTipo() {
        return tipo;
    }
}
