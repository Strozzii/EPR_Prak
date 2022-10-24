/**
 *
 * @author stroz
 */
public class FibonacciIterativ {
    
    public static long fib(int z){
        
        int m = 0;
        int n = 1;
        int s;
        
        for(int i = 2; i < z + 1; i++){
            s = n;
            n = m + n;
            m = s;
            
        }
        
        return z == 0 ? 0 : n;
        
    }
    
    public static void main(String[] args) {
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(20));
    }
}
