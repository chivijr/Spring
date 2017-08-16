package hello;

import java.io.File;
import java.lang.reflect.Array;
import java.util.*;

public class FS {

    private final String ruta;
    private final Map<String,Object> ficheros;

    public FS(String dir) {
        this.ruta = dir;
        this.ficheros = new LinkedHashMap<>();

        final File folder = new File("/");
        for (final File fileEntry : folder.listFiles()) {
            ficheros.put("fichero", fileEntry.getName());
        }
    }

    public String getRuta() {
        return ruta;
    }

    public String getFicheros() {
        return ficheros.toString();
    }
}
