/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment4task1;
import java.util.Scanner;
 //@author Jose Antonio Martinez Gonzalez
public class Assignment4Task1 {

    /** This program take a user input seconds and converts it into minutes and 
     * the leftover seconds.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please input a number of seconds to convert to minutes: ");
        int seconds = input.nextInt();//user input
        int minutes = seconds / 60;//calculates minutes
        int remainder = seconds % 60;//calculates seconds
        System.out.println(seconds + " seconds is " + minutes + " minutes and " 
                + remainder + " seconds.");
    }
    
}
