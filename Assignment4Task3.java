/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment4task3;
import java.util.Scanner;
 //@author Jose Antonio Martinez-Gonzalez
public class Assignment4Task3 {
    /** This program take a user input year and calculates if it
     *  is a leap year.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
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
    }
    
}
