import fri.shapesge.Obrazok;

public class Charakter {
    private Obrazok obrazok;
    public boolean jeAktivny;
    public int polohaY;
    public int polohaX;
    public Charakter(int polohaX, int polohaY, String cestaKSuboru) {
        this.obrazok = new Obrazok(cestaKSuboru);
        this.obrazok.zobraz();
        this.polohaY = polohaY;
        this.polohaX = polohaX;
        this.obrazok.zmenPolohu(polohaX, polohaY);
        
        this.jeAktivny = true; //Pri spustení hry sa postavička može hneď začať pohybovať.
    }
    
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
    public void setPolohaY(int posun) {
        this.polohaY += posun;
    }
    public int getPolohaY() {
        return 5;
    }
}
