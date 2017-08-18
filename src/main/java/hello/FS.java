package hello;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FS {

    private final String ruta;
    private final List<Archivo> ficheros;

    public FS(String ruta) {
        this.ruta = ruta;
        this.ficheros = new LinkedList<Archivo>();

        final File folder = new File(this.ruta);
        String tipo = null;
        String nombreFichero = null;

        if (folder.isDirectory()) {
            for (final File fileEntry : folder.listFiles()) {
                tipo = (fileEntry.isFile()) ? "fa-file-o" : "fa-folder";
                nombreFichero = fileEntry.getName();
                ruta = (ruta.equals("/")) ? "" : ruta;
                this.ficheros.add(new Archivo(this.ruta, nombreFichero, tipo, ruta + "/" + nombreFichero, "", fileEntry.length()));
            }
        } else {
            BufferedReader br = null;
            FileReader fr = null;

            try {

                //br = new BufferedReader(new FileReader(FILENAME));
                fr = new FileReader(ruta);
                br = new BufferedReader(fr);

                String sCurrentLine;
                String contenido = "";

                while ((sCurrentLine = br.readLine()) != null) {
                    contenido += sCurrentLine + "</br>";
                }
                this.ficheros.add(new Archivo(this.ruta, nombreFichero, tipo, ruta + "/" + nombreFichero, contenido, (long) 0));

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    if (br != null)
                        br.close();

                    if (fr != null)
                        fr.close();

                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }
        }
    }

    public String getRuta() {
        return ruta;
    }

    public List<Archivo> getFicheros() {
        return ficheros;
    }
}
