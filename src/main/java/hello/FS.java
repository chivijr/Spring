package hello;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FS {

    private final String ruta;
    private final List<String> ficheros;

    public FS(String dir) {
        this.ruta = dir;
        this.ficheros = new ArrayList<String>();

        final File folder = new File("/");
        String fichero = "";
        for (final File fileEntry : folder.listFiles()) {
            ficheros.add("\'/"+fileEntry.getName()+"\'");
        }
    }

    public String getRuta() {
        return ruta;
    }

    public String getFicheros() {
        return ficheros.toString();
    }
}
