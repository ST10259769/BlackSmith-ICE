/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blacksmith;

import java.util.Scanner;

/**
 *
 * @author s.nkomo
 */
public class BlackSmith {
    

    public static void main(String[] args) {
        
        //1 declaring interger variables
        int numberofDays,daggersPerDay = 3,totalnumberOfDaggers;
        double numberOfPairs;
        
        //2 initializing a scanner object
        Scanner scanner = new Scanner(System.in);
        
        //3 prompt the user for input
        System.out.print("Input number of days ");
        numberofDays=scanner.nextInt();
        
        //calculating the total number of daggers in days
        totalnumberOfDaggers=numberofDays*daggersPerDay;
        
        //calculating the number of pairs
        numberOfPairs = (int) (totalnumberOfDaggers/2);
      
        //displaying number of full dagger pairs made and if there is an extra dagger
        System.out.println( totalnumberOfDaggers+ " daggers have " +numberOfPairs+ " pairs"+ "and an extra"+"");
       
    }
    //calling a method and parameters 
public static double totalnumberOfDaggers(int daggersPerDay){
        int numberofDays = scanner.nextInt();
    
    double totalnumberOfDaggers = numberofDays* daggersPerDay;
    
    return totalnumberOfDaggers;
}
}

