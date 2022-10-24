/**
 *
 * @author stroz
 */
public class Reiskoerner {
    
    /**
     * Das Programm soll die Anzahl der Reiskoerner 7-mal um einen Prozentsatz
     * pErhoehung erhoehen. Am Ende soll noch die Summe aller Iterationen
     * angezeigt werden.
     * 
     * @param args 
     */
    
    public static void main(String[] args) {
        
        int reis = 10;
        int pErhoehung = 0;
        int summe;
        
        summe = reis;
        System.out.println(reis);
        
        reis = reis + (reis * pErhoehung / 100);
        System.out.println(reis);
        summe = summe + reis;
        
        reis = reis + (reis * pErhoehung / 100);
        System.out.println(reis);
        summe = summe + reis;
        
        reis = reis + (reis * pErhoehung / 100);
        System.out.println(reis);
        summe = summe + reis;
        
        reis = reis + (reis * pErhoehung / 100);
        System.out.println(reis);
        summe = summe + reis;
        
        reis = reis + (reis * pErhoehung / 100);
        System.out.println(reis);
        summe = summe + reis;
        
        reis = reis + (reis * pErhoehung / 100);
        System.out.println(reis);
        summe = summe + reis;
        
        reis = reis + (reis * pErhoehung / 100);
        System.out.println(reis);
        summe = summe + reis;
        
        System.out.println(summe);
        
        
    }
}
