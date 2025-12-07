import fri.shapesge.Obrazok;

/**
 * Trieda zodpovedná za tvorbu jednotlivých prostredí v hre.
 * Každé prostredie má svoj typ, obrázok a vertikálnu polohu.
 * 
 * @author Tomas Vitko
 * @version 1.0
 */
public class Prostredie {
    /** Typ prostredia (napr. les, voda, obloha) */
    private TypProstredia prostredie;
    
    /** Grafický objekt reprezentujúci prostredie */
    private final Obrazok obrazok;
    
    /** Vertikálna poloha prostredia na obrazovke */
    private int polohaY;
    
    /** Flag určujúci, či je prostredie aktívne */
    private boolean jeAktivne;
    
    /**
     * Vytvorí nové prostredie daného typu na určitej pozícii.
     * 
     * @param typ Typ prostredia
     * @param polohaX Horizontálna pozícia obrázku prostredia
     * @param polohaY Vertikálna pozícia obrázku prostredia
     */
    public Prostredie(TypProstredia typ, int polohaX, int polohaY) {
        this.prostredie = typ;
        
        this.obrazok = new Obrazok(typ.getCestaKSuboru());
        this.obrazok.zmenPolohu(polohaX, polohaY);
        this.obrazok.zobraz();
        
        this.polohaY = polohaY;
    }
    
    /**
     * Zmení vertikálnu pozíciu prostredia o zadanú hodnotu.
     * 
     * @param polohaY Hodnota, o ktorú sa má zmeniť vertikálna pozícia
     */
    public void zmenPolohaY(int polohaY) {
        this.polohaY = this.polohaY + polohaY;
    }
    
    /**
     * Vráti aktuálnu vertikálnu pozíciu prostredia.
     * 
     * @return Vertikálna pozícia prostredia
     */
    public int getPolohaY() {
        return this.polohaY;
    }
    
    /**
     * Posunie obrázok prostredia vertikálne o zadanú hodnotu.
     * 
     * @param polohaY Hodnota posunu obrázku
     */
    public void zmenPolohu(int polohaY) {
        this.obrazok.posunZvisle(polohaY);
    }
    
    /**
     * Zobrazí obrázok prostredia.
     */
    public void zobraz() {
        this.obrazok.zobraz();
    }
}
