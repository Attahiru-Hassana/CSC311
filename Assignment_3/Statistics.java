import java.util.Arrays;
public class Statistics
{
	public static void main(String[] args) {
	    //Declaring array
	    int [] num =  {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};
	    
	    double sum=0;
	    for (int i : num){
	        sum+=i;
	    }
		System.out.println(" \n--------Calculating Mean:--------");
	    double Mean= sum/num.length;
	    System.out.println("The mean of the given array is: " + Mean);
	    
	    //Median:
	    System.out.println(" \n--------Calculating median:--------");
	    Arrays.sort(num);
	    double median;
	    if (num.length%2==0){
	        median= (num[(num.length/2) -1] + num[num.length/2]) /2.0;
	    }else{
	        median= num[num.length/2];
	    }
	    System.out.println("The median of the given array: " + median);
	    
	    System.out.println("\n--------Calculating Standard deviation:-----------");
	    
	    double result=0;
	    for (int i=0; i<num.length; i++){
	        result+= Math.pow((Mean - num[i])/num.length, 2);
	    }
        
        double std = Math.sqrt(result);
        System.out.println("The standard deviation of the given array: " + std);
	    
	}
}