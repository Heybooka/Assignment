package Exercise518;

// @author CHIMA CHUKWUEBUKA

// A program that modifies the code in Fig 5.6 of Java How to Program
public class CompoundInterestProgram {


		public static void main(String[] args) {
			int compoundInterestA = 0;
			int compoundInterestB = 0;
			int amountA = 0;
			int amountB = 0;
	        int principal = 1000;
	        //int rate =  5;
	        double rate = 0.05;
	        int year;
	        for (year =1; year <= 10; year++){
	            amountB = (int)(principal * Math.pow(1 +  rate , year));
	            //amount = principal * factor2;
	            compoundInterestB = amountB - principal;
	            amountA = amountB * 100;
	            compoundInterestA = compoundInterestB *100;
	            System.out.println("Amount in year " + year + ": " + amountB + " & C.I: " + compoundInterestB);
	        }
	        System.out.println("Total amount after: " + (year-1) + " years is "+ amountB + " & " + amountA);
	        System.out.println("Total amount after: " + (year-1) + " years is "+ compoundInterestB + " & " + compoundInterestA);

		}

	}