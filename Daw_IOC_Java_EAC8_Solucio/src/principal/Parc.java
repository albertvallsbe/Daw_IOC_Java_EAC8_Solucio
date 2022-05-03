/*
 * Classe que defineix un parc d'atraccions. Un parc d'atraccions es defineix pel seu nom
 * que l'identifica (no hi ha dos parcs amb el mateix nom), adreça, un array d'atraccions, 
 * un array de botigues i un array de restaurants.
 */
package principal;

import installacions.Atraccio;
import installacions.Restaurant;
import installacions.Botiga;

/**
 *
 * @author fta
 */
public class Parc implements Installacio{

    private String nom;
    private String adreca;
    private Installacio[] installacions = new Installacio[300];
    private int pInstallacions = 0; //Primera posició buida de l'array d'instal.lacions

    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe menys els arrays.
    
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres.
     */
    public Parc(String nom, String adreca) {
        this.nom = nom;
        this.adreca = adreca;
    }

    /*
     TODO Heu d'implementar tots els mètodes accessors possibles.
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public Installacio[] getInstallacions() {
        return installacions;
    }

    public void setInstallacions(Installacio[] installacions) {
        this.installacions = installacions;
    }

    public int getpInstallacions() {
        return pInstallacions;
    }

    public void setpInstallacions() {
        this.pInstallacions++;
    }


    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear un nou parc. Les dades
     a demanar són les que passem per paràmetre en el constructor.
     - També heu de tenir en compte que el nom i l'adreça, poden ser una frase, per exemple,
     Parc Viatger o C/ Oceania, 15.
    
     Retorn: El nou taller creat.
     */
    public static Parc addParc() {

        String nom, adreca;

        System.out.println("\nNom del parc:");
        nom = DADES.nextLine();
        System.out.println("\nAdreça del parc:");
        adreca = DADES.nextLine();

        return new Parc(nom, adreca);
    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades del parc actual i
       modificar els atributs corresponents d'aquest parc. Els únics atributs que
       modificarem són els que hem inicialitzat en el constructor amb els paràmetres passats.
     - També heu de tenir en compte que el nom i l'adreça, poden ser una frase, per exemple,
     Parc Viatger o C/ Oceania, 15.
     - Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
     
    Retorn: cap
     */
    @Override
    public void updateInstallacio() {
        System.out.println("\nNom del parc: " + nom);
        System.out.println("\nEntra el nou nom:");
        nom = DADES.nextLine();
        System.out.println("\nAdreça del parc: " + adreca);
        System.out.println("\nEntra la nova adreça:");
        adreca = DADES.nextLine();
    }

    @Override
    public void showInstallacio() {
        System.out.println("\nL'adreça del parc " + nom + " és " + adreca);
    }

    /*
     ATRACCIÓ
     */
 /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Afegeix una nova atracció a l'array d'atraccions del parc actual si aquesta no existeix. 
       Per afegir-la heu de fer servir el mètode de la classe Atraccio escaient i per comprovar la seva 
       existència el mètode d'aquesta classe que ens ajuda en aquesta tasca.
     - Actualitza la posició de l'array d'atraccions si s'afegeix l'atracció.
     - Mostra el missatge "L'atracció ja existeix" si no s'ha afegit l'atracció.
    
     Retorn: cap
     */
    public void addAtraccio() {

        Atraccio novaAtraccio = Atraccio.addAtraccio();

        if (selectInstallacio(1,novaAtraccio.getCodi()) == -1) {
            installacions[pInstallacions] = novaAtraccio;
            pInstallacions++;
        } else {
            System.out.println("\nL'atracció ja existeix");
        }
    }


    /*
     BOTIGA
     */
 /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Afegeix una nova botiga a l'array de botigues del parc actual si aquesta no existeix. 
       Per afegir-la heu de fer servir el mètode de la classe Botiga escaient i per comprovar la seva 
       existència el mètode d'aquesta classe que ens ajuda en aquesta tasca.
     - Actualitza la posició de l'array de botigues si s'afegeix la botiga.
     - Mostra el missatge "La botiga ja existeix" si no s'ha afegit la botiga.
    
     Retorn: cap
     */
    public void addBotiga() {

        Botiga novaBotiga = Botiga.addBotiga();

        if (selectInstallacio(1,novaBotiga.getCodi()) == -1) {
            installacions[pInstallacions] = novaBotiga;
            pInstallacions++;
        } else {
            System.out.println("\nLa botiga ja existeix");
        }
    }
    

    /*
     RESTAURANT
     */
 /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Afegeix un nou restaurant a l'array de restaurants del parc actual si aquest no existeix. 
       Per afegir-lo heu de fer servir el mètode de la classe Restaurant escaient i per comprovar la seva 
       existència el mètode d'aquesta classe que ens ajuda en aquesta tasca.
     - Actualitza la posició de l'array de restaurants si s'afegeix el restaurant.
     - Mostra el missatge "El restaurant ja existeix" si no s'ha afegit el restaurant.
    
     Retorn: cap
     */
    public void addRestaurant() {
        Restaurant nouRestaurant = Restaurant.addRestaurant();

        if (selectInstallacio(1,nouRestaurant.getCodi()) == -1) {
            installacions[pInstallacions] = nouRestaurant;
            pInstallacions++;
        } else {
            System.out.println("\nEl restaurant ja existeix");
        }

    }
    
    public int selectInstallacio(int tipusInstallacio, String codi) {

        if (codi == null) {
            //Demanem quin tipus d'instal.lació vol seleccionar i el seu codi
            switch (tipusInstallacio) {
                case 1:
                    System.out.println("Codi de l'atracció?:");
                    break;
                case 2:
                    System.out.println("Codi de la botiga?:");
                    break;
                case 3:
                    System.out.println("Codi del restaurant?:");
                    break;
            }

            codi = DADES.next();
        }

        int posInstallacio = -1; //Posició que ocupa la instal.lació seleccionada dins l'array d'instal.lacions del parc

        //Seleccionem la posició que ocupa la instal.lació dins l'array d'instal.lacions del parc
        for (int i = 0; i < pInstallacions; i++) {
            if (installacions[i] instanceof Atraccio && tipusInstallacio == 1) {
                if (((Atraccio) installacions[i]).getCodi().equals(codi)) {
                    return i;
                }
            } else if (installacions[i] instanceof Botiga && tipusInstallacio == 2) {
                if (((Botiga) installacions[i]).getCodi().equals(codi)) {
                    return i;
                }
            } else if (installacions[i] instanceof Restaurant && tipusInstallacio == 3) {
                if (((Restaurant) installacions[i]).getCodi().equals(codi)) {
                    return i;
                }
            }
        }

        return posInstallacio;
    }
}
