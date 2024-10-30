import java.io.File;

public class RenombrarDirectorios {
    
    public void renombrarDirectorios(String path){
        // validar que el path sea un directorio
        File directorio = new File(path);

        if (!directorio.exists() || !directorio.isDirectory()){
            System.out.println("La ruta path no es un directorio valido :/");
            return;
        }

        renombrarDirectoriosInternos(directorio);
        // cambio de nombres
        // System.out.println("La ruta path es valida");
    }

    private void renombrarDirectoriosInternos(File directorio) {
        // Listar todos los archivos y/o carpetas hijas
        File[] directoriosArchivosInternos = directorio.listFiles();
        if (directoriosArchivosInternos == null){
            return;
        }
        for (File directorioFile : directoriosArchivosInternos){
            if (directorioFile.isDirectory()){
                String nombreOriginal = directorioFile.getName();
            }
        }
    }

}
