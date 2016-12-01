/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2task2;

import java.util.Scanner;
 //@author Jose Antionio Martinez-Gonzalez
public class Assignment3Task2 {
    /*This program takes two user generated variable, compares them
    *and then subtracts them. The result is printed and declared
    *positive, negative or zero.
    */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //Asks for variable 1        
        System.out.println("Please enter an integer:");
        int a  = input.nextInt();
        //Asks for variable 2
        System.out.println("Please enter an integer:");
        int b = input.nextInt();
        //prints out both user generated variables
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //Subtracts the two variables
        int c  = a - b;
        //Evaluates the reult and acts accordingly
        if (c > 0){
            System.out.println("a is greater than b");
            System.out.println("");
            System.out.println("c = a - b");
            System.out.println("c = " + c);
            System.out.println("c is positive");
        }
        else if (c < 0){
            System.out.println("a is less than b");
            System.out.println("");
            System.out.println("c = a - b");
            System.out.println("c = " + c);
            System.out.println("c is negative");
        }
        else {
            System.out.println("a is equal to b");
            System.out.println("");
            System.out.println("c = a - b");
            System.out.println("c = " + c);
            System.out.println("c is zero");
        }
    }
    
}
