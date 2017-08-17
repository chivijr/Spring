package hello;

public class Archivo {

    private final String ruta;
    private final String nombre;
    private final String tipo;
    private final String rutaAbsoluta;
    private final String contenido;

    public Archivo(String ruta, String nombre, String tipo, String rutaAbsoluta, String contenido) {
        this.ruta = ruta;
        this.nombre = nombre;
        this.tipo = tipo;
        this.rutaAbsoluta = rutaAbsoluta;
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
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

    public String getRutaAbsoluta() {
        return rutaAbsoluta;
    }
}
