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
public class threadsocket extends Thread{
   private Socket socketserver;
   private int clientname;

    public threadsocket(Socket socketserver, int clientname) {
        this.socketserver = socketserver;
        this.clientname = clientname;
    }
    @Override
   public void run(){
       try {
           BufferedReader is = new BufferedReader(new InputStreamReader(socketserver.getInputStream()));
           BufferedWriter os =new BufferedWriter(new OutputStreamWriter(socketserver.getOutputStream()));
           while(true){
               String result=is.readLine();
               if(result!=null){                   
                       System.out.println(":"+is.readLine());
               }
               if(result.equals("bye")==true)
               {
                   break;
               }
               else{
                   Scanner sc =new Scanner(System.in);
                   String send= sc.nextLine();
                   os.write(send);
                   os.newLine();
                   os.flush();                  
               }
           }
       } catch (Exception e) {
       }
   }
}
