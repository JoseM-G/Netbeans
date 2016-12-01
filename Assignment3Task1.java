/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment3task1;
import java.util.Scanner;
 // @author Jose Antonio Martinez-Gonzalez
public class Assignment3Task1 {
    /** This program asks takes a user's inputted weight and
     * calculates their weight on the Moon.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
         
    }
    
}
