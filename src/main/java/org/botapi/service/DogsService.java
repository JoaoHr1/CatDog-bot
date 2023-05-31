package org.botapi.service;

import com.google.gson.Gson;
import org.botapi.model.UrlDogImage;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DogsService {

    public UrlDogImage generateDogImage() throws IOException, InterruptedException {

        String apiUrl = "https://dog.ceo/api/breeds/image/random";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        Gson gson = new Gson();

        return gson.fromJson(json, UrlDogImage.class);
    }
}