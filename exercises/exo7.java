/* EXO7 : A l'aide de Scanner et Print, créer un questionnaire, "Do you speak english ?", répondre yes ou no, puis retourner le messages suivants 
 * 
 * si FALSE "So learn english !"
 * 
 * Si TRUE "Nice to meet you"
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Do you speak english (Y/N)?
 * 
 * Y (Tapez Y)
 * 
 * "Nice to meet you"
 * 
 * 
 * 
*/

import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        System.out.println("Do you speak english (Y/N)?");
        //Boolean a = sc.nextBoolean();
        String a = sc.nextLine();
        
        //if (a.equals("y") || a.equals("y")) { //fonctionnel
        if (a.equalsIgnoreCase("y")) { // Plus optimisé et cela prends en compte si majuscule ou minuscule
        System.out.println("Nice to meet you");
        } else if (a.equals("n")) {
        System.out.println("So learn english !");
        } else { 
            System.out.println("Imput Y or N !");
        }

        sc.close();
    }
}