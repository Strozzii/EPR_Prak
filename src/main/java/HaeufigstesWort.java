/**
 *
 * @author stroz
 */
public class HaeufigstesWort {
    
    public static String gibHaeufigstesWort(String[] liste){
        String output = null;
        int counter1 = 0;
        int counter2 = 0;
        
        for(int i = 0; i < liste.length; i++){
            for(int j = 0; j < liste.length; j++){
                if(liste[i].equals(liste[j])){
                    counter2++;
                }
            }
            if(counter2 > counter1){
                output = liste[i];
                counter1 = counter2;
            }
            counter2 = 0;
        }
        
        
        return output;
    }
    
    public static void main(String[] args) {
        String[] liste1 = {"Test", "Hallo", "Welt", "Hallo", "Welt", "Hallo", "Test", "Test", "Hallo"};
        System.out.println(gibHaeufigstesWort(liste1));
        String[] liste2 = {};
        System.out.println(gibHaeufigstesWort(liste2));
        String[] liste3 = {"Test", "Hallo", "Welt"};
        System.out.println(gibHaeufigstesWort(liste3));
    }
}
