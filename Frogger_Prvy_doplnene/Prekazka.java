import fri.shapesge.Obrazok;
import java.util.Random;

/**
 * Trieda zodpovedná za generovanie prekážok v hre.
 * Každá prekážka má svoj obrázok, pozíciu a rýchlosť pohybu.
 * 
 * @author Tomas Vitko
 * @version 0.1
 */
public class Prekazka {

    /** Grafický objekt prekážky */
    private Obrazok obrazok;
    
    /** Horizontálna pozícia prekážky */
    private int x;
    
    /** Vertikálna pozícia prekážky */
    private int y;
    
    /** Rýchlosť pohybu prekážky po osi X */
    private double rychlost;
    
    /** Šírka herného okna */
    private int sirkaMapy;
    
    /** Výška herného okna */
    private int vyskaMapy;
    
    /** Generátor náhodných čísel pre pozície prekážky */
    private Random random;

    /**
     * Vytvorí novú prekážku s daným obrázkom a rýchlosťou.
     * Inicializuje aj náhodnú počiatočnú pozíciu mimo obrazovky.
     * 
     * @param cestaKObrazku Cesta k PNG súboru obrázku prekážky
     * @param rychlost Rýchlosť pohybu prekážky po osi X
     * @param sirkaMapy Šírka herného okna
     * @param vyskaMapy Výška herného okna
     */
    public Prekazka(String cestaKObrazku, double rychlost, int sirkaMapy, int vyskaMapy) {
        this.rychlost = rychlost;
        this.sirkaMapy = sirkaMapy;
        this.vyskaMapy = vyskaMapy;
        this.random = new Random();

        // Inicializácia počiatočnej náhodnej pozície
        this.x = sirkaMapy + this.random.nextInt(200); 
        this.y = this.random.nextInt(vyskaMapy - 50); 

        this.obrazok = new Obrazok(cestaKObrazku);
        this.obrazok.zobraz();
        this.obrazok.zmenPolohu(this.x, this.y);
    }

    /**
     * Aktualizuje polohu prekážky po osi X podľa jej rýchlosti.
     * Ak prekážka vyjde z obrazovky, resetuje jej pozíciu.
     */
    public void update() {
        // Metóda na pohyb prekážky bude implementovaná
    }

    /**
     * Resetuje pozíciu prekážky na náhodnú pozíciu mimo obrazovky.
     * Používa sa napr. po tom, ako prekážka prešla celú obrazovku.
     */
    private void resetPosition() {
        this.x = this.sirkaMapy + this.random.nextInt(200);
        this.y = this.random.nextInt(this.vyskaMapy);
        this.obrazok.zmenPolohu(this.x, this.y);
    }

    /**
     * Vráti horizontálnu pozíciu prekážky (pre kolízie alebo pohyb).
     * 
     * @return Aktuálna X pozícia prekážky
     */
    public int getX() { 
        return this.x; 
    }

    /**
     * Vráti vertikálnu pozíciu prekážky (pre kolízie alebo pohyb).
     * 
     * @return Aktuálna Y pozícia prekážky
     */
    public int getY() { 
        return this.y; 
    }
    
    /**
     * Nastaví novú hodnotu Y pre prekážku.
     */
    public void zmenY(int y) {
        this.y = this.y + y;
        this.obrazok.zmenPolohu(this.x, this.y);
    }
}