import java.util.*;
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static int num1,num2,sentinel,x;
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        x =1;
        while(x == 1){
            
            //sets up th two variables needed
            System.out.println("Enter your first number");        
            num1 = scan.nextInt();
            System.out.println("Enter your second number");
            num2 = scan.nextInt();
            
            
            //Gives the answer and calls the recursive method
            System.out.println("The GCD of " + num1 + " and " + num2 + " is " + GCD(num1, num2));
            System.out.println();
            //To stop the program if the user wants to
            System.out.println("enter 1 to go or 2 to stop");
            sentinel = scan.nextInt();
            if (sentinel == 2)
                x = 2;
        }
    }
    //recursice method
    public static int GCD(int num1,int num2){
        if (num2 == 0)
            return Math.abs(num1);
        else
            return GCD(num2, num1%num2);
    }
}