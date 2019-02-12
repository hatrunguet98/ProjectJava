/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 *
 * @author Ha Trung
 */
public class Client {
    public static void main(String[] args) {
        final String serverHost = "localhost";
        try {
            Socket socketclient = new Socket(serverHost,9999);
            BufferedWriter oc = new BufferedWriter(new OutputStreamWriter(socketclient.getOutputStream()));
            BufferedReader ic = new BufferedReader(new InputStreamReader(socketclient.getInputStream()));
            oc.write("Hello");
            oc.newLine();
            oc.flush();
            oc.write("Quit");
            oc.newLine();
            oc.flush();
            String result;
            while((result=ic.readLine())!=null)
            {
                System.err.println(result);
                if(result.equals("ok")==true)
                    break;
            }          
            oc.close();
            ic.close();
            socketclient.close();
        } catch (Exception e) {
        }
    }
}
