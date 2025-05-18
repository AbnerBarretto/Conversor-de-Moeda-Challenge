package Convertion;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class ConversionCurrency {
    private String apiKey = "644e5dac23639ed9cf2ffe87";

    public JsonObject Currency(String coin) {
        String conversionLink = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + coin;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(conversionLink))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
            return jsonObject.getAsJsonObject("conversion_rates");

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao obter os dados: " + e.getMessage());
        }
        return null;
    }
}
