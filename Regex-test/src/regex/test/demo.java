/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex.test;

/**
 *
 * @author Ha Trung
 */
public class demo {
    public static void main(String[] args) {
        String var = " <html>trung</html>";
        String result = var.replaceAll("<\\w+>","");
        result = result.replaceAll("</\\w+>","");
        System.out.println(result);
    }
}
