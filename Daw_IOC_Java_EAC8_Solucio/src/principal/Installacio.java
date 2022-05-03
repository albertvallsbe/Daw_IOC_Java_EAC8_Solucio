/*
 * Interfície que implementarà qualsevol instal.lació del parc d'atraccions
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author fta
 */
public interface Installacio {  
    
    public final static Scanner DADES = new Scanner(System.in);
    
    public void updateInstallacio(); 
    public void showInstallacio();     
    
}
