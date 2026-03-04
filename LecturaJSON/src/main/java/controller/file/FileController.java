package controller.file;

import com.google.gson.JsonObject;
import model.Equipo;
import org.json.JSONArray;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileController {

    public  void crearJson(Equipo equipo){
        File file = new File("src/main/java/ficheros/equipos.json");

        try(PrintWriter writer = new PrintWriter(new FileWriter(file, true))){
                writer.println(equipo);
        }catch (IOException e){
            System.out.println("Error");
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
    }
}
