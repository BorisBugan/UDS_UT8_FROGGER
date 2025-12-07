import java.util.Random;
/**
 * Write a description of class Mapa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mapa {
    private Random generator;
    private final Prostredie[] prostredia;
    /**
     * Constructor for objects of class Mapa
     */
    public Mapa(int pocetProstredi) {
        // initialise instance variables
        this.generator = new Random();
        this.prostredia = new Prostredie[pocetProstredi];
        
        for (int i = 0; i < this.prostredia.length; i++) {
            if (i == 0) {
                this.prostredia[0] = new Prostredie(TypProstredia.START, 0, 400);
            } else if (i > 0 && i < (this.prostredia.length - 1)) {
                int nahodneCislo = this.generator.nextInt(3);
                this.prostredia[i] = new Prostredie(TypProstredia.values()[nahodneCislo], 0, 400 - 500 * i);                
            } else {
                this.prostredia[i] = new Prostredie(TypProstredia.START, 0, 400 - 500 * (i));
            }
        }
    }
    
    public void zobrazDalsie(Charakter charakter) {
        
    }
    
    public void dajInfo() {
        for (Prostredie x : this.prostredia) {
            System.out.println(x.getPolohaY());
        }
    }
    public void posunMapu(int polohaY) {
        for (Prostredie prostredie : this.prostredia) {
            prostredie.zmenPolohaY(polohaY);
            prostredie.zmenPolohu(polohaY);
        }
    }
}
