package com.clients;

import com.google.common.io.CharStreams;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

/**
 * Created by zana on 20/01/16.
 */
public class SimpleClient {

    public static void main(String[] args) throws Exception {
        String url = "http://beljavski:8081/rest/api/2/search?jql=assignee=zanah";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection)obj.openConnection();

        con.setRequestMethod("GET");

        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Authorization", "Basic ".concat(new String(Base64.getEncoder().encode("zanah:zana".getBytes()))));

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        System.out.println(CharStreams.toString(new InputStreamReader(con.getInputStream())));
    }
}
