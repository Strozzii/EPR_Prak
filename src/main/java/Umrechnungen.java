/**
 *
 * @author stroz
 */
public class Umrechnungen {
    
    public static void main(String[] args) {
       
        //Aufgabe 1
        
        System.out.println((40 - 32) * 5 / 9);
        System.out.println((41 - 32) * 5 / 9);
        
        //Aufgabe 2
        
        System.out.println(100 * 10000 / 11401);
        System.out.println(10000 * 10000 / 11401);
        
        //Aufgabe 3
        
        System.out.println((5 / 60) * 100 + (5 % 60));
        System.out.println((59 / 60) * 100 + (59 % 60));
        System.out.println((60 / 60) * 100 + (60 % 60));
        System.out.println((61 / 60) * 100 + (61 % 60));
        System.out.println((825 / 60) * 100 + (825 % 60));
        
        //Ohne % - Operator
        System.out.println((5 / 60) * 100 + (5 - 5 / 60 * 60));
        System.out.println((59 / 60) * 100 + (59 - 59 / 60 * 60));
        System.out.println((60 / 60) * 100 + (60 - 60 / 60 * 60));
        System.out.println((61 / 60) * 100 + (61 - 61 / 60 * 60));
        System.out.println((825 / 60) * 100 + (825 - 825 / 60 * 60));

        System.out.println((3 > 2 ? 3 : 5.0));
        System.out.println('a');
        
        System.out.println(2 < 1.5 ? (int)(1.5 * 4) : 5);
        
        char c = 'F';
        int x = 2;
        System.out.println((int) x);
        
        System.out.println((c >= 'a' && c <= 'z' ? (char)(c + 'A' - 'a') : c >= 'A' && c <= 'Z'
                                           ? (char)(c - 'A' + 'a') : (int) c));
        
//        System.out.println("");
//        System.out.println(c >= 'a' && c <= 'z' ? (char)(c + 'A' - 'a') : c);
        
        System.out.println((char)('a' + 'b'));
        
        System.out.println(3 < 2 ? true : 5);
        
    }
}
