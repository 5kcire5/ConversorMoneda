import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {

    String apiKey = "753ac1c6ea6269792aa73cf4";

    public Cambio convierteDivisa(String inicial,
                                  String deseada,
                                  double cantidad){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"
                +inicial+"/"+deseada+"/"+cantidad);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Cambio.class);
        }catch (Exception e){
            throw new RuntimeException("No encontre esta divisa.");
        }
    }
}
