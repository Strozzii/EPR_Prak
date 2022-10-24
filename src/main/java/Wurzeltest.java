/**
 *
 * @author stroz
 */
public class Wurzeltest {
    
    public static boolean istWurzel(int x, long y){
        return x * x == y;
    }
    
    
    public static void main(String[] args) {
        System.out.println(istWurzel(3,9));
        System.out.println(istWurzel(4,9));
        System.out.println(istWurzel(2,4));
        System.out.println(istWurzel(2,8));
        System.out.println(istWurzel(-2,4));
        System.out.println(istWurzel(2,-4));
        System.out.println(istWurzel(-2,-4));
    }
}
