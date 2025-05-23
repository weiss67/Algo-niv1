/* EXO18 : Avec PRINT & SCANNER : 
 * 
 * 
 * Vous souvenez de l'exercice d'algèbre de Boole de la banque ? Une banque vous accorde un prêt immobilier 
 * si vous répondez aux critères suivants :
 * 
 * condition 1 : Avoir un CDI avec un salaire de plus 3000€
 * 
 * condition 2 : Avoir un apport de 25% de la somme demandé
 * 
 * condition 3 (Si la condition 1 n'est pas rempli ) : Avoir une autre propriété 
 * valant minimum 75% du prêt demandé
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
    * Quel est le montant de votre prêt ?
 * 
 * 150000
 * 
 * Êtes-vous en CDI ?
 * 
 * TRUE
 * 
 * Combien avez-vous d'abord ?
 * 
 * 1500
 * 
 * Vous ne pouvez pas hélas obtenir de prêt !

 * 
*/

import java.util.Scanner;

public class exo18 {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Quel est le montant de votre prêt ?");
      Double ready = sc.nextDouble();

      System.out.println("Êtes-vous en CDI ?");
      Boolean cdi = sc.nextBoolean();

      System.out.println("Combien touchez vous en salaire ?");
      Double salary = sc.nextDouble();

      System.out.println("Combien avez-vous d'abord ?");
      Double solde = sc.nextDouble();
        
      if (cdi && salary >= 3000) {
         System.out.println("Une banque vous accorde un prêt immobilier");
         } else if (solde >= (ready * 0.75)) {
         System.out.println("Une banque vous accorde un prêt immobilier");
         } else {
         System.out.println("Vous ne pouvez pas hélas obtenir de prêt !");
      }
        sc.close();
    }
}


