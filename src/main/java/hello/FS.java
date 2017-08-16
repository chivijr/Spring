package hello;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FS {

    private final String ruta;
    private final List<Map<String,String>> ficheros;

    public FS(String dir) {
        this.ruta = dir;
        this.ficheros = new ArrayList<Map<String,String>>();
        HashMap<String,String> fichero = new HashMap<String,String>();

        final File folder = new File("/");
        for (final File fileEntry : folder.listFiles()) {
            String nombre=fileEntry.getName();
            fichero.put("nombre", nombre);
            System.out.println(fichero.values());
            ficheros.add(fichero);
        }
    }

    public String getRuta() {
        return ruta;
    }

    public String getFicheros() {
        return ficheros.toString();
    }
}
