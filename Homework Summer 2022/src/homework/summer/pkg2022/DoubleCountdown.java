/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.summer.pkg2022;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class DoubleCountdown {
    public static void countdown(int num){
    if(num == 1){
        System.out.println(num);
    }
    else{
    System.out.println(num);
    countdown(num-1);
    }
}
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();
        
       countdown(num);
       countdown(num-1);
        System.out.println("0");
    }
}
