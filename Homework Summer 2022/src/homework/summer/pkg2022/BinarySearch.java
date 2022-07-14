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
public class BinarySearch {

    static void BinarySearch() {
        Scanner s = new Scanner(System.in);
        System.out.print("What is the size of your array? ");

        int size = s.nextInt();
        int[] arr = new int[size];

        System.out.println("Please input the numbers");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Input a number, and we will find the index for you.");
        int key = s.nextInt();

        int high = size - 1;
        int low = 0;
        int mid = (high + low) / 2;

        while (low <= high) {
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;

        }
        if (low > high) {
            System.out.println("Element is not found");
        }
    }
}
