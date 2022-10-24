/**
 *
 * @author stroz
 */
public class Zahldarstellung {
    
    public static boolean istGueltig(long a, int basis){
        return a < 10 ? a < basis
                      : (a % 10) < basis && istGueltig(a / 10, basis);
                                         
                
    }
    
    public static int toDec(long a, int basis){
        return (int) (a < 10 ? a
                             : a % 10 + (toDec(a / 10, basis)) * basis);
    }
    
    public static long toBase(int dec, int basis){
        return dec < basis ? dec
                           : toBase(dec / basis, basis) * 10 + dec % basis;
    }
    
    
    public static long addiere(long a, long b, int basis){
        return istGueltig(a, basis) && istGueltig(b, basis) ? toBase(toDec(a, basis) + toDec(b, basis) , basis)
                                                    : -1; 
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Testings!");
        System.out.println("------------------------------------");
        System.out.println(istGueltig(10010101,2));
        System.out.println(istGueltig(10021,2));
        System.out.println(istGueltig(176121,8));
        System.out.println(istGueltig(196121,8));
        System.out.println("");
        System.out.println(toDec(1001,2));
        System.out.println(toDec(234,10));
        System.out.println(toDec(1337,8));
        System.out.println("");
        System.out.println(toBase(9, 2));
        System.out.println(toBase(234, 10));
        System.out.println(toBase(735, 8));
        System.out.println("------------------------------------");
        System.out.println("");
        System.out.println(addiere(1001,11,2));
        System.out.println(addiere(11011,1110,2));
        System.out.println(addiere(210,11,2));
        System.out.println(addiere(773,0,8));
        System.out.println(addiere(0,107,8));
        System.out.println(addiere(773,107,8));
        System.out.println(addiere(773,1239,8));
        System.out.println(addiere(950,192,8));
        System.out.println(addiere(9145,882,10));
        System.out.println(addiere(11111111111L,1,2));
        System.out.println(addiere(323,133,4));
    }
}
