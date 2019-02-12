/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tesimaven;

import java.util.Scanner;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.simple.JSONObject;

/**
 *
 * @author Ha Trung
 */
public class Post {
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    public static void main(String[] args) {        
        //input
        Scanner sc= new Scanner(System.in);
        String username = "";
        String password = "";
        // input username 
        username=sc.nextLine();
        // input pasword
        password=sc.nextLine();
        // send input to server
        try {            
            OkHttpClient client= new OkHttpClient();
            JSONObject user   = new JSONObject();
            user.put("username",username);
            user.put("password", password);
            RequestBody body = RequestBody.create(JSON, user.toString());
            Request request = new Request.Builder().url("https://clear-background-1.herokuapp.com/api/auth/signin").post(body).build();
            Response response = client.newCall(request).execute();
            System.out.println("server return  "+response.body().string());
        } catch (Exception e) {
           e.printStackTrace();
        }
  }
}