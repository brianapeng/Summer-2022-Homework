/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.summer.pkg2022;

/**
 *
 * @author brian
 */
// create a factorial 
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int num) {
        if (num == 1) {
            return 1;
        }

        return num * factorial(num - 1);

    }
}
