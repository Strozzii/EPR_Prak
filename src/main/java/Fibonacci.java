/**
 *
 * @author stroz
 */
public class Fibonacci {
    
    public static long fib(int n, int mem1, int mem2){
        return n <= 0 ? mem1
                      : fib(--n, mem2, mem1 + mem2);
    }
    
    public static long fib(int n){
        return fib(n, 0, 1);
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            System.out.println(i + " : " + fib(i));
        }
    }
}
