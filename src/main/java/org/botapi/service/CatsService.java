package org.botapi.service;

import com.google.gson.Gson;
import org.botapi.model.UrlCatImage;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CatsService {

    public UrlCatImage generateCatImage() throws IOException, InterruptedException {

    String apiUrl = "https://api.thecatapi.com/v1/images/search";

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl)).build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    String json = response.body().replace("[", "").replace("]", "");
    Gson gson = new Gson();

    return gson.fromJson(json, UrlCatImage.class);
}

}
