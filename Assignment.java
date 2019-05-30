// Assignment
// Author:Chima Chukwuebuka
// Date: 16-05-2019

 import java.util.Scanner;
       
public class Assignment{
   
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        String operation;


        System.out.println("Please Enter The First Number");
        num1 = input.nextInt();

        System.out.println("Please Enter The Second Number");
        num2 = input.nextInt();

       Scanner op = new Scanner(System.in);

       System.out.println("Please Enter The Operation");
       operation = op.next();

       if(operation.equals("+"))
       {
           System.out.println("Your Answer is  "+(num1 + num2));
       }
       else if (operation.equals("-"))
       {
           System.out.println("Your Answer is "+(num1 - num2));
       }
       else if (operation.equals("*"))
       {
           System.out.println("Your Answer is "+(num1 * num2));
       }
       else if (operation.equals("/"))
       {
           System.out.println("Your Answer is "+(num1 / num2));
       }
       else if (operation.equals("^"))
       {
           int digit1 = num1;
         int digit2 = num2;
         int m = 1;

         for(int i = 0; i < digit2; i++)
            m = m * digit1;{
                System.out.println("Your Answer is "+ m);
            }
       }



     }
}   