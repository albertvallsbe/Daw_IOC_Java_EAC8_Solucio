package Productes;
public abstract class Producte implements Oferta{
   
    private String nom;
    private String seccio; //Secció del supermercat a la qual correspon el producte
    private double preu;

    public Producte(String nom, String seccio, double preu) {
        this.nom = nom;
        this.seccio = seccio;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSeccio() {
        return seccio;
    }

    public void setSeccio(String seccio) {
        this.seccio = seccio;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
    
    public void imprimirProducte(){
        System.out.println("Nom: "+nom);
        System.out.println("Secció: "+seccio);
        System.out.println("Preu: "+preu);
    }    
}