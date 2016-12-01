/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment6task1;
import java.util.Scanner;
 //@author Jose Antonio Martinez-Gonzales
public class Assignment6Task1 {
    /** This program takes a user inputted income and computes
     * how much of that is taxed
     */
    public static void main(String[] args) {
        double TaxRate = 0;
        Scanner input = new Scanner(System.in);
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
    }
    
}
