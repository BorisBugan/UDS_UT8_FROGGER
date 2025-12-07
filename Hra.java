import fri.shapesge.Manazer;
import fri.shapesge.Obrazok;
import fri.shapesge.BlokTextu;
import java.util.EnumSet;
import fri.shapesge.StylFontu;
/**
 * Trieda, ktorá spúšťa hru. Vytvára manažéra, ktorý sa ma na starosti ovládanie, charaktera a menu. Manažer spravuje túto triedu a charaktera.
 * 
 * @author Boris Bugan
 * @version 1
 */
public class Hra {
    private Manazer manazer;
    private Charakter charakter;
    private Mapa mapa;
    private Obrazok menu;
    private int skore;
    private int posunMapy;
    private BlokTextu ukazovatelSkore;
    /**
     * Constructor for objects of class Hra
     */
    public Hra() {
        // initialise instance variables
        this.mapa = new Mapa(7);
        this.manazer = new Manazer();
        this.charakter = new Charakter(400, 500, Obraz.POSTAVICKA.getCestaKSuboru()); 
        this.menu = new Obrazok(Obraz.MENU.getCestaKSuboru());
        this.menu.zmenPolohu(200, 300);
        this.skore = 0;
        this.posunMapy = 0;
        this.manazer.spravujObjekt(this);
        this.ukazovatelSkore = new BlokTextu("Skore je: " + this.skore);
        this.ukazovatelSkore.zobraz();
        this.ukazovatelSkore.zmenFont(null, EnumSet.noneOf(StylFontu.class), 40);
        this.ukazovatelSkore.posunDole();
    }
    
    /**
     * Posunie charaktera dole o 50px;
     */
    public void posunDole() {
        this.mapa.posunMapu(-100);
        this.posunMapy -= 100;
        this.kontrolujCiel();
    }
    
    /**
     * Posunie charaktera hore o 50px;
     */
    public void posunHore() {
        this.mapa.posunMapu(100);
        this.posunMapy += 100;
        this.kontrolujCiel();
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
        if (this.charakter.getJeAktivny()) {
            this.charakter.setJeAktivny(false);
            this.menu.zobraz();
        } else {
            this.charakter.setJeAktivny(true);
            this.menu.skry();
        }
    }
    
    public void pridajSkore() {
        this.skore += 1;
    }
    
    public void kontrolujCiel() {
        if (this.posunMapy >= 3100) {
            this.pridajSkore();
            
            this.mapa.posunMapu(-this.posunMapy);
            this.posunMapy = 0;
            
            this.ukazovatelSkore.zmenText("Skore je: " + this.skore);
        }
    }
}
