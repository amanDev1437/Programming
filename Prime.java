public class Prime {

    public static boolean isPrime(int n){
        int count = 0;

        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>0){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {

        if(isPrime(4)){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }
        
    }
    
}
