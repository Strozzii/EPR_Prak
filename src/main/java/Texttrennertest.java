public class Texttrennertest {
    public static void main(String[] args) {
        Texttrenner test = new Texttrenner("--xx+-yy--abc--", "+-");

        System.out.println(test.hatNochWoerter());
        System.out.println(test.gibNaechstesWort());
        System.out.println(test.hatNochWoerter());
        System.out.println(test.gibNaechstesWort());
        System.out.println(test.hatNochWoerter());
        System.out.println(test.gibNaechstesWort());
        System.out.println(test.hatNochWoerter());
        System.out.println(test.gibNaechstesWort());
        System.out.println(test.hatNochWoerter());
        System.out.println(test.gibNaechstesWort());
        System.out.println(test.hatNochWoerter());
        
        
        
    }
}
