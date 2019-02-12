/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.thread.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Ha Trung
 */
public class Client {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Moi nhap IP sever");
        // scan ip nguoi dung nhap
        final String serverHost = sc.nextLine();
        try {
            Socket socketclient = new Socket(serverHost,8888);
            System.out.println("Đã kết nói server");
            System.out.println("=============  CHAT ===========");
            BufferedReader is = new BufferedReader(new InputStreamReader(socketclient.getInputStream()));
            BufferedWriter os =new BufferedWriter(new OutputStreamWriter(socketclient.getOutputStream()));
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
