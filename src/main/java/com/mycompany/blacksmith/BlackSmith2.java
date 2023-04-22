/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blacksmith;

import java.util.Scanner;

/**
 *
 * @author s.nkomo
 */
public class BlackSmith2 {
    

    public static void main(String[] args) {
        
        //1 declaring interger variables
        int numberofDays,daggersPerDay = 3,totalnumberOfDaggers,numberOfPairs,daggersRemaining;
        
        
        //2 initializing a scanner object
        Scanner scanner = new Scanner(System.in);
        
        //3 prompt the user for input
        System.out.print("Input number of days ");
        numberofDays=scanner.nextInt();
        
        //calculating the total number of daggers in days
        totalnumberOfDaggers=numberofDays*daggersPerDay;
        
        //calculating the number of pairs
        numberOfPairs = (int) (totalnumberOfDaggers/2);
        
        //calculating the remainder of pairs and showing the remainder
        
        daggersRemaining = totalnumberOfDaggers % 2;
      
        //displaying number of full dagger pairs made and if there is an extra dagger
        System.out.println( totalnumberOfDaggers+ " daggers have " +numberOfPairs+ " pairs "+ "and an extra "+daggersRemaining+"");
        
       
       
    }
    //calling a method and parameters 
public static double totalnumberOfDaggers(int daggersPerDay){
        int numberofDays = scanner.nextInt();
    
    double totalnumberOfDaggers = numberofDays* daggersPerDay;
    
    return totalnumberOfDaggers;
}
}
/*Ma'am i created a github account and went on to create a repository , 
so now i don't know why the CMD is not working and can't link my repository copy the link
i got the recording software but didn't upload the video on youtube. But i'd like to believe
that my program is okay. THE CMD is kind of comlicated so i would like you to show me my mistake
2 or 3 minutes after our Friday afternoon session. Thank You.
*/
