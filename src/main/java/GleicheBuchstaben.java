/**
 *
 * @author stroz
 */
public class GleicheBuchstaben {
    
    public static String gibLaengstesKonstantesStueck(String text){
        int linkerPointer = 0;
        int rechterPointer = 1;
        String result = "";
        String letztesStueck = "";
        
        for(int i = 1; i < text.length(); i++){
            if(text.charAt(i) == text.charAt(i - 1)){
                rechterPointer = rechterPointer + 1;
            } else {
                if(text.substring(linkerPointer,rechterPointer).length() > result.length()){
                    result = text.substring(linkerPointer, rechterPointer);
                }
                linkerPointer = rechterPointer;
                rechterPointer++;
            }
            
            letztesStueck = text.substring(linkerPointer, rechterPointer);
            
        }
        
        if(letztesStueck.length() > result.length()){
            result = letztesStueck;
        }
        
        return text.length() == 0 ? ""
                                  : text.length() == 1 ? "" + text.charAt(0)
                                                       : result;
    }
    
    public static void main(String[] args) {
        System.out.println(gibLaengstesKonstantesStueck("aabbbbccccc"));
        System.out.println(gibLaengstesKonstantesStueck("abc"));
        System.out.println(gibLaengstesKonstantesStueck("a"));
        System.out.println(gibLaengstesKonstantesStueck(""));
        System.out.println(gibLaengstesKonstantesStueck("aaabbbccccc"));
    }
}
