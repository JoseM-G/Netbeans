/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment9task2;
//@author Jose Antonio Martinez-Gonzalez
public class Assignment9Task2 {
    /** This program prints out a multiplication table
     *  can be lengthened or shortened by changing constraints
     */
    public static void main(String[] args) {
        int constraint1 = 9;//number of columns
        int constraint2 = 9;//number of rows
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
    }
    
}
