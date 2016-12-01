/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment10task2;
import java.util.Scanner;
//@author Jose Antonio Martinez-Gonzalez
public class Assignment10Task2 {
    /** This program displays a menu with some programs I have created
     *  user can pick to run one or Quit.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        do {
            System.out.println("*************************************");
            System.out.println("*Main menu:                         *");
            System.out.println("*Enter number to run program or Quit*");
            System.out.println("*1)Moon weight calculator           *");
            System.out.println("*2)Convert seconds                  *");
            System.out.println("*3)Leap year                        *");
            System.out.println("*4)Grade range                      *");
            System.out.println("*5)Income tax                       *");
            System.out.println("*6)Cash register                    *");
            System.out.println("*7)Multiplication table             *");
            System.out.println("*8)Quit                             *");
            System.out.println("*************************************");
            int option = input.nextInt();
        switch(option){
            case 1:
                int weight  = 0;//Sets initial value of weight to zero
                /*Loops question to user about their weight until a positive and 
                *and non-zero value is inputted
                */
                while(weight <= 0){
                System.out.println("Please enter your weight:");
                weight = input.nextInt();
                }
                //Calculates weight on Moon and displays both values 
                float moonweight = (float) (weight * 0.17);
                System.out.println("Your weight on Earth is:" + weight + "lbs");
                System.out.println("Your weight on the Moon is:" + moonweight + "lbs");
                break;
            case 2:
                 boolean over = true;//boolean for the input being > a day.
                while (over){ 
                System.out.println("Please input a number of seconds to convert to "
                + "hours and minutes up to a day total: ");
                int seconds = input.nextInt();//user input
                //if input is > a day, then loop continues until correct value is inputed
                if (seconds > 86400){
                    System.out.println("Please input less than a day of seconds.");
                }
                //otherwise the program continues normally
                else{
                over = false;
                int hours = seconds / 3600;//calculates hours
                int minutes = (seconds % 3600) / 60;//uses remainder from hours for minutes
                int remainder = seconds % 60;//calculates seconds
                System.out.println(seconds + " seconds is " + hours + " hours, " + 
                     minutes + " minutes and " + remainder + " seconds.");
                }
             }
            break;
            case 3: 
                System.out.println("Please input a year: ");
                int year = input.nextInt();//user input
                //If user input is a leap year, print this
                if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
                    System.out.println(year + " is a leap year? True");
                }
                //otherwise print this
                else{
                 System.out.println(year + " is a leap year? False");
             }
                break;
            case 4:
                boolean InRange = false;//If the input is within 0-100
                //loops until value of 0-100 is inputted
                while(InRange == false){
                    System.out.println("Please input your grade: ");
                    int grade = input.nextInt();//user input
                    //if input is outside of range
                    if ((grade < 0)||(grade > 100)){
                        System.out.println("Please enter a number from 0 to 100.");
                 }
                 //if input is inside of range
                 else {
                     InRange = true;
                     if ((grade >= 0) && (grade <= 59)){
                     System.out.println(grade + " is a F. Try harder");
                      }
                      else if ((grade >= 60) && (grade <= 69)){
                          System.out.println(grade + " is a D. Try harder");
                      }
                      else if ((grade >= 70) && (grade <= 79)){
                          System.out.println(grade + " is a C. Ok");
                      }
                     else if ((grade >= 80) && (grade <= 89)){
                         System.out.println(grade + " is a B. Good");
                     }
                        else {
                            System.out.println(grade + " is a A. Excellent");
                       }
                 }
              }
                break;
            case 5:
                double TaxRate = 0;
                System.out.println("Please enter an income: ");
                int income = input.nextInt();//user input
                //prints if income is <0, so they're in debt
                if (income < 0){
                 System.out.println("I'm sorry to hear that.");
             }
             //sets tax rate based on income
             else{
                 if (income <= 6000){
                        TaxRate = 0.10;
                    }
                   else if ((income >= 6001) && (income <= 27950)){
                       TaxRate = 0.15;
                   }
                   else if ((income >= 27951) && (income <= 67700)){
                      TaxRate = 0.27;
                  }
                   else if ((income >= 67701) && (income <= 141250)){
                      TaxRate = 0.30;
                  }
                 else if ((income >= 141251) && (income <= 307050)){
                      TaxRate = 0.35;
                  }
                 else {
                     TaxRate = 0.386;
                 }
                 //System.out.println(TaxRate);//used to test value of tax rate
                 //computes taxed income
                 double TaxedIncome = income * TaxRate;
                  System.out.printf("The income tax for a single person making $%d is"
                          + " $%.2f\n", income, TaxedIncome);
             }
                break;
            case 6:
                System.out.println("Amount owed: ");
                float owed = input.nextFloat();//money owed
                System.out.println("Amount received: ");
                float received = input.nextFloat();//money received
                //initialize change variables
                int dollars = 0;
                int quarters = 0;
                int dimes = 0;
                int nickels = 0;
                int pennies = 0;
                //calculates dollars
             dollars = (int) (received - owed);
             //calculates nickels
             float calc1 =  (float) ((received - owed) - dollars);
             if(calc1 >= 0.25) {
                 quarters = (int) (calc1 / 0.25);
             }
                //calculates dimes
                float calc2 = (float) Math.round((received - owed - dollars - 
                     (quarters * 0.25)) * 100) / 100;
             if(calc2 >= 0.1){
                 dimes = (int) (calc2 / 0.1);
             }
             //calculates nickels
             float calc3 = (float) Math.round((received - owed - dollars - 
                     (quarters * 0.25) - (dimes * 0.1)) * 100) / 100;
             if(calc3 >= 0.05){
                 nickels = (int) (calc3 / 0.05);
             }
              //calculates pennies
              float calc4 = (float) Math.round((received - owed - dollars - 
                     (quarters * 0.25) - (dimes * 0.1) - (nickels * 0.05)) * 1000) / 1000;
             if(calc4 >= 0.009){
                 pennies = (int) (calc4 / 0.01);
                 pennies++;//adds penny dropped in calculations
             }
             System.out.println("The amount of change is:");
             System.out.println(dollars + " dollar(s)");
             System.out.println(quarters + " quarter(s)");
             System.out.println(dimes + " dime(s)");
             System.out.println(nickels + " nickel(s)");
             //System.out.println(calc4);//test
             System.out.println(pennies + " pennie(s)");
             //System.out.println(((received - owed) - dollars - (quarters * 0.25)));//test
                break;
            case 7:
                System.out.println("Number of columns?: ");
                int constraint1 = input.nextInt();//number of columns
                System.out.println("Number of Rows?: ");
                int constraint2 = input.nextInt();//number of rows
                //displays the top row
             System.out.print("   ");
                for (int i = 1; i < constraint1 + 1; i++){
                    System.out.print(i + "\t");
                }
              System.out.printf("\n");
              //displays the divider
             System.out.print("---");
             for(int l = 1 ; l < constraint1; l++){
                 System.out.print("--------");
              }
              //displays the rows with multiplications
             System.out.printf("\n");
              for (int j = 1; j < constraint2 + 1; j++){
                 System.out.print(j + "| ");
                 for (int k = 1; k < constraint1 + 1; k++){
                     System.out.print((k * j) + "\t");
                 }
                 System.out.printf("\n");
             }
                break;
            case 8:
                run = false;
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }    
        } while(run == true);
    }
    
}
