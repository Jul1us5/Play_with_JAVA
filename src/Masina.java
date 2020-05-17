
public class Masina {
    
    private String pavadinimas;
    private int galia;
    private int greitis;
    private char spalva;
    public String pagreitis;
    
    public Masina(String pavadinimas, int galia, int greitis) {
        this.pavadinimas = pavadinimas;
        this.galia = galia;
        this.greitis = greitis;
        this.spalva = 'R';
        this.pagreitis = "3.5s";
    }
    
    public String getPavadinimas() {
        return pavadinimas;
    }
    public char getSpalva() {
        return spalva;
    }
    public int getGalia() {
        return galia;
    }
    
    public void tuning(int kiek) {
        this.galia += kiek;
        if(this.galia >= 700) {
            System.out.println("Sprogo! Per daug galios!");
        }
    }
}
