/**
 *
 * @author stroz
 */
public class Palindrom {
    
    public static boolean istPalindrom(String text){
        boolean palindrom = true;
        
        for(int i = 0; i < text.length() / 2 && palindrom; i++){
            palindrom = text.charAt(i) == text.charAt(text.length() - 1 - i);
        }
        return palindrom;
    }
    
    public static void main(String[] args){
        System.out.println(istPalindrom("anna"));
        System.out.println(istPalindrom("Anna"));
        System.out.println(istPalindrom("reger"));
        System.out.println(istPalindrom("RegeR"));
        System.out.println(istPalindrom(""));
    }
}
