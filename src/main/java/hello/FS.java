package hello;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class FS {

    private final String ruta;
    private final List<Archivo> ficheros;

    public FS(String ruta) {
        this.ruta = "/"+ruta.substring(0,ruta.length()-1);
        this.ficheros = new LinkedList<Archivo>();

        final File folder = new File("/"+ruta);
        for (final File fileEntry : folder.listFiles()) {
            String tipo = (fileEntry.isFile()) ? "fa-file-o" : "fa-folder";
            this.ficheros.add(new Archivo("/"+ruta,fileEntry.getName(), tipo));
        }
    }

    public String getRuta() {
        return ruta;
    }

    public List<Archivo> getFicheros() {
        return ficheros;
    }
}
