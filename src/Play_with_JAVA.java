
public class Play_with_JAVA {

    public static void main(String[] args) {
        
        
        Masina auto = new Masina("Audi", 300, 420);
        System.out.println(auto.getPavadinimas());
        System.out.println(auto.getSpalva());
        System.out.println(auto.pagreitis);
        System.out.println("--------");
        
        Bolidas formule = new Bolidas("Formule", 400, 500);
        System.out.println(formule.pavadinimas);
        System.out.println(formule.spalva);
        System.out.println(formule.pagreitis);
        System.out.println(formule.svoris);
        System.out.println(formule.getGalia());
        formule.tuning(310);
        System.out.println(formule.getGalia());
        formule.tuning(-40);
        System.out.println(formule.pavadinimas + ": " + formule.getGalia());
        auto.tuning(0);
        System.out.println(auto.getPavadinimas() + ": " + auto.getGalia());

    }
    
}
