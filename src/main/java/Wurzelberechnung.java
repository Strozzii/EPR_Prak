/**
 *
 * @author stroz
 */
public class Wurzelberechnung {
    
    public static double wurzel(double x, double y, double flaeche, double epsilon){
        return x - y < epsilon ? x
                               : wurzel((x + y) / 2, flaeche / ((x + y) / 2), flaeche, epsilon);
    }
    
    public static double wurzel(double x, double epsilon){
        return wurzel(x, 1, x, epsilon);            
    }
    
    public static void main(String[] args) {
        System.out.println(wurzel(9, 0.0001));
        System.out.println(wurzel(8, 0.0001));
        System.out.println(wurzel(7, 0.0001));
        System.out.println(wurzel(6, 0.0001));
        System.out.println(wurzel(5, 0.0001));
        System.out.println(wurzel(4, 0.0001));
        System.out.println(wurzel(3, 0.0001));
        System.out.println(wurzel(2, 0.0001));
        System.out.println(wurzel(1, 0.0001));
        System.out.println(wurzel(0, 0.0001));
    }
}
