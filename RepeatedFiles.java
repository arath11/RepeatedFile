import java.io.File;

public class RepeatedFiles {

    public void conseguirArchivos(String ruta) {
        conseguirArchivosPrivado(ruta);
        //   imprimirFor(cadenasAVerificar);
    }

    private void conseguirArchivosPrivado(String ruta) {
        // String [] archivosRegreso=new String[0];
        File rutaArchivo = new File(ruta);
        if (rutaArchivo.exists()) {
            File[] archivos = rutaArchivo.listFiles();
            if (!(archivos == null)) {
                for (int i = 0; i < archivos.length; i++) {
                    if (archivos[i].isFile()) {
                        System.out.println(archivos[i].getName());
                        //agregarArchivo(archivos[i].getName());
                    } else if (archivos[i].isDirectory()) {
                        conseguirArchivosPrivado(archivos[i].getAbsolutePath());
                    }
                }
            } else {
                System.out.println("Esta vacia ");
            }
        } else {
            System.out.println("El directori o la ruta no existeixen.");
        }
    }

    public static void main(String[] args) {
        RepeatedFiles pruebas =new RepeatedFiles();
        //pruebas.conseguirArchivos("Insetar ruta aqui");
        pruebas.conseguirArchivos(".//");
    }
}
