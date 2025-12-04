import fri.shapesge.Manazer;
import fri.shapesge.Obrazok;
/**
 * Trieda, ktorá spúšťa hru. Vytvára manažéra, ktorý sa ma na starosti ovládanie, charaktera a menu. Manažer spravuje túto triedu a charaktera.
 * 
 * @author Boris Bugan
 * @version 1
 */
public class Hra {
    private Manazer manazer;
    private Charakter charakter;
    //private Mapa mapa;
    private Obrazok menu;
    /**
     * Constructor for objects of class Hra
     */
    public Hra() {
        // initialise instance variables
        //this.mapa = new Mapa(7);
        this.manazer = new Manazer();
        this.charakter = new Charakter(400, 500, Obraz.POSTAVICKA.getCestaKSuboru()); 
        this.menu = new Obrazok(Obraz.MENU.getCestaKSuboru());
        this.menu.zmenPolohu(200, 300);
        
        
        this.manazer.spravujObjekt(this);
    }
    
    /**
     * Posunie charaktera dole o 50px;
     */
    public void posunDole() {
        //this.mapa.posunMapu(-100);
    }
    
    /**
     * Posunie charaktera hore o 50px;
     */
    public void posunHore() {
        //this.mapa.posunMapu(100);
    }
    
    /**
     * Posunie charaktera vlavo o 50px;
     */
    public void posunVlavo() {
        this.charakter.zmenPolohu(-50);
    }
    
    /**
     * Posunie charaktera vpravo o 50px;
     */
    public void posunVpravo() {
        this.charakter.zmenPolohu(50);
    }
    
    public void pauza() {
        if(this.charakter.getJeAktivny()) {
            this.charakter.setJeAktivny(false);
            this.menu.zobraz();
        } else {
            this.charakter.setJeAktivny(true);
            this.menu.skry();
        }
    }
}
