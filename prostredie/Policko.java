import fri.shapesge.Stvorec;
/**
 * Vytvorí 1 políčko z mapy, ktoré sa ďalej používa v Prostredí.
 * 
 * @Tomáš Vitko 
 * @0.1
 */
public class Policko {
    /**
     * Constructor for objects of class Políčko
     */
    private Stvorec stvorec;
    //private Frogg frogg;
    //private Prekazka prekazka;
    public Policko(int x, int y, int velkost) {
        this.stvorec = new Stvorec();
        this.stvorec.zmenPolohu(x, y);
        this.stvorec.zmenStranu(velkost);
    }
    /**
     
    public void priradPrekazku(Prekazka prekazka){
        this.prekazka = prekazka;
    }
    public void priradFrogg(Frogg frogg){
        this.frogg = frogg ;
    }
    **/
}
