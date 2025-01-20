public class USAflag{
    public static void main(String[] args){
        System.out.println("USA flag with a single loop");
        printSingleloopflag();
        
        System.out.println("\n------------------------------\n");
        
        System.out.println("USA flag with a Nested loop");
        printNestedloopflag();
        
        }
    static void printSingleloopflag(){
            for(int i=0; i<4; i++){
                if(i<2){
                    System.out.println("=======");
                }else{
                    System.out.println("===========");
                }
            }
    }
    
    static void printNestedloopflag(){
        for(int i=0; i<4; i++){
            System.out.println("");
            for(int j= 0; j< 11; j++){
                if(j<4 && i<2){
                    System.out.print("*");
                }else{
                    System.out.print("=");
                }
            }
        }
    }
}