/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assignmentbasicprogrammingconcepts;

/**
 *
 * @author TheFemiFactor
 */
public class SummativeSums {
    public static void main(String[] args) {
        
        int numList1[] = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int numList2[] = {999, -60, -77, 14, 160, 301};
        int numList3[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120,
            130, 140, 150, 160, 170, 180, 190, 200, -99};
        
        System.out.println("#1 Array Sum: " + sum(numList1));
        System.out.println("#2 Array Sum: " + sum(numList2));
        System.out.println("#3 Array Sum: " + sum(numList3));
        }
        
    
    public static int sum(int [] list) {
        
        int total = 0;
        for(int i = 0; i < list.length; i++) 
        {
            total += list[i];
        }
        return total;
    }
    
}
