// A withdrawal System Class
// Author: CHIMA CHUKWUEBUKA
// Date: 28th may 2019

import java.util.Scanner;

public class Withdraw{ // class withdraw


    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        int amount = 7000000;
        double balance = 60000.78;

        if(amount>=balance){
            System.out.println("Insufficient Luba");
        }
        if(amount<=balance){
            System.out.println("Transaction in Progress");
        }
    } // End main method
    } // end class