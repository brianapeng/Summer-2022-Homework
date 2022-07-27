package homework.summer.pkg2022;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brian
 */
public class BubbleSort {
    
    public static void main(String[] args){
        int[] n = {5,2,7,1,8};
        
        for(int i = 0; i < n.length; i++){
            for(int j = 0; j < n.length - 1 - i; j++){ // the end number 
                int temp = 0;
                
                if(n[j] > n[j + 1]){
                    temp = n[j]; // store it in the temp 
                    n[j] = n[j + 1]; // update the spot
                    n[j + 1] = temp; // update the one you took it from with the original value
                    
                }
            }
            
            
        }
        
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }
    }
    
    
}
