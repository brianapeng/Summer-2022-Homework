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
public class LinearSearch {
//should i hardcode a linear search or not? 
    static void LinearSearch() {
        Scanner s = new Scanner(System.in);
        
        System.out.print("What is the size of your array? "); 
        
        int size = s.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Please input the numbers");
        for(int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }
        
        System.out.println("Input a number, and we will find the index for you.");
        int key = s.nextInt();
        
        int index = -1;
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                index = i;    
            } 
            
        }
        
        System.out.println(key + " is found at index " + index);

    }
}
