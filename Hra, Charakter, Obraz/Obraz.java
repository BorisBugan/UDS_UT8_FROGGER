/**
 * Enum, ktorý obsahuje cesty k súborom s obrázkami pre postavičku a pre menu.
 * 
 * @author Boris Bugan
 * @version 5. 12. 2025
 */
public enum Obraz {
    /**
     * Charakter. 
     */
    POSTAVICKA("assets\\charakter.png"),
    
    /**
     * Obrázok, ktorý sa ukáže keď je hra pozastavená.
     */
    MENU("assets\\menu.png");
    
    private String cestaKSuboru;
    
    /**
     * Ukladá cestu súpodru do premennej podľa danej inštancie.
     * @param cestaKSuboru Cesta k súboru s obrázkom.
     */
    Obraz(String cestaKSuboru) {
        this.cestaKSuboru = cestaKSuboru;
    }
    
    
    /**
     * Vráti cestu k súboru danej podľa danej inštancie.
     * @return Cestu k súboru s obrázkom.
     */
    public String getCestaKSuboru() {
        return this.cestaKSuboru;
    }
}
