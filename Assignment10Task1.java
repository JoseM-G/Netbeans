/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment10task1;
import java.util.Scanner;
 //@author Jose Antonio Martinez-Gonzalez
public class Assignment10Task1 {
    /** This program asks the user for a month and displays
     *  the number of days it has
     */
    public static void main(String[] args) {
        int days = 0;
        String monthName = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of a month(1-12): ");
        int month = input.nextInt();
        System.out.println("What year is it?: ");
        int year = input.nextInt();
        switch (month){
            case 1:
                days = 31;
                monthName = "January";
                break;
            case 2:
                if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
                days = 29;
            }
                else days = 28;
                monthName = "February";
                break;
            case 3:
                days = 31;
                monthName = "March";
                break;
            case 4:
                days = 30;
                monthName = "April";
                break;
            case 5:
                days = 31;
                monthName = "May";
                break;
            case 6:
                days = 30;
                monthName = "June";
                break;
            case 7:
                days = 31;
                monthName = "July";
                break;
            case 8:
                days = 31;
                monthName = "August";
                break;
            case 9:
                days = 30;
                monthName = "September";
                break;
            case 10:
                days = 31;
                monthName = "October";
                break;
            case 11:
                days = 30;
                monthName = "November";
                break;
            case 12:
                days = 31;
                monthName = "December";
                break;
            default:
                System.out.println("Invalid Month.");
        }
        if(month >= 1 && month <= 12)
        System.out.println("The number of days in " + monthName + " is " + days);
    }
    
}
