/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.thread.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Ha Trung
 */
public class server {
    public static void main(String[] args) throws IOException {
                try {
            ServerSocket listener = new ServerSocket(8888);
            Socket socketserver = listener.accept();
            BufferedReader is = new BufferedReader(new InputStreamReader(socketserver.getInputStream()));
            BufferedWriter os =new BufferedWriter(new OutputStreamWriter(socketserver.getOutputStream()));
            Thread read = new Thread(new Runnable() {

                @Override
                public void run() {
                    while(true){
                        try {
                            String result=is.readLine();
                             if(!result.isEmpty()){                   
                            System.out.println("            "+result);
                            }
                        } catch (Exception e) {
                        }
                    }
                }
            });
            read.start();
            Scanner sc =new Scanner(System.in);
            while(true){                
                   String send= sc.nextLine();
                   os.write(send);
                   os.newLine();
                   os.flush();
            }
        } catch (Exception e) {
        }
    }
    
}
