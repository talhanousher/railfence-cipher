/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railfence.cipher;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class RailfenceCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text : ");
        String str = sc.next();
        //encryption
        StringBuffer encryptedStr1 = new StringBuffer();
        StringBuffer encryptedStr2 = new StringBuffer();
        StringBuffer encryptedStr = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                encryptedStr1.append(str.charAt(i));
            } else {
                encryptedStr2.append(str.charAt(i));
            }
        }
        encryptedStr.append(encryptedStr1).append(encryptedStr2);
        System.out.println(encryptedStr);

    }

}
