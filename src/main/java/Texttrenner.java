public class Texttrenner {
    
    String text;
    String zeichen;
    int zeiger;
    boolean istTrenner;
    
    public Texttrenner(String text, String zeichen){
        this.zeichen = zeichen;
        this.text = text;
        this.zeiger = 0;
        
        istTrenner = true;
        
        
        for(int i = 0; i < text.length() && istTrenner; i++){
            istTrenner = zeichen.contains("" + text.charAt(i));
            zeiger = i;
            

        }
        System.out.println("Zeiger zeigt auf: " + zeiger);
    }
    
    public boolean hatNochWoerter(){
        
        return !istTrenner && zeiger < text.length();
    }
    
    public String gibNaechstesWort(){
        String ausgabe = null;
        System.out.println("Zeiger: " + zeiger);
        
        int i;
        for(i = zeiger; i < text.length() && !istTrenner; i++){
            istTrenner = zeichen.contains("" + text.charAt(i));
            ausgabe = i == text.length() - 1 ? text.substring(zeiger, i + 1) : text.substring(zeiger, i);
            
            
        }

        zeiger = i;
        
        for(i = zeiger; i < text.length() && istTrenner; i++){
            istTrenner = zeichen.contains("" + text.charAt(i));
            zeiger = i;

        }
        
        
        
        return ausgabe;
        
    }
    
    
}
