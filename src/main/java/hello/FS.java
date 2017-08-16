package hello;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class FS {

    private final String ruta;
    private final List<Archivo> ficheros;

    public FS(String ruta) {
        this.ruta = ruta;
        this.ficheros = new LinkedList<Archivo>();

        final File folder = new File("/");
        for (final File fileEntry : folder.listFiles()) {
            char tipo = (fileEntry.isFile()) ? 'f' : 'd';
            this.ficheros.add(new Archivo(ruta,fileEntry.getName(), tipo));
        }
    }

    public String getRuta() {
        return ruta;
    }

    public List<Archivo> getFicheros() {
        return ficheros;
    }
}
