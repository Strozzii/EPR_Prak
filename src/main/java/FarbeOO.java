/**
 *
 * @author stroz
 */
public class FarbeOO {
    
    private int rot;
    private int gruen;
    private int blau;
    
    public FarbeOO(int rot, int gruen, int blau){
        this.rot = rot;
        this.gruen = gruen;
        this.blau = blau;
    }
    
    public FarbeOO gibInvertierteFarbe(){
        return new FarbeOO(255 - rot, 255 - gruen, 255 - blau);
    }
    
    public FarbeOO gibNaechsteFarbe(){
        
        int b = blau == 255 ? 0 : blau + 1;
        int g = blau == 255 ? gruen == 255 ? 0 : gruen + 1 : gruen;
        int r = blau == 255 && gruen == 255 ? rot == 255 ? 0 
                                                         : rot + 1
                                            : rot;
                            
        
        
        FarbeOO farbe = new FarbeOO(r,g,b);
        
        return farbe;
    }
    
    public String gibAlsText(){
        return "(" + this.rot + ", " + this.gruen + ", " + this.blau + ")";
    }
    
    public static void main(String[] args) {
        FarbeOO farbe1 = new FarbeOO(100,100,100);
        FarbeOO farbe2 = new FarbeOO(255,255,255);
        FarbeOO farbe3 = new FarbeOO(0,0,0);
        FarbeOO farbe4 = new FarbeOO(100,100,255);
        
        System.out.println(farbe1.gibInvertierteFarbe().gibAlsText());
        System.out.println(farbe2.gibInvertierteFarbe().gibAlsText());
        System.out.println(farbe3.gibInvertierteFarbe().gibAlsText());
        System.out.println(farbe4.gibInvertierteFarbe().gibAlsText());
        
        System.out.println("");
        
        System.out.println(farbe1.gibNaechsteFarbe().gibAlsText());
        System.out.println(farbe2.gibNaechsteFarbe().gibAlsText());
        System.out.println(farbe3.gibNaechsteFarbe().gibAlsText());
        System.out.println(farbe4.gibNaechsteFarbe().gibAlsText());
    }
    
}
