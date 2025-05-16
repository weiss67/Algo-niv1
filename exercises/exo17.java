/* EXO17 : Avec PRINT & SCANNER : 
 * 
 * Créer un algo qui calcule les dépenses moyenne (en euros, en France) en carburant d'une voiture en fonction 
 * du type de carburant sur une distance en km. 
 * 
 * On consomme 6.5l / 100km pour l'essence
 * On consomme 5.5l / 100km pour le gazole
 * 
 * Les prix des carburants sont sur ce lien : https://carbu.com/france/prixmoyens
 * 
 * carburant par id
 * Gazole (B7) = 0
 * Sans Plomb 95 = 1
 * Sans Plomb 98 (E5) = 2
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est le type de votre carburant ?
 * 
 * 0
 * 
 * Vous avez choisi : Gazole 
 * Quel est la distance à parcourir (en km) ?
 * 
 * 150
 * 
 * Pour 150 km, vous allez dépenser en moyenne 13.99€
 * 
 * /!\ ATTENTION : Le résultat doit être en décimal 2 chiffres après la virgules
 * 
*/

import java.util.Scanner;

public class exo17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quel est le type de votre carburant ? (Gazole (B7) = 0/ Sans Plomb 95 = 1/ Sans Plomb 98 (E5) = 2)");
        int type = sc.nextInt();

        double fuel = 0;
        double used = 0;

        if (type == 0) {
            fuel = 1.588;
            used = 0.06;
            System.out.println("Vous avez choisi le gazole (B7).");
        }
        if (type == 1) {
            fuel = 1.700;
            used = 0.07;
            System.out.println("Vous avez choisi le Sans Plomb 95.");
        }
        if (type == 2) {
            fuel = 1.794 ;
            used = 0.0775;
            System.out.println("Vous avez choisi le Sans Plomb 98 (E5).");
        }

        System.out.println("Quel est la distance à parcourir (en km) ?");
        double trajet = sc.nextDouble();
        
        sc.nextLine();
        
        double total = (used * trajet) * fuel;
        System.out.println("Pour "+ trajet +" km, vous allez dépenser en moyenne " + String.format("%.2f",total) + " euros");

        sc.close();
    }
}

// optimisé par IA
// import java.util.Scanner;

// public class exo17 {

//     enum Carburant {
//         GAZOLE("Gazole (B7)", 1.588, 0.06),
//         SP95("Sans Plomb 95", 1.700, 0.07),
//         SP98("Sans Plomb 98 (E5)", 1.794, 0.0775);

//         String nom;
//         double prix;
//         double conso;

//         Carburant(String nom, double prix, double conso) {
//             this.nom = nom;
//             this.prix = prix;
//             this.conso = conso;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Quel est le type de votre carburant ?\n" +
//                 "0 - " + Carburant.GAZOLE.nom + "\n" +
//                 "1 - " + Carburant.SP95.nom + "\n" +
//                 "2 - " + Carburant.SP98.nom);
//         int type = sc.nextInt();

//         if (type < 0 || type >= Carburant.values().length) {
//             System.out.println("Type de carburant invalide.");
//             sc.close();
//             return;
//         }

//         Carburant carburant = Carburant.values()[type];
//         System.out.println("Vous avez choisi le " + carburant.nom + ".");

//         System.out.println("Quelle est la distance à parcourir (en km) ?");
//         double trajet = sc.nextDouble();

//         double total = (carburant.conso * trajet) * carburant.prix;
//         System.out.printf("Pour %.2f km, vous allez dépenser en moyenne %.2f euros%n", trajet, total);

//         sc.close();
//     }
// }