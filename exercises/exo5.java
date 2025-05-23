/* EXO5 : A l'aide de Scanner et Print, créer une équation  A multiplier par B diviser C (tous types entiers) , récupérer le résultat et vérifier si elle inférieur ou supérieur à 10
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * equation = (EQUATION)
 * 
 * equation = 15
 * 
 * 
 * equation est superieur
 * 
*/
import java.util.Scanner;


public class exo5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        System.out.println("Entrez la valeur A");
        int a = sc.nextInt();
        System.out.println("Entrez la valeur B");
        int b = sc.nextInt();

        int result1 = a * b;
        System.out.println(a +" multiplisé par "+ b +" donne " + result1);

        System.out.println("Entrez la valeur C");
        int c = sc.nextInt();
        int result2 = result1 / c;
        System.out.println(result1 +" divisé par "+ c +" est " + result2);

            
          if (result2 > 10)
            System.out.println("La valeur("+ result2 +") est supérieur");
            else
            System.out.println("La valeur("+ result2 +") est inférieur");

      sc.close();
    }
}