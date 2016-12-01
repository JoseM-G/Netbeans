/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment15task1;
import java.util.Scanner;
//@author Jose Antonio Martinez-Gonzalez
class vehicle{
    Integer passengers;
    Integer fuelCapacity;
    Integer mpg;
    String vehicleType;
    Integer range(){
        return fuelCapacity * mpg;
    }
    void vehicleMenu(){
        System.out.println("********************************");
        System.out.println("*" + vehicleType + " main menu:                    *");
        System.out.println("*Enter # to run program or Quit*");
        System.out.println("*1)Enter Fuel Capacity         *");
        System.out.println("*2)Enter Miles Per Gallon      *");
        System.out.println("*3)Calculate Range             *");
        System.out.println("*4)Quit                        *");
        System.out.println("********************************");
    }
}
public class Assignment15Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        System.out.println("********************************");
        System.out.println("*Main menu:                    *");
        System.out.println("*Enter # to run program or Quit*");
        System.out.println("*1)SUV                         *");
        System.out.println("*2)Sports car                  *");
        System.out.println("*3)Hybrid                      *");
        System.out.println("*4)Quit                        *");
        System.out.println("********************************");
        int option1 = 1;
        do{
            //System.out.println("********************************");
            //System.out.println("*Main menu:                    *");
            //System.out.println("*Enter # to run program or Quit*");
            //System.out.println("*1)SUV                         *");
            //System.out.println("*2)Sports car                  *");
            //System.out.println("*3)Hybrid                      *");
            //System.out.println("*4)Quit                        *");
            //System.out.println("********************************");
            //int option1 = 1;
            vehicle car = new vehicle();
            switch(option1){
                case 1:
                    int option2 = input.nextInt();
                    switch (option2){
                    case 1:case 2:case 3:
                        //vehicle car = new vehicle();
                        if (option2 == 1){
                            vehicle suv = car;
                            suv.vehicleType = "SUV";
                            System.out.println("You Selected Option 1: " + suv.vehicleType);
                            //suv.vehicleMenu();
                        }
                        if (option2 == 2){
                            vehicle sportsCar = car;
                            sportsCar.vehicleType = "Sports Car";
                            System.out.println("You Selected Option 2: " + sportsCar.vehicleType);
                            //sportsCar.vehicleMenu();
                        }
                        if (option2 == 3){
                            vehicle hybrid = car;
                            hybrid.vehicleType = "Hybrid";
                            System.out.println("You Selected Option 3: " + hybrid.vehicleType);
                            //hybrid.vehicleMenu();
                        }
                        //vehicle suv = new vehicle();
                        //suv.vehicleType = "SUV";
                        //System.out.println("You Selected Option 1: " + suv.vehicleType);
                        option1 = 2;
                        car.vehicleMenu();
                        break;
                    //case 2:
                        //vehicle sportsCar = new vehicle();
                        //sportsCar.vehicleType = "Sports Car";
                        //System.out.println("You Selected Option 2: " + sportsCar.vehicleType);
                        //option1 = 2;
                        //sportsCar.vehicleMenu();
                        //break;
                    //case 3:
                        //vehicle hybrid = new vehicle();
                        //hybrid.vehicleType = "Hybrid";
                        //System.out.println("You Selected Option 3: " + hybrid.vehicleType);
                        //option1 = 2;
                        //hybrid.vehicleMenu();
                        //break;
                    case 4:
                        run = false;
                        break;
                    default:
                        System.out.println("Invalid entry");
                        break;   
                    }   
                    break;
                case 2:
                    int option3 = input.nextInt();
                    switch (option3){
                        case 1:
                            System.out.printf("You Selected Option 1: \nEnter fuel capacity in integers please ");
                            car.fuelCapacity = input.nextInt();
                            break;
                        case 2:
                            System.out.printf("You Selected Option 2: \nEnter miles per gallon in integers please ");
                            car.mpg = input.nextInt();
                            break;
                        case 3:
                            System.out.printf("You Selected Option 3: \n Range = ", car.range());
                            break;
                        case 4:
                            run = false;
                            break;
                        default:
                            System.out.println("Invalid entry");
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
            }
        }while (run == true);
    }
    
}
