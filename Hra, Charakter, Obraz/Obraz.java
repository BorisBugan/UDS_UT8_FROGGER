import fri.shapesge.Obrazok;
/**
 * Enum, ktorý obsahuje cesty k súborom s obrázkami pre postavičku a pre menu.
 * 
 * @author Boris Bugan
 * @version 1
 */
public enum Obraz {
    POSTAVICKA("assets\\charakter.png"),
    MENU("assets\\menu.png");
    
    private String cestaKSuboru;
    
    /**
     * Ukladá cestu súpodru do premennej podľa danej inštancie.
     * @param cestaKSuboru Cesta k súboru s obrázkom.
     */
    private Obraz(String cestaKSuboru) {
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
