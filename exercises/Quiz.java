/* EXO10 : Créer un quizz de 5 questions, chaque question à deux réponses au choix VRAI OU FAUX, à chaque fois que vous répondez juste à une question vous gagnez un point
 * 
 * Après avoir répondez à vos 5 questions, vous avez le résultat final sur 5.
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Question 1 : 
 * 
 * 
*/

import java.util.Scanner;

public class Quiz {
    int result = 0;  // Le score global

    static Scanner sc = new Scanner(System.in); // Scanner accessible globalement dans la classe

    public static void main(String[] args) {
        Quiz quiz = new Quiz();  // Créer une instance de la classe Quiz

        // Appel des questions
        quiz.quizer("Est-ce que le soleil se lève à l'est ?", true);
        quiz.quizer("Est-ce que 2 + 2 = 5 ?", false);
        quiz.quizer("Est-ce que l’eau bout à 100 degrés ?", true);

        // Affichage du score final
        System.out.println("Votre score final est : " + quiz.result);

        sc.close();
    }

    public void quizer(String query, boolean bool) {
        System.out.println(query + " (true/false)");

        if (sc.hasNextBoolean()) {
            boolean answer = sc.nextBoolean();

            if (answer == bool) {
                System.out.println("Bonne réponse !");
                result++;  // Incrémente le score global
            } else {
                System.out.println("Mauvaise réponse.");
            }
        } else {
            System.out.println("Entrée invalide. Veuillez taper 'true' ou 'false'.");
            sc.next(); // consomme l'entrée invalide pour éviter une boucle infinie
        }

        System.out.println(); // ligne vide pour séparer les questions
    }
}

