/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
/**
 *
 * @author Ha Trung
 */
public class Outsteam {
    public static void main(String[] args) {
        try {
//            OutputStream output= new FileOutputStream("D:/data.txt");
//            Scanner sc= new Scanner(System.in);
//            String outputsc = null;
//            outputsc=sc.nextLine();
//            PrintWriter  pw = new PrintWriter(output);          
//            pw.write(outputsc);
//            output.close();
            FileOutputStream output = new FileOutputStream("D:/data.txt");
            ObjectOutputStream outputobjec= new ObjectOutputStream(output);
            user user= new user();
            user.setName("hacontrunghacongtrung");
            user.setTuoi(21);
            outputobjec.writeObject(user);
            output.close();
        } catch (Exception e) {
        }
    }
}
