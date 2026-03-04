package controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import controller.file.FileController;
import model.Equipo;
import model.Liga;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiController {


    FileController fileController = new FileController();

    public void getAllLigas() {
        String url = "https://www.thesportsdb.com/api/v1/json/123/all_leagues.php";
        //1. Abrir el cliente
        HttpClient client = null;
        try {
            Gson gson = new Gson();
            client = HttpClient.newHttpClient();
            //2.  Crea la peticion
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            //3. Espera la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String jsonLigas = response.body();  //Siempre viene string el body!!!
            System.out.println(jsonLigas);

            JSONObject jsonLiga = new JSONObject(jsonLigas);  // ojo en mayúsculas"
            JSONArray jsonLeagues = jsonLiga.getJSONArray("leagues");
            for (int i = 0; i < jsonLeagues.length(); i++) {
                JSONObject object = jsonLeagues.getJSONObject(i);

                //String idLiga = object.getString("idLeague");
                //String nombreLiga = object.getString("strLeague");

                Liga liga = gson.fromJson(object.toString(), Liga.class);
                System.out.println(liga);
            }

        } catch (InterruptedException e) {
            e.getCause();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (client != null) {
                client.close();
            }
        }
    }

    public void getAllClasificacion() {
        String url = "https://www.thesportsdb.com/api/v1/json/123/lookuptable.php?l=4335";

        HttpClient client = null;
        try {
            Gson gson = new Gson();
            client = HttpClient.newHttpClient();
            //2.  Crea la petición
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            //3. Espera la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String bdoy = response.body();  //Siempre viene string el body!!!
            JSONObject clasificacionJson = new JSONObject(bdoy);
            JSONArray clasificacionArray = clasificacionJson.getJSONArray("table");
            for (int i = 0; i < clasificacionArray.length(); i++) {
                JSONObject object = clasificacionArray.getJSONObject(i);
                String nombre = object.getString("strTeam");
                String posicion = object.getString("intRank");
                System.out.printf("%s, %s", nombre, posicion);
                Equipo equipo = gson.fromJson(object.toString(), Equipo.class);

                System.out.println(equipo);
                fileController.crearJson(equipo);

            }


        } catch (InterruptedException e) {
            e.getCause();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (client != null) {
                client.close();
            }
        }
    }
}


