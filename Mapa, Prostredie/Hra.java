package Frogger_Prvy_doplnene;

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
    private Prekazka prekazka;
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
        this.prekazka = new Prekazka("assets/log.png",1,200,200);
    }
    
    /**
     * Posunie charaktera dole o 50px;
     */
    public void posunDole() {
        this.mapa.posunMapu(-100);
        this.posunMapy -= 100;
        this.kontrolujCiel();
        this.kontrolujKolizie();
        this.prekazka.zmenY(-100);
    }
    
    /**
     * Posunie charaktera hore o 50px;
     */
    public void posunHore() {
        this.mapa.posunMapu(100);
        this.posunMapy += 100;
        this.kontrolujCiel();
        this.kontrolujKolizie();
        this.prekazka.zmenY(100);
    }
    
    /**
     * Posunie charaktera vlavo o 50px;
     */
    public void posunVlavo() {
        this.charakter.zmenPolohu(-50);
        this.kontrolujKolizie();
    }
    
    /**
     * Posunie charaktera vpravo o 50px;
     */
    public void posunVpravo() {
        this.charakter.zmenPolohu(50);
        this.kontrolujKolizie();
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
    /**
     * Navýši skóre o jedna.
     */
    public void pridajSkore() {
        this.skore += 1;
    }
    /**
     * Kontroluje, či sa postava nedostala na koniec mapy, ak áno resetuje hru.
     */
    public void kontrolujCiel() {
        if (this.posunMapy >= 3100) {
            this.pridajSkore();
            
            this.mapa.posunMapu(-this.posunMapy);
            this.posunMapy = 0;
            
            this.ukazovatelSkore.zmenText("Skore je: " + this.skore);
        }
    }
    /**
     * Kontroluje, či hráč nenarazil na prekážku, ak áno, nastavuje skóre na 0
     * a dáva ho na štartovnú pozíciu
     */
    public void kontrolujKolizie() {
        boolean prekrytieX = this.charakter.getPolohaX() < this.prekazka.getX() + 100 && this.charakter.getPolohaX() + 70 > this.prekazka.getX();
        boolean prekrytieY = this.charakter.getPolohaY() < this.prekazka.getY() + 100 && this.charakter.getPolohaY() + 150 > this.prekazka.getY();
        if (prekrytieX && prekrytieY) {
            this.skore = 0;
            this.prekazka.zmenY(-this.posunMapy);
            this.mapa.posunMapu(-this.posunMapy);
            this.posunMapy = 0;
            this.charakter.resetPolohy();
        }
    }
}
