package controller;

import java.io.*;
import java.util.Scanner;

public class GestorFicheros {

    public void crearFichero(String path) {
        File file = new File(path);
        try {
            file.createNewFile(); //solo para ficheros
        } catch (IOException e) {
            System.out.println("Error al crear el fichero");
            e.getMessage();
        }
    }

    public void crearaCarpeta(String path) {
        File file = new File(path);
        file.mkdir(); // no es necesario hacer excepciones para carpetas, mkdirs crea la ruta aunque no exista
    }

    public void informacionFichero(String path) {
        File file = new File(path);
        for (File fil : file.listFiles()) {
            if (fil.isFile()) {
                System.out.println(fil);
            }
        }
    }

    public void lectorFichero(String path) {
        File file = new File(path);

        try (FileReader fr = new FileReader(file)) {
            int letra;
            while ((letra = fr.read()) != -1) {
                System.out.print((char) letra);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al localizar el  fichero");
        } catch (IOException e) {
            System.out.println("Error en la lectura del fichero");
        }
    }

    public void lectorPorLineas(String path) {
        File file = new File(path);
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.print((line));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void escrituraFichero(String path) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el mensaje que quieres guardar");
        String codeUser = sc.nextLine();
        File file = new File(path);
        try (FileWriter fw = new FileWriter(file, true)) {
            for (int i = 0; i < codeUser.length(); i++) {
                fw.write((int) codeUser.charAt(i));
                System.out.println(" ");
            }
            // String textoSEscribir = "Este texto lo vamos a escribir";
            //     fw.write(textoSEscribir);
        } catch (IOException e) {
            System.out.println("Error en la escritura del fichero");
            ;
        }
    }

    public void escrituraLineas(String path) {
        File file = new File(path);

        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            writer.println("Este es un ejemplo de la nueva forma de escribir");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void codificarMensaje(String path) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el mensaje que quieres codificar");
        String codeUser = sc.nextLine();
        System.out.println("Dime el nivel de codificacion");
        int level = sc.nextInt();
        File file = new File(path);

        try (FileWriter fw = new FileWriter(file)) {
            for (int i = 0; i < codeUser.length(); i++) {
                fw.write(String.valueOf(((int) codeUser.charAt(i)) * level));
                System.out.println(" ");
            }

        } catch (IOException e) {
            System.out.println("Error en la escritura del fichero");
        }
    }

    public void descifrarMensaje(String path){
        File file = new File(path);
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            System.out.println("Dime el nivel de decodificacion");
            Scanner sc = new Scanner(System.in);
            int decode = sc.nextInt();
            String linea;
            while ((linea = br.readLine()) != null){
                String[] codigos = linea.split(" ");
                for (int i = 0; i < codigos.length; i++) {
                    int numero = Integer.parseInt(codigos[i]) / decode;
                    System.out.println((char) numero);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

