/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assignmentbasicprogrammingconcepts;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author TheFemiFactor
 */
public class DogGenetics {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random generatedNum = new Random();
        
        System.out.println("What is your dog's name?");
        String name = userInput.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on"
                + name + "'s prestigious background right here.");
        System.out.println(name + " is:");
        
        int percent1 = generatedNum.nextInt(101) +1;
        System.out.println(percent1 + "% St. Bernards");
        int percent2 = generatedNum.nextInt(101 - percent1) + percent1;
        System.out.println(percent2 - percent1 + "% Golden Retriever");
        int percent3 = generatedNum.nextInt(101 - percent2) + percent2;
        System.out.println(percent3 - percent2 + "% Chihuahua");
        int percent4 = generatedNum.nextInt(101 - percent3) + percent3;
        //If I did this again for percent5, it only generates to 99?
        System.out.println(percent4 - percent3 + "% King Doberman");
        int preTotal = (percent4 - percent3) + (percent3 - percent2) + 
                (percent2 - percent1) + percent1;
        int percent5 = 100 - preTotal;
        System.out.println(percent5 + "% Common Cur");
        System.out.println(percent1 + ", " + percent2 + ", " + percent3 + ", " +
                percent4 + ", " );
            }
    
}
