/* EXO3 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition (types entiers) et vérifier si elle est pair ou impaire     
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resultat = 5
 * 
 * resultat est impaire
 * 
 * 
 * 
*/

public class exo3 {
    public static void main(String[] args) {
 
          int a = 2;
          int b = 3;
 
          int result = a - b;
          
          if (result % 2 == 0) {
            System.out.println("La valeur("+ result +") est pair");
            } else {
                System.out.println("La valeur("+ result +") est impair");
            }
 
    }
}