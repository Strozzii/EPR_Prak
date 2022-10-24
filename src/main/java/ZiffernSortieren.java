/**
 *
 * @author stroz
 */
public class ZiffernSortieren {
    
    public static long sortiere(long zahl){
        return zahl < 10 ? zahl
                         : mische(sortiere(zahl / (long) Math.pow(10, stellen(zahl) / 2)),
                                 sortiere(zahl % (long) Math.pow(10, stellen(zahl) / 2)));
    }
    
    public static long mische(long a, long b){
        return (a > 0 || b > 0) ? (a % 10 > b % 10) ? mische(a / 10, b) * 10 + a % 10
                                                    : mische(a, b / 10) * 10 + b % 10
                                : 0;
    }
    
    public static int stellen(long zahl){
        return zahl < 10 ? 1
                         : 1 + stellen(zahl / 10);
    }

    
    public static void main(String[] args) {
        System.out.println(sortiere(42424121));
        System.out.println(sortiere(0));
        System.out.println(sortiere(1));
        System.out.println(sortiere(1234567));
        System.out.println(sortiere(987654321));
        System.out.println(sortiere(9276492));
    }
}
