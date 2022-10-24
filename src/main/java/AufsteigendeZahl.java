/**
 *
 * @author stroz
 */
public class AufsteigendeZahl {
    
    public static boolean istAufsteigend(int x){
        return x < 10 ? true
                      : (x % 10) > ((x / 10) % 10) ? istAufsteigend(x / 10)
                                                   : false;
    }
    
    public static void main(String[] args) {
        System.out.println(istAufsteigend(4));
        System.out.println(istAufsteigend(1234));
        System.out.println(istAufsteigend(1144478));
        System.out.println(istAufsteigend(1144435));
    }
}
