
public class Bolidas extends Masina {
      
    public String pavadinimas;
    public char spalva;
    public String pagreitis;
    public int svoris;
    
    
    public Bolidas(String pavadinimas, int galia, int greitis) {
        super(pavadinimas, galia, greitis);
        this.pavadinimas = "Formule";
        this.spalva = 'B';
        this.pagreitis = "2s";
        this.svoris = 1000;
        
    }
    
    public void tuning(int kiek) {
        super.tuning(kiek);
    }
}
