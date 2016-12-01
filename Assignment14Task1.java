/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment14task1;
import java.util.Scanner;
 //@author jose Antonio Martinez-Gonzalez
class tax{
    double income;
    double taxRate;
    double taxedIncome(){
        if (income <= 6000){
            taxRate = 0.10;
        }
        if ((income >= 6001) && (income <= 27950)){
            taxRate = 0.15;
        }
        if ((income >= 6001) && (income <= 67700)){
            taxRate = 0.27;
        }
        if ((income >= 67701) && (income <= 141250)){
            taxRate = 0.30;
        }
        if ((income >= 141251) && (income <= 307050)){
            taxRate = 0.35;
        }
        if (income >= 307051){
            taxRate = 0.386;
        }
        return income * taxRate;
    }
}
public class Assignment14Task1 {
    /** This program takes a user input income and calculates
     *  the income tax burden
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much do you make?: ");
        tax userIncome = new tax();
        userIncome.income = input.nextInt();
        System.out.printf("Income tax for a single person making "
                + "$%.2f is $%.2f\n", userIncome.income, userIncome.taxedIncome());
        //System.out.println(userIncome.taxRate);//test tax rate
    }
    
}
