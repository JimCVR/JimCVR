package Relacion2_Tema8;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface imprimir {
    public  void imp_pantalla();
    public void guardar_a_fichero(String ruta_fichero) throws IOException;
}
