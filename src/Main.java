import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(saludoPersonalizadoPara("Alejo", "Bar"));
        int numeros[] = {1, 5, 7, 8, 10, 11};

        //int resultado = sumatoria(numeros); // Si lo pongo directo ma ahorro una declaracion de variable
        // quiza a veces hay que tener cuidado con economizar

        int promedio = /*resultado*/ sumatoria(numeros) / numeros.length;

        System.out.println("El promedio de los numeros del array es " + promedio);

        ejemploLecturaArchivo(); // este no lo puedo mover de aqui porque
    }
    private static void ejemploLecturaArchivo() throws IOException {
        String rutaAMiArchivo = "C:\\Users\\Pedro\\OneDrive\\0 Java\\0 Proyectos\\Ejemplo de lectura de archivo clase 4.txt";
        for (String unaLinea : Files.readAllLines(Paths.get(rutaAMiArchivo))) {
            System.out.println(unaLinea); // aqui faltaria una rutina tipo split para cortar las comas
            // y leer el archivo que se separa en comas tipo CSV
        }
        String rutaAMiArchivoSeparadoPorComas = "C:\\Users\\Pedro\\OneDrive\\0 Java\\0 Proyectos\\Archivo de Resultado 1.csv";
        for (String lecturaDeCsv : Files.readAllLines(Paths.get(rutaAMiArchivoSeparadoPorComas))) {
            String[] lecturaDeCsvPartido = lecturaDeCsv.split(",", 0);
            System.out.println(lecturaDeCsvPartido);// obtengo un error a la impresion de pantalla, no obtengo los numeros sin comas.
        }
    }
        private static String saludoPersonalizadoPara(String nombre, String apellido){
            return "Hola " + nombre + " " + apellido + ", bienvenido!";
        }

    private static int sumatoria(int[] numeros) { // aqui llama a el array de numeros que fue declarado arriba
        int resultado = 0;

        for (int i = 0; i < numeros.length; i++) {
            resultado = resultado + numeros[i];
        }
        return resultado;
    }
    }
