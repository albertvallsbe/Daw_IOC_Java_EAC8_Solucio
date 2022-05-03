/*
 *Classe que defineix una atracció del parc. Es defineixen pel seu codi, nom, alçada 
 *mínima per accedir-hi i intensitat representada per un enter, intensitat 0, 1, 2, 3, etc.
 */
package installacions;

import principal.Installacio;

/**
 *
 * @author fta
 */
public class Atraccio implements Installacio{
    
    private String codi;
    private String nom;
    private double alcadaMinima;
    private int intensitat;

    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe.
    
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.    
     */

    public Atraccio(String codi, String nom, double alcadaMinima, int intensitat) {
        this.codi = codi;
        this.nom = nom;
        this.alcadaMinima = alcadaMinima;
        this.intensitat = intensitat;
    }

    /*
     TODO Heu d'implementar tots els mètodes accessors possibles.  
     */

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

    public double getAlcadaMinima() {
        return alcadaMinima;
    }

    public void setAlcadaMinima(double alcadaMinima) {
        this.alcadaMinima = alcadaMinima;
    }

    public int getIntensitat() {
        return intensitat;
    }

    public void setIntensitat(int intensitat) {
        this.intensitat = intensitat;
    }
    
    
    /*
    TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova atracció. Les dades a demanar 
       són les que necessita el constructor.
     - També heu de tenir en compte que el nom pot ser una frase, per exemple, La Gran Muntanya.
     
     Retorn: La nova atracció creada creada.
     */
    public static Atraccio addAtraccio() {
        String codi, nom; 
        int intensitat;
        double alcadaMinima;

        System.out.println("\nCodi de l'atracció:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom de l'atracció:");
        nom = DADES.nextLine();
        System.out.println("\nAlçada mínima per accedir a l'atracció:");
        alcadaMinima = DADES.nextDouble();        
        System.out.println("\nIntensitat de l'atracció:");
        intensitat = DADES.nextInt();

        return new Atraccio(codi, nom, alcadaMinima, intensitat) ;
    }
    
    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'atracció actual i
       modificar els atributs corresponents a aquesta atracció.
     - També heu de tenir en compte que el nom pot ser una frase, per exemple, La Gran Muntanya.
     - Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
     
    Retorn: cap
     */
    @Override
    public void updateInstallacio() {
        System.out.println("\nCodi de l'atracció: " + codi);
        System.out.println("\nEntra el nou codi:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom de l'atracció: " + nom);
        System.out.println("\nEntra el nou nom:");
        nom = DADES.nextLine();
        System.out.println("\nAlçada mínima per accedir a l'atracció: " + alcadaMinima);
        System.out.println("\nEntra la nova alçada mínima:");
        alcadaMinima = DADES.nextDouble();
        System.out.println("\nIntensitat de l'atracció: " + intensitat);
        System.out.println("\nEntra la nova intensitat:");
        intensitat = DADES.nextInt();
    }
    
    @Override
    public void showInstallacio() {
        System.out.println("\nLes dades de l'Atracció amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nAlçada mínima: " + alcadaMinima);
        System.out.println("\nIntensitat: " + intensitat);
    }
}