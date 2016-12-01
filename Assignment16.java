/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment16;
import java.util.Scanner;
 //@author Jose Antonio Martinez-Gonzalez
class BMI{
    double weight;
    double height;
    double bmi;
    String name;
    String category;
    double calculate(){
        return bmi = 703*(weight/(height * height));
    }
    void rate(){
        if (bmi <= 16){
            category = "Severe Thinness";
        }
        if (bmi >= 16.1 && bmi <= 17){
            category = "Moderate Thinness";
        }
        if (bmi >= 17.1 && bmi <= 18.5){
            category = "Mild Thinness";
        }
        if (bmi >= 18.6 && bmi <= 26){
            category = "Normal";
        }
        if (bmi >= 26.1 && bmi <= 30){
            category = "Overweight";
        }
        if (bmi >= 30.1 && bmi <= 35){
            category = "Obese Class I";
        }
        if (bmi >= 35.1 && bmi <= 40){
            category = "Obese Class II";
        }
        if (bmi >= 40.1){
            category = "Obese Class III";
        }
        System.out.printf("The BMI for %s is %.1f which is in"
                + " the %s Category\n", name, bmi, category);
    }
}
public class Assignment16 {
    /** This program takes user input information and 
     *  calculates their bmi and bmi category.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BMI userBmi = new BMI();
        System.out.println("What is your name?: ");
        userBmi.name = input.nextLine();
        System.out.println("What is your height in inches?: ");
        userBmi.height = input.nextDouble();
        System.out.println("What is your weight in lbs?: ");
        userBmi.weight = input.nextDouble();
        userBmi.calculate();
        userBmi.rate();
    }
    
}
