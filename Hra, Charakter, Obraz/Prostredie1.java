import fri.shapesge.Obrazok;
/**
 * Write a description of class Prostredie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prostredie1 {
    private Obrazok obraz;
    private int polohaY;
    /**
     * Constructor for objects of class Prostredie
     */
    public Prostredie1(String cestaKSuboru) {
        // initialise instance variables
        this.obraz = new Obrazok(cestaKSuboru);
        this.obraz.zmenPolohu(0, 0);
        this.obraz.zobraz();
    }
    
    public void posun() {
        this.polohaY += 100;
    }
}
