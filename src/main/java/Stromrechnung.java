public class Stromrechnung {
    
    public static void main(String[] args) {
        
        int stromVerbrauch = 3536;
        
        float grundpreis1 = 5.75F;
        float grundpreis2 = 9.85F;
        
        float verbrauchspreis1 = 23.49F;
        float verbrauchspreis2 = 22.10F;
        
        
        //Grundpreise von EUR in Cent
        grundpreis1 = grundpreis1 * 100;
        grundpreis2 = grundpreis2 * 100;
        
        //Grundpreise pro Monat auf 12 Monate hochgerechnet
        grundpreis1 = grundpreis1 * 12;
        grundpreis2 = grundpreis2 * 12;
        
        //Kompletten Preis berechnen und von Cent in EUR umgerechnet
        grundpreis1 = (grundpreis1 + verbrauchspreis1 * stromVerbrauch) / 100;
        grundpreis2 = (grundpreis2 + verbrauchspreis2 * stromVerbrauch) / 100;
        
        //Runden auf zwei Nachkommastellen
        grundpreis1 = (int)(grundpreis1 * 100 + 0.5) / 100F;
        grundpreis2 = (int)(grundpreis2 * 100 + 0.5) / 100F;
        
        System.out.println(grundpreis1 < grundpreis2 ? grundpreis1 : grundpreis2);
        
        
        
        
        
        
        
//        System.out.println("Tarif 1 : " + grundpreis1);
//        System.out.println("Tarif 2 : " + grundpreis2);
    }
    
    
}
