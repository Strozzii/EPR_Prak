/**
 *
 * @author stroz
 */
public class FelderMischen {
    
    public static int[] mische(int[] feld1, int[] feld2){
        int[] sort = new int[feld1.length + feld2.length];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < feld1.length && j < feld2.length){
            sort[k] = feld1[i] < feld2[j] ? feld1[i++] : feld2[j++];
            k++;
        }
        
        while(i < feld1.length){
            sort[k] = feld1[i++];
            k++;
        }
        
        while(j < feld2.length){
            sort[k] = feld2[j++];
            k++;
        }

        return sort;
        
    }
    
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {2,3,6,9,9,9,9};
        
        int[] z = mische(a,b);
        
        for(int i = 0; i < z.length; i++){
            System.out.print(z[i] + " ");
        }
    }
}
