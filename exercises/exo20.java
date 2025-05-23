/* EXO20 : Avec PRINT & SCANNER : 
 * 
 * Vous allez créer un algo de sondage pour des élections, 
 * la candidate Joseline Inutile et le candidat Vincent Escreau pour la mairie de Mulhouse.
 * Vous avez 150 000 votants, donnez le nombre de votant pour Escreau et pour Inutile, et le nombre de vote blanc
 * Si le total des votes n'est pas atteint, les votes manquants seront comptés blanc
 * Si le total de vote est supérieur aux nombres de votants alors il y a une erreur
 * Puis calculez en pourcentage en fonction du nombres de votants ( ceux qui n'ont pas voter blanc)
 * Le score en pourcentage, le gagnant doit avoir plus de 60% sinon il devra y avoir un second tour :
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de gens ont voté pour Joseline Inutile ?
 * 
 * 100 000
 * 
* Combien de gens ont voté pour Vincent Escreau ?
 * 
 * 20 000
 * 
* Vous avez 30 000 d'abstentions, ils seront compté nul
 * 
 * 
 * Joseline Inutile : 66.7%
 * 
 * Vincent Escreau : 33.3%
 * 
 * Joseline Inutile est la nouvelle maire de Mulhouse
 * 
*/

import java.util.Scanner;

public class exo20 {
    public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    String name_1 = "Joseline Inutile";
    String name_2 = "Vincent Escreau";
      
    System.out.println("Combien de gens ont voté pour "+ name_1 +" ?");
    int candidate_1 = sc.nextInt();

    System.out.println("Combien de gens ont voté pour "+ name_2 +" ?");
    int candidate_2 = sc.nextInt();
    
    int total = candidate_1 + candidate_2;
    int abstentions = 150000 - total;
    double result1 = (100 * candidate_1) / total;
    double result2 = (100 * candidate_2) / total;


    if (total < 150000) {

        System.out.println("Vous avez "+ abstentions +" d'abstentions, ils seront compté nuls");
        System.out.println(name_1 +" : "+ String.format("%.2f",result1) +" %");
        System.out.println(name_2 +" : "+ String.format("%.2f",result2) +" %");

        if ((result1 > 60.0) || (result2 > 60.0)) {
            String winner = "";
            if (result1 > result2) {
                winner = name_1;
                } else if (result1 < result2) {
                    winner = name_2;
                }
                System.out.println(winner +" est la nouvelle maire de Mulhouse");
            } else {
                System.out.println("Le gagnant doit avoir plus de 60% donc il aura un second tour !");
            }
        } else { 
        System.out.println("Le total de vote est supérieur aux nombres de votants");
    }
    sc.close();
    }
}