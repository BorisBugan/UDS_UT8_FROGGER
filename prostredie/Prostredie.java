
/**
 * Trieda na vytvorenie herného prostredia
 * obsahuje 4 rôzne mapy, na ktorých sa bude Frogg pohybovať
 * @Tomáš Vitko 
 * @0.1
 */
public class Prostredie {
    /**
     * Constructor for objects of class Prostredie
     */
    private Policko[][] hraciaPlocha;
    private int sirka;
    private int vyska;
    public Prostredie(int vyska, int sirka) {
        this.vyska = vyska;
        this.sirka = sirka;
        
        hraciaPlocha = new Policko [vyska][sirka];
        // naplnit default polickami
        for (int i = 0; i < vyska; i++) {
            for (int j = 0; j < sirka; j++) {
                hraciaPlocha[i][j] = new Policko(20,20,20);
                //DOPLNIT LOGIKU KDE SA TVORIA POLICKA
            }
        }
    }
    
    public void urobPStart() {
    }
    
    public void urobPCiel() {
    }
    
    public void urobPCesta() {
    }
    
    public void urobPLes() {
    }
    
    public void urobPSkola() {
    }
    
    public void urobPMenza() {
    }
}
