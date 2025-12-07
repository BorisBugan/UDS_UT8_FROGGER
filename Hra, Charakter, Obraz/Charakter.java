import fri.shapesge.Obrazok;
/**
 * Trieda, ktorá vytváta chraraktera. Pamatá si jeho polohu na hracom poli a či je aktívny. Zobrazuje a presúva obrázok charaktera.
 * 
 * @author Boris Bugan
 * @version 5. 12. 2025
 */
public class Charakter {
    private Obrazok obrazok;
    public boolean jeAktivny;
    public int polohaY;
    public int polohaX;
    /**
     * Konštruktor pre objekty triedy Charakter. Nastavuje polohu na plátne a zobrazuje obrázok charaktera.
     * @param polohaX Poloha podľa súradnice X.
     * @param polohaY Poloha podľa súradnice Y.
     */
    public Charakter(int polohaX, int polohaY, String cestaKSuboru) {
        this.obrazok = new Obrazok(cestaKSuboru);
        this.obrazok.zobraz();
        this.polohaY = polohaY;
        this.polohaX = polohaX;
        this.obrazok.zmenPolohu(polohaX, polohaY);
        
        this.jeAktivny = true; //Pri spustení hry sa postavička može hneď začať pohybovať.
    }
    
    /**
     * Metóda, ktorá zmeni polohu charaktera po vodorovnej osi.
     * @param polohaX Poloha na súradnici X, kde sa ma presunúť.
     */
    public void zmenPolohu(int polohaX) {
        if (this.jeAktivny) {
            this.obrazok.posunVodorovne(polohaX);
            this.polohaX = polohaX;
        }
    }
    
    /**
     * Mení stav aktivity charaktera podľa zadanej hodnoty.
     */
    public void setJeAktivny(boolean aktivny) {
        this.jeAktivny = aktivny;
    }
    
    /**
     * Vracia stav charaktera.
     */
    public boolean getJeAktivny() {
        return this.jeAktivny;
    }
}
