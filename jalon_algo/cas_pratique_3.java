import java.util.Scanner;

public class cas_pratique_3 {
    

    public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Le véhicule roulait à quelle vitesse ?");
        int speed = sc.nextInt();
        
        System.out.println("Etiez-vous derrière le véhicule en collision ?");
        Boolean collision = sc.nextBoolean();

        System.out.println("Vous avez combien de kilomètre au compteur ?");
        int counter = sc.nextInt();

        System.out.println("A combien d'année date votre dernier contrôle technique (0 si il est moins d'1 an) ?");
        int check = sc.nextInt();

        if ((speed <= 130 && !collision) && ((counter < 150000 && check <= 2) || (counter >= 150000 && check <= 5))) {       
            System.out.println("Au vu des éléments vous êtes bien éligibles pour le remplacement de votre véhicule.");
        } else {
            System.out.println("Vous n'êtes pas éligibles pour le remplacement de véhicule");
        }
        sc.close();
    }


}
