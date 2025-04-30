/* EXO15 : Avec PRINT & SCANNER : Me créer un convertisseur de devise, Euros , Dollars et Livres Sterling
 * 
 * Vous devriez choisir votre devise en entrée et la devise en sortie
 * 
 * Attention on ne peut pas convertir les deux même devise !
 * 
 * EUR : Euros
 * USD : Dollars
 * GBP : Livres Sterling
 * 
 * le lien ci-dessous vous donne la valeur des monnaies : https://www.boursorama.com/bourse/devises
 * 
 * ATTENTION ! : Montant doivent être décimaux , 2 chiffres après la virgule.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Quel est votre monnaie ?
 * 
 * EUR
 * 
 * Quel est votre montant ?
 * 
 * 100.00
 * 
 * Vous voulez la convertir en quelle devise ?
 * 
 * USD
 * 
 * Résultat : 113,82 USD
 * 
 * 
*/

import java.util.Scanner;

public class exo15 {

    public static void main(String[] args) {

        exo15 reconversion = new exo15();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quel est votre monnaie ? (EUR, USD, GBP)");
        String getmoney = sc.nextLine().toUpperCase();

        System.out.println("Quel est votre montant ?");
        double getcash = sc.nextDouble();
        
        sc.nextLine(); 

        System.out.println("Vous voulez la convertir en quelle devise ? (EUR, USD, GBP)");
        String setmoney = sc.nextLine().toUpperCase();

        reconversion.reconversion(getmoney, getcash, setmoney);

        sc.close();
    }

    public void reconversion(String getmoney, double getcash, String setmoney) {
        double eur = 1.0;
        double usd = 1.1410;
        double gpb = 0.8576;
        
        double result = 0;

        if (getmoney.equals("EUR")) {
            result = getcash;
        } else if (getmoney.equals("USD")) {
            result = getcash / usd;
        } else if (getmoney.equals("GBP")) {
            result = getcash / gpb;
        } else {
            System.out.println("Monnaie source inconnue.");
            return;
        }

        if (setmoney.equals("EUR")) {
            System.out.println(getcash + " " + getmoney + " = " + String.format("%.2f",result * eur) + " EUR");
        } else if (setmoney.equals("USD")) {
            System.out.println(getcash + " " + getmoney + " = " + String.format("%.2f",result * usd) + " USD");
        } else if (setmoney.equals("GBP")) {
            System.out.println(getcash + " " + getmoney + " = " + String.format("%.2f",result * gpb) + " GBP");
        } else {
            System.out.println("Monnaie cible inconnue.");
        }
    }
}