/**
 *
 * @author stroz
 */
public class ZahlUmdrehen {
    
    public static long dreheUm(long zahl, long gedrehteZahl){
        return zahl <= 0 ? gedrehteZahl
                         : dreheUm(zahl / 10, gedrehteZahl * 10 + (zahl % 10));
    }
    
    public static long dreheUm(long zahl){
        return dreheUm(zahl, 0);
    }
    
    public static void main(String[] args) {
        System.out.println(dreheUm(0));
        System.out.println(dreheUm(1));
        System.out.println(dreheUm(180));
        System.out.println(dreheUm(155));
        System.out.println(dreheUm(123406789));
    }
}
