public class CheckNoPrimeOrNot {
    public static boolean isPrime(int num){
        //corner cases
        if(num == 2){
            return true;
        } 

        for(int i=2;i<num-1;i++){
            if(num % i == 0){//completely dividing
               return false; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(43));
        
    }
    
}
