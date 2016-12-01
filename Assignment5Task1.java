/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assigment5task1;
import java.util.Scanner;
 //@author Jose Antonio Martinez-Gonzalez
public class Assigment5Task1 {
    // This program takes a user input grade and gives it a letter grade
    public static void main(String[] args) {
        boolean InRange = false;//If the input is within 0-100
        //loops until value of 0-100 is inputted
        while(InRange == false){
            Scanner input = new Scanner(System.in);
            System.out.println("Please input your grade: ");
            int grade = input.nextInt();//user input
            //if input is outside of range
            if ((grade <= 0)||(grade >= 100)){
                System.out.println("Please enter a number from 0 to 100.");
            }
            //if input is inside of range
            else {
                InRange = true;
                if ((grade >= 0) && (grade <= 59)){
                System.out.println(grade + " is a F. Try harder");
                }
                else if ((grade >= 60) && (grade <= 69)){
                    System.out.println(grade + " is a D. Try harder");
                }
                else if ((grade >= 70) && (grade <= 79)){
                    System.out.println(grade + " is a C. Ok");
                }
                else if ((grade >= 80) && (grade <= 89)){
                    System.out.println(grade + " is a B. Good");
                }
                else {
                    System.out.println(grade + " is a A. Excellent");
                }
            }
        }
    }
    
}
