/* EXO19 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me créer un convertisseur de secondes au format heures : minutes : secontes
 * 
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de secondes ?
 * 
 * 156000
 * 
 * 156 000 secondes correspond à 43 heures, 20 minutes et 0 seconde
 * 
*/

import java.util.Scanner;

public class exo19 {
    public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
      
    System.out.println("Combien de secondes ?");
    int time = sc.nextInt();

    int minutes = time / 60;
    int secondes = (time - (minutes * 60));
    int hours = minutes / 60;
    minutes = (minutes - (hours * 60));

    if (hours >= 1) {
        System.out.println(time +" secondes correspond à "+ hours +" heures, "+ minutes +" minutes et "+ secondes +" seconde(s)");
        } else if (minutes >= 1) {
            System.out.println(time +" secondes correspond à "+ minutes +" minutes et "+ secondes +" seconde(s)");
        } else {
        System.out.println("Vous ne pouvez pas mettre plus que 999999999 !");
    }
    sc.close();
    }
}