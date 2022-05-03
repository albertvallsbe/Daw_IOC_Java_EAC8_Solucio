package installacions;

import principal.Installacio;

/**
 *
 * @author fta
 */
public abstract class Servei implements Installacio{
    
    private String codi;
    private String nom;
    private String tipus;

    //Mètode constructor
    public Servei(String codi, String nom, String tipus) {
        this.codi = codi;
        this.nom = nom;
        this.tipus = tipus;
    }
    
    //Mètodes accessors
    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
    
    @Override
    public void updateInstallacio() {
        System.out.println("\nCodi del servei: " + codi);
        System.out.println("\nEntra el nou codi:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom del servei: " + nom);
        System.out.println("\nEntra el nou nom:");
        nom = DADES.nextLine();
        System.out.println("\nTipus de productes que trobem en el servei: " + tipus);
        System.out.println("\nEntra el nou tipus de productes:");
        tipus = DADES.nextLine();
    }
    
    @Override
    public void showInstallacio() {
        System.out.println("\nLes dades del servei amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nTipus de productes: " + tipus);
    }
    
    
}
