/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment4task2;
import java.util.Scanner;
 //@author Jose Antonio Martinez-Gonzalez
public class Assignment4Task2 {
    /** This program take a user input seconds and converts it into hours,
     * minutes and seconds.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
    }
    
}
