/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment8task2;
import java.util.Scanner;
 //@author Jose Antonio Martinez-Gonzalez
public class Assignment8Task2 {
    /** This program takes money owed and money received and calculates
     *  the amount of change to give.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
    }
    
}
