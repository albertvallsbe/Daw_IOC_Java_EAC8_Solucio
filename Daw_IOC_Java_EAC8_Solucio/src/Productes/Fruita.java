package Productes;

public class Fruita extends Producte {
    private String temporada;

    public Fruita(String nom, String seccio, double preu, String temporada) {
        super(nom, seccio, preu);
        this.temporada = temporada;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }


    public static void imprimirProducte(String nom, String seccio, Double preu, String temporada) {
        

        System.out.println("\nNom:" + nom);
        System.out.println("\nSecció:" + seccio);
        System.out.println("\nPreu:" + preu);
        System.out.println("\nTemporada:" + temporada);
        
    }

}