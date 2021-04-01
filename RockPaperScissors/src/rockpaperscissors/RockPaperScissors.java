/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nips
 */
public class RockPaperScissors 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num;
        String userChoice = " ";
        String compChoice = " ";
        int userWins = 0;
        int compWins = 0;
        
        System.out.println("Welcome to Rock, Paper, Scissors!!");
        
        //repeat this section
        for(int i=0; i<3; i++)
        {
            System.out.print("\nPlease choose R)ock, P)aper or S)cissors. > ");

            userChoice = sc.nextLine();

            //Computer choice
            num = rand.nextInt(3);

            if (num == 0)
            {
                compChoice = "R";                    
            }
            else if (num == 1)
            {
                compChoice = "S";                    
            }
            else if (num == 2)
            {
                compChoice = "P";                    
            }



            //print the computer choice

            if (compChoice.equals("S"))
            {
                System.out.println("The computer chose scissors.");
            }
            else if (compChoice.equals("P"))
            {
                System.out.println("The computer chose paper.");
            }
            else if (compChoice.equals("R"))
            {
                System.out.println("The computer chose rock.");
            }

            //Determine a winner
            //Player winning
            if(userChoice.equals("R") && compChoice.equals("S"))
            {
                System.out.println("the user won!");
                userWins++;
            }
            else if(userChoice.equals("P") && compChoice.equals("R"))
            {
                System.out.println("the user won!");
                userWins++;
            }
            else if(userChoice.equals("S") && compChoice.equals("P"))
            {
                System.out.println("the user won!");
                userWins++;
            }

            //comp winning
            if(userChoice.equals("S") && compChoice.equals("R"))
            {
                System.out.println("the computer won!");
                compWins++;
            }
            else if(userChoice.equals("R") && compChoice.equals("P"))
            {
                System.out.println("the computer won!");
                compWins++;
            }
            else if(userChoice.equals("P") && compChoice.equals("S"))
            {
                System.out.println("the computer won!");
                compWins++;
            }

            //Draw/Tie
            //Can be condensed to  [if(userChoice.equals(compChoice)){System.out.println("it's a TIE!");}]
            if(userChoice.equals("S") && compChoice.equals("S"))
            {
                System.out.println("it's a TIE!");
            }
            else if(userChoice.equals("R") && compChoice.equals("R"))
            {
                System.out.println("it's a TIE!");
            }
            else if(userChoice.equals("P") && compChoice.equals("P"))
            {
                System.out.println("it's a TIE!");
            }
            //end loop here
            System.out.println("User Wins: " + userWins + " Computer wins:" + compWins);
        }
        
        //dETERMINING FINAL WINNER
        if (userWins > compWins)
        {
            System.out.println("\nThe user wins!");
        }
        else if (compWins > userWins)
        {
            System.out.println("\nThe comp wins!");
        }
        else
        {
            System.out.println("\nIts a tie!!");
        }
            
               
        
    }
    
}
