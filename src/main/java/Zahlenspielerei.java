/**
 *
 * @author stroz
 */
public class Zahlenspielerei {
    
    public static long verkette(long a, long b){
        return b < 10 ? a * 10 + b
                      : 10 * verkette(a, b / 10) + b % 10;
    }
    
    public static boolean enthaelt(long a, int b){
        return a < 10 ? a == b
                      : enthaelt(a % 10, b) || enthaelt(a / 10, b);
    }
    
    public static int gibAnzahl(long a, int b){
        return a < 10 ? a == b ? 1
                               : 0
                      : gibAnzahl(a % 10, b) + gibAnzahl(a / 10, b);
    }
    
    public static long filter(long a, int b){
        return a < 10 ? a == b ? 0
                               : a
                      : a % 10 == b ? filter(a / 10, b)
                                    : filter(a / 10, b) * 10 + a % 10;
    }
    
    public static void main(String[] args) {
        System.out.println("Verkette - Methode:\n");
        System.out.println(verkette(4711, 1));
        System.out.println(verkette(521, 0));
        System.out.println(verkette(521, 1320));
        System.out.println(verkette(0, 521));
        System.out.println(verkette(0, 0));
        System.out.println("");
        System.out.println("---------------------------\n");
        System.out.println("Enthaelt - Methode:\n");
        System.out.println(enthaelt(4711, 1));
        System.out.println(enthaelt(4711, 2));
        System.out.println(enthaelt(789, 9));
        System.out.println(enthaelt(0, 0));
        System.out.println("");
        System.out.println("---------------------------\n");
        System.out.println("GibAnzahl - Methode:\n");
        System.out.println(gibAnzahl(4711, 1));
        System.out.println(gibAnzahl(4711, 2));
        System.out.println(gibAnzahl(789, 9));
        System.out.println(gibAnzahl(0, 0));
        System.out.println("");
        System.out.println("---------------------------\n");
        System.out.println("Filter - Methode:\n");
        System.out.println(filter(1332, 3));
        System.out.println(filter(3333, 3));
        System.out.println(filter(1332, 4));
        System.out.println(filter(1000, 0));
        System.out.println(filter(1, 1));
        System.out.println(filter(0, 0));
        System.out.println(filter(0, 5));
        
        
    }
}
