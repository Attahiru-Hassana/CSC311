package Exercise_4;

import java.util.Scanner;

public class OneDimArray {
        public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double[] array= new double[4];
        
        for(int i= 0; i<array.length; i++){
            System.out.print("Enter the " +(i+1)+ " element: ");
            array[i]= scanner.nextDouble();
        }
        
        /************B part***********/
        for(double i: array){
            System.out.println("The element "+((int) i+1)+ " is: "+ i);
        }

        scanner.close();
    }
}
