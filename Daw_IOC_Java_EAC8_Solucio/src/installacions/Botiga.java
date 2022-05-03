/*
* Classe que defineix una botiga del parc d'atraccions. Es defineixen pel seu codi, 
* nom i tipus de productes que podem trobar.
 */
package installacions;

/**
 *
 * @author fta
 */
public class Botiga extends Servei { 

    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe.
    
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres.
     */

    public Botiga(String codi, String nom, String tipusProductes) {
        super(codi, nom, tipusProductes);
    }

    
    /*
    TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova botiga. Les dades a demanar 
       són les que necessita el constructor.
     - També heu de tenir en compte que el nom o el tipus de producte poden ser una frase, per exemple, 
       Les Antípodes o artesania australiana.
     
     Retorn: La nova botiga creada.
     */
    public static Botiga addBotiga() {
        String codi, nom, tipus;

        System.out.println("\nCodi de la botiga:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom de la botiga:");
        nom = DADES.nextLine();
        System.out.println("\nTipus de productes que trobem en la botiga:");
        tipus = DADES.nextLine(); 

        return new Botiga(codi, nom, tipus);
    }
   
}
