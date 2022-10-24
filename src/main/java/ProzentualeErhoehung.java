/**
 *
 * @author stroz
 */
public class ProzentualeErhoehung {
    
    public static float erhoeheBetrag(float x, int y){
        return (int)((x + x * (y / 100F)) * 100 + 0.5F) / 100F;
    }
    
    public static void main(String[] args) {
        System.out.println(erhoeheBetrag(12.3456F, 100));
    }
}
