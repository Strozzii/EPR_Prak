/**
 *
 * @author stroz
 */
public class Farbe {
    
    public static int invertiere(int rgb){
        int r = rgb / 1_000_000;
        int g = (rgb / 1_000) % 1_000;
        int b = rgb % 1_000;
        
        r = 255 - r;
        g = 255 - g;
        b = 255 - b;
        
        return r * 1_000_000 + g * 1_000 + b;
    }
    
    public static int gibNaechsteFarbe(int rgb){
        int r = rgb / 1_000_000;
        int g = (rgb / 1_000) % 1_000;
        int b = rgb % 1_000;
        
        b = b == 255 ? 0 : ++b;
        g = b == 0 ? g == 255 ? 0
                              : ++g
                   : g;
        r = b == 0 && g == 0 ? r == 255 ? 0
                                        : ++r
                             : r;
                
        return r * 1_000_000 + g * 1_000 + b;
    }
    
    
    public static void main(String[] args) {
        
        System.out.println(invertiere(0));
        System.out.println(invertiere(10128255));
        
        System.out.println(gibNaechsteFarbe(10_011_012));
        System.out.println(gibNaechsteFarbe(10_128_255));
        System.out.println(gibNaechsteFarbe(255_255));
        System.out.println(gibNaechsteFarbe(255_255_255));
        
    }
}
