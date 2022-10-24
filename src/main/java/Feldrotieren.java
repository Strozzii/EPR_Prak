/**
 *
 * @author stroz
 */
public class Feldrotieren {
    
    public static void rotiere(int[] feld, int shift){
        shift = feld.length - shift % feld.length;
        while(shift != 0){
            
            int i;
            int temp;
            temp = feld[0];
            
            for(i = 0; i < feld.length - 1; i++){
                feld[i] = feld[i + 1];
            }
            feld[i] = temp;
            shift--;
        }
    }
    
    public static void gebeAus(int[] feld){
        for(int i = 0; i < feld.length; i++){
            System.out.print(feld[i] + " ");
            
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] feld = {7, 4, 2, 5, 10, -3, 19};
        gebeAus(feld);
        rotiere(feld, 6);
        gebeAus(feld);
    }
}
