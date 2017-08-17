package hello;

public class Archivo {

    private final String ruta;
    private final String nombre;
    private final String tipo;

    public Archivo(String ruta, String nombre, String tipo) {
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

    public String getTipo() {
        return tipo;
    }
}
