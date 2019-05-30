// Invoice test
// Author: CHIMA CHUKWUEBUKA
// Date: 30th may 2019


public class InvoiceTest{

    public static void main(String[] args){

        Invoice invoice1 = new Invoice("B1003" ,"Piston component" ,15, 200.0 );

        System.out.println("Product Number: " + invoice1.getPartNumber());
        System.out.println("Product Description: " + invoice1.getPartDescription());
        System.out.println("Product Quantity: " + invoice1.getQuantity());
        System.out.println("Product Price: " + invoice1.getPrice());
        System.out.println("Product Amount: " + invoice1.getInvoiceAmount());
    }
}