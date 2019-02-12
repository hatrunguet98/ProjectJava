/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Ha Trung
 */
public class Sever {
    public static void main(String[] args) {
        try {
            ServerSocket listener = new ServerSocket(9999);
            Socket socketserver = listener.accept();
            BufferedReader is = new BufferedReader(new InputStreamReader(socketserver.getInputStream()));
            BufferedWriter os= new BufferedWriter(new OutputStreamWriter(socketserver.getOutputStream()));
            String line;
            while(true){
                line=is.readLine();
                os.write(line);
                os.newLine();
                os.flush();
                if(line.equals("Quit")){
                    os.write("Ok");
                    os.newLine();
                    os.flush();
                    break;
                }
            }
        } catch (Exception e) {
        }
        
    }
}
