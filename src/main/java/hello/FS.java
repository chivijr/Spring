package hello;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FS {

    private final String ruta;
    private final List<Map<String,ArrayList<String>>> ficheros;

    public FS(String dir) {
        this.ruta = dir;
        this.ficheros = new ArrayList<Map<String,ArrayList<String>>>();
        ArrayList<String> listafichero = new ArrayList<String>();

        final File folder = new File("/");
        for (final File fileEntry : folder.listFiles()) {
            listafichero.add(fileEntry.getName());
        }
        ficheros.add(listafichero);
    }

    public String getRuta() {
        return ruta;
    }

    public String getFicheros() {
        return ficheros.toString();
    }
}
