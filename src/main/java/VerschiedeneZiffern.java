/**
 *
 * @author stroz
 */
public class VerschiedeneZiffern {

    public static boolean istEnthalten(int zahl, int ziffer){
        return zahl < 10 ? zahl == ziffer
                         : zahl % 10 == ziffer || istEnthalten(zahl / 10, ziffer);
    }
    
    public static int anzahlZiffern(int zahl, int ziffer){
        return ziffer > 9 ? 0
                          : istEnthalten(zahl, ziffer) ? 1 + anzahlZiffern(zahl, ++ziffer)
                                                       : anzahlZiffern(zahl, ++ziffer);
    }
    
    public static int anzahlZiffern(int zahl){
        return anzahlZiffern(zahl, 0);
    }
    
    public static void main(String[] args) {
        
        
//        System.out.println(istEnthalten(1234, 4));
//        System.out.println(istEnthalten(1234, 2));
//        System.out.println(istEnthalten(1234, 5));
        System.out.println(anzahlZiffern(12345));
        System.out.println(anzahlZiffern(11122));
        System.out.println(anzahlZiffern(101011));
        System.out.println(anzahlZiffern(2733));
    }
}
