/**
 *
 * @author stroz
 */
public class AbsteigendeZahl {
    
    public static boolean istAbsteigend(int z){
        boolean absteigend = true;
        while(absteigend && z > 10){
            absteigend = z % 10 < z / 10 % 10;
                    
            z = z / 10;
        }
        
        return absteigend;
    }
    
    public static void main(String[] args) {
        System.out.println(istAbsteigend(54321));
        System.out.println(istAbsteigend(12345));
        System.out.println(istAbsteigend(3221));
        System.out.println(istAbsteigend(0));
    }
}
