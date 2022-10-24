/**
 *
 * @author stroz
 */
public class Quersumme {
    
    public static int quersumme(int z){
        int qsumme = 0;
        
        while(z > 0){
            qsumme += z % 10;
            z = z / 10;
        }
        
        return qsumme;
    }
    
    public static void main(String[] args) {
        System.out.println(quersumme(1234));
        System.out.println(quersumme(0));
        System.out.println(quersumme(1));
        System.out.println(quersumme(9));
        System.out.println(quersumme(462342));
    }
}
