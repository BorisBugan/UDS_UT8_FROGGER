
/**
 * Enum, ktorý v sebe drží rôzne druhy prostredí v hre.
 * 
 * @Tomas Vitko
 * @1.0
 */
public enum TypProstredia {
    CESTA("assets\\cesta.png"),
    MENZA("assets\\menza.png"),
    LES("assets\\les.png"),
    START("assets\\internat.png");
    
    private String cestaKSuboru;
    
    /**
     * Ukladá cestu súboru do premennej podľa danej inštancie.
     * @param cestaKSuboru Cesta k súboru s obrázkom.
     */
    TypProstredia(String cestaKSuboru) {
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
