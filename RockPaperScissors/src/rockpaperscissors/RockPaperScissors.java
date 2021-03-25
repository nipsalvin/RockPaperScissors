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
        
        System.out.println("Welcome to Rock, Paper, Scissors!!");
        System.out.print("Please choose R)ock, P)aper or S)cissors. > ");
        
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
        }
        else if(userChoice.equals("P") && compChoice.equals("R"))
        {
            System.out.println("the user won!");
        }
        else if(userChoice.equals("S") && compChoice.equals("P"))
        {
            System.out.println("the user won!");
        }
        
        //comp winning
        if(userChoice.equals("S") && compChoice.equals("R"))
        {
            System.out.println("the computer won!");
        }
        else if(userChoice.equals("R") && compChoice.equals("P"))
        {
            System.out.println("the computer won!");
        }
        else if(userChoice.equals("P") && compChoice.equals("S"))
        {
            System.out.println("the computer won!");
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
        
        
        
    }
    
}
