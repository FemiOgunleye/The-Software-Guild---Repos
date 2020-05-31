/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assignmentbasicprogrammingconcepts;
import java.util.Scanner;
/**
 *
 * @author TheFemiFactor
 */
public class HealthyHearts {
    public static void main(String[] args) {
   
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What is your age? ");
        int age = inputReader.nextInt();
        
        int max = 220 - age;
        double target1 = .50 * max;
        double target2 = .85 * max;
        System.out.println("Your maximum heart rate should be " + (max) + 
                " beats per minute");
        System.out.println("Your target HR Zone is " + (int)(target1) + " - " + 
                (int)(target2) + " beats per minute");
        
        
}
    
}
