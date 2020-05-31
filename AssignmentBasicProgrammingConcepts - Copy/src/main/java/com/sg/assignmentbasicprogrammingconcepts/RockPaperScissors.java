/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assignmentbasicprogrammingconcepts;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author TheFemiFactor
 */
public class RockPaperScissors {
    
    public static void main(String[] args) {
        
        String numRoundsValue;
        String userChoiceValue;
        
        int numRounds;
        int userChoice;
        int tie = 0;
        int comWin = 0;
        int userWin = 0;
        String contGame;
        
        Scanner userInput = new Scanner(System.in);
        
        
    do {
        
        System.out.println("How many rounds would you like to play?: ");
        numRoundsValue = userInput.nextLine();
        numRounds = Integer.parseInt(numRoundsValue);
        
        if (numRounds < 1 || numRounds > 10) {
            return;
        }
        else {
           for (int i = 0; i < numRounds; i++) {
               System.out.println("Rock = 1, Paper = 2, Scissors = 3");
               System.out.println("Enter a choice for your selection: ");
               userChoiceValue = userInput.nextLine();
               userChoice = Integer.parseInt(userChoiceValue);
               
               Random randomizer = new Random();
               int comChoice = randomizer.nextInt(3) + 1;
               System.out.println(comChoice);
               
               // If user picks Rock
               if (userChoice == 1) {
                   if (comChoice == 1) {
                       System.out.println("User chose Rock, the computer chose "
                               + "Rock. Tie game. (-_-)");
                       tie++; 
                   }
                   else if (comChoice == 2) {
                       System.out.println("User chose Rock, the computer chose "
                               + "Paper. Computer wins. :(");
                       comWin++;
                   }
                   else if (comChoice == 3) {
                       System.out.println("User chose Rock, the computer chose"
                               + "Scissors. User wins. :)");
                       userWin++;
                   }
               }
               
                // If user picks Paper
                else if (userChoice == 2) {
                   if (comChoice == 1) {
                       System.out.println("User chose Paper, the computer chose"
                               + " Rock. User wins. :)");
                       userWin++; 
                   }
                   else if (comChoice == 2) {
                       System.out.println("User chose Paper, the computer chose "
                               + "Paper. Tie game. (-_-)");
                       tie++;
                   }
                   else if (comChoice == 3) {
                       System.out.println("User chose Rock, the computer chose"
                               + "Scissors. Computer wins. :(");
                       comWin++;
                   }
                 }
                   
                // If user picks Scissors
                else if (userChoice == 3) {
                    if (comChoice == 1) {
                        System.out.println("User chose Scissors, the computer "
                                + "chose Rock. Computer wins. :(");
                        comWin++; 
                    }
                    else if (comChoice == 2) {
                        System.out.println("User chose Scissors, the computer "
                                + "chose Paper. User wins. :)");
                        userWin++;
                    }
                    else if (comChoice == 3) {
                        System.out.println("User chose Scissors, the computer "
                                + "chose Scissors. Tie game. (-_-)");
                        tie++;
                    }
                }
           }
        System.out.println("**GAME SUMMARY**");
        System.out.println("Tie: " + tie);
        System.out.println("Computer wins: " + comWin);
        System.out.println("User wins: " + userWin);
        if (comWin > userWin) {
            System.out.println("Sorry, but the computer wins this match :(");
        }
        else if (userWin > comWin) {
            System.out.println("Congratulations, the user wins this match! :)");
        }
        else if (userWin == comWin) {
            System.out.println("Wow, it was a tie game!");
        }
        
        }
    System.out.println("Will you like to play another match? \"yes\" or "
    + " \"no\"?");
    contGame = userInput.nextLine();
    tie = 0;
    comWin = 0;
    userWin = 0;
    }
    while (contGame.equalsIgnoreCase("yes"));
    System.out.println("Thank you for playing!");
               
               
        }
        
}
