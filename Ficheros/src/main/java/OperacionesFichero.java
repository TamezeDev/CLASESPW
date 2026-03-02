import javax.xml.transform.Source;
import java.io.*;

public class OperacionesFichero {

    public void leerDatosFichero() {
        String path = "src/main/java/resources/ficheros/ejemplo.txt";
        File file = new File(path);
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println("Ruta absoluta: " + file.getAbsolutePath());
    }

    public void leerhijos(String path) {
        File file = new File(path);
        //Ver los nombres de los ficheros de dentro
        for (String s : file.list()) {
            System.out.println(s);
        }

        //Recursividad con la misma función
        for (File listFile : file.listFiles()) {
            System.out.println(listFile);
            if (listFile.isDirectory()) {
                leerhijos(listFile.getAbsolutePath());
            }
        }
    }

    public void crearFicheros(String path) {
        File file = new File(path + "propio.txt");
        if (!file.exists()) {
            try {
                file.createNewFile(); //exige que captures la IO exception
                file.delete(); //borra un fichero

            } catch (IOException e) {
                System.out.println("Fallo en la escritura");
                System.out.println(e.getMessage());
            }
        }


    }

    public void crearDirectorio(String path) {
        File file = new File(path + "/ejemplo");
        if (!file.exists()) {
            file.mkdir();  //mkdir crear una carpeta  // mkdirs crear toda la ruta que le digas
        }
    }

    public void lecturaAscii(String path) {
        //texto plano -> .txt ->Ascii
        //File -> fileReader (caracter a caracter) - > bufferedReader -> linea a linea

        File file = new File(path);
        FileReader reader = null;
        try {
            reader = new FileReader(file); // siempre hay que capturar por si no esta el fichero o pasa algo
            int codigo = -1;
            while ((codigo = reader.read()) != -1) {   //devuelve el codigo ascii  solo del primer caracter
                //convertir a caracter

                System.out.print((char) codigo);

            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra la ruta a leer");
            e.getMessage();
            //Se podria hacer lectura recursiva para leer otra ruta
        } catch (IOException e) {
            System.out.println("Error al leer, hay permisos");
        } finally {
            try {
                reader.close();

            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }

        }
    }

    public void lecturaLinea(String path) {

        //BufferedReader gestiona linea a linea (String)
        File file = new File(path);
        FileReader reader = null;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = null;

            while ((linea = bufferedReader.readLine()) != null) { //Ojo solo poner la lectura en el bucle IMPORTANTE
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {  //OJO a la jerarquia de excepciones, la general al final!!
            System.out.println("Error en la lectura de la ruta");
        } catch (IOException e) {
            System.out.println("Error en el modo del fichero, estás en modo lectura");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado del fichero");
            }
        }

    }

    public void lectorCodigos(String path) {
        File file = new File(path);
        BufferedReader bufferedReader= null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = null;
            String[] codigos;

            while ((linea = bufferedReader.readLine()) != null) { //Ojo solo poner la lectura en el bucle IMPORTANTE
                codigos = linea.split(" ");
                for (String codigo : codigos) {
                    int cod =  Integer.parseInt(codigo);
                    System.out.print((char) cod);
                }
            }
        } catch (FileNotFoundException e) {  //OJO a la jerarquia de excepciones, la general al final!!
            System.out.println("Error en la lectura de la ruta");
        } catch (IOException e) {
            System.out.println("Error en el modo del fichero, estás en modo lectura");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado del fichero");
            }
        }
    }
}
