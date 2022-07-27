/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templatesz
 * and open the template in the editor.
 */
package homework.summer.pkg2022;

import java.util.Scanner;

/**
 *
 * @author briana
 */
public class Palindrome {

    public static boolean palindrome(String str) {
        if (str.length() == 2) {
            if (str.charAt(0) == str.charAt(1)) {
                return true;
            }
            return false;
        } else if (str.length() == 1) {
            return true;
        } else {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                return palindrome(str.substring(1, str.length() - 1));
            }
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

    }

}
