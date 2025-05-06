/* EXO11 : Avec PRINT & Scanner , vous allez simuler un distributeur de banque :
 * 
 * Vous avez 3000€ sur votre compte, créer un algo qui retire un montant sur votre compte banquaire
 * votre solde ne peut pas être négatif
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, combien voulez-vous retirer ?
 * 
 * 3500
 * 
 * Opération refusée, fond insuffissant !
 * 
 * 
*/

import java.util.Scanner;

public class exo11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int solde = 3000;
 
        System.out.println("Votre solde est à "+ solde);
        System.out.println("Bonjour, combien voulez-vous retirer ?");

        int debit = sc.nextInt();

        if (solde >= debit) {
            //int newsolde = solde - debit;
            solde -= debit;
            //System.out.println("Votre nouveau solde est à "+ newsolde);
            System.out.println("Votre nouveau solde est à "+ solde);
        } else {
            System.out.println("Opération refusée, fond insuffissant !");
        }
        sc.close();
    }
}
