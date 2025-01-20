package Exercise_5;

import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        //Declaring array
        double[][] array= new double[10][10];
        
        for(int row= 0; row< array.length; row++){
            for(int col= 0; col< array[row].length; col++){
                System.out.print("Enter the value for element [" + (row+1) + "][" + (col+1) + "]: ");
                array[row][col]= scanner.nextDouble();
            }
        }
        
        System.out.println("\nDisplaying all elements in array: ");
        for(int row= 0; row< array.length; row++){
            for(int col= 0; col< array[row].length; col++){
                System.out.println("The "+ (col+1) +" of "+ (row+1) +" element: "+ array[row][col]);
            }
        }
        scanner.close();
    }
        
}
