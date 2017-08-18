package hello;

class Archivo {

    private final String ruta;
    private final String nombre;
    private final String tipo;
    private final String rutaAbsoluta;
    private final String contenido;
    private final Long tamanio;

    public Archivo(String ruta, String nombre, String tipo, String rutaAbsoluta, String contenido, Long tamanio) {
        this.ruta = ruta;
        this.nombre = nombre;
        this.tipo = tipo;
        this.rutaAbsoluta = rutaAbsoluta;
        this.contenido = contenido;
        this.tamanio = tamanio;
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

    public Long getTamanio() {
        return tamanio;
    }
}
