/**
 *
 * @author stroz
 */
public class Binaerdarstellung {
    
    public static int gibWertVonBinaer(long b){
        return (int) (b < 10 ? b : 2 * gibWertVonBinaer(b / 10) + (b % 10));
    }
    
    public static void main(String[] args) {
        System.out.println(gibWertVonBinaer(0));
        System.out.println(gibWertVonBinaer(10));
        System.out.println(gibWertVonBinaer(1101));
        System.out.println(gibWertVonBinaer(10001101));
    }
}
