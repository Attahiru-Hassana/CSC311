public class Main {
    
    public static void main(String[] args) {
        System.out.println("Nigerian flag with a single loop: ");
        printSingleloopflag();
        
        System.out.print("\n------------------------------------\n");
        
        System.out.println("\n Nigerian flag with a nested loop: ");
        printNestedloopflag();
    }
    
    static void printSingleloopflag(){
        for(int i= 0; i<4; i++){
            System.out.println("****====****");
        }
    } 
    static void printNestedloopflag(){
        for(int i= 0; i<4; i++){
            for(int j=0; j<=12; j++){
                if(j<4 || j>=9){
                    System.out.print("*");
                }else{
                    System.out.print("=");
                }
            }
            System.out.println("");  
        }
    } 
}
