package org.example.task3;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.json.JSONObject;

class Brandfetch implements Reader{
    public JSONObject GetInfo() throws Exception {
        String apiUrl = "https://api.brandfetch.io/v1/company?url=" + "https://nltu.edu.ua";
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", "");
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        JSONObject jsonObject = new JSONObject(text);

        return jsonObject;
    }
}