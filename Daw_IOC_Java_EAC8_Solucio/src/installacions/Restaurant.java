/*
* Classe que defineix un restaurant del parc d'atraccions. Es defineixen pel seu codi, 
* nom, tipus de menjar que serveix i espectacle que ofereix.
*/
package installacions;

/**
 *
 * @author fta
 */
public class Restaurant extends Servei{

    private String espectacle;

    //Constructor
    public Restaurant(String codi, String nom, String tipusProductes, String espectacle) {
        super(codi, nom, tipusProductes);
        this.espectacle = espectacle;
    }
    
    //Mètodes acessors
    public String getEspectacle() {
        return espectacle;
    }

    public void setEspectacle(String espectacle) {
        this.espectacle = espectacle;
    }

    /*
    TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear un nou restaurant. Les dades a demanar 
       són les que necessita el constructor.
     - També heu de tenir en compte que el nom, el tipus de menjar o l'espectacle poden ser una
       frase, per exemple, Cantó, menjar xinès i teatre d'ombres xineses.
     - Si el restaurant no ofereix cap espectacle, l'usuari no introduirà cap valor.
     
     Retorn: El nou restaurant creat.
     */
    public static Restaurant addRestaurant() {
        String codi, nom, tipus, espectacle;

        System.out.println("\nCodi del restaurant:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom del restaurant:");
        nom = DADES.nextLine();
        System.out.println("\nTipus de menjar que serveix el restaurant:");
        tipus = DADES.nextLine();
        System.out.println("\nEspectacle que ofereix el restaurant:");
        espectacle = DADES.nextLine();

        return new Restaurant(codi, nom, tipus, espectacle);
    }

    @Override
    public void updateInstallacio() {
        super.updateInstallacio();
        System.out.println("\nEspectacle que ofereix el restaurant:"+espectacle);
        System.out.println("\nEntra el nou tipus d'espectacle:");
        espectacle = DADES.nextLine();
    }

    @Override
    public void showInstallacio() {
        super.showInstallacio();
        
        if(espectacle==null||espectacle.isEmpty()){
            System.out.println("\nEl resturant no ofereix cap espectacle");
        }else{
            System.out.println("\nEspectacle: " + espectacle);
        }
    }
}
