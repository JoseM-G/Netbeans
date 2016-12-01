/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment12task1;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Assignment12Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a string: ");
        String sentence = input.nextLine();
        String sentence2 = sentence.replaceAll("\\s+","");
        char[] array1 = sentence2.toCharArray();
        char[] backwards = new char[sentence2.length()];
        boolean same = true;
        //System.out.println(sentence.length());
        for (int i = sentence2.length(); i > 0; i--){
            //System.out.println(i);
            //char c = sentence.charAt(i); 
            //System.out.println(c);
            backwards[sentence2.length() - i] = array1[i - 1]; 
        }
        for (int i = 0; i < sentence2.length(); i++){
            int ascii1 = array1[i];
            int ascii2 = backwards[i];
            if (ascii1 != ascii2){
                same = false;
            }
            System.out.println(backwards[i]);
        }
        if (same == true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
}
