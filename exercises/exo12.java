/* EXO12 : Avec PRINT & Scanner , vous allez me créer un algo 
 * qui applique une réduction (en pourcentage %) sur un prix (en décimal) donnée :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prix ?
 * 
 * 100.00
 * 
 * Votre réduction (en pourcentage %) ?
 * 
 * 20
 * 
 * Prix après réduction de 20% :
 * 
 * 80.00
 *  
*/

import java.util.Scanner;

public class exo12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Votre prix ?");
        double price = sc.nextDouble();
 
        System.out.println("Votre réduction (en pourcentage %) ?");
        int percentage = sc.nextInt();

        double promo = (percentage * price) / 100;
        double result = Math.round(price - promo);

        System.out.println("Prix "+ result  +"après réduction de "+ percentage +"%");

        sc.close();
    }
}