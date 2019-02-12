/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 *
 * @author Ha Trung
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        user user1 = new user();
        try {
//            InputStream input= new FileInputStream("D:/data.txt");
//            InputStreamReader inputline= new InputStreamReader(input);
//            BufferedReader line= new BufferedReader(inputline);
//            String i=line.readLine();
//            while(i !=null){
//                System.out.println(i);
//                i=line.readLine();
//            }
//            input.close();
//             InputStream inputsc = System.in;
//             int i;
//             while((i=inputsc.read())!=-1){
//                 System.out.println((char)i);
//             }
//             inputsc.close();
            FileInputStream input= new FileInputStream("D:/data.txt");
            ObjectInputStream inputobject = new ObjectInputStream(input);
            user1 = (user) inputobject.readObject();
            System.out.println(user1.getName());
            input.close();
            
        } catch (Exception e) {
        }
    }
    
}
