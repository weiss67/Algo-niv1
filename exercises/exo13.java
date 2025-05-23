/* EXO13 : Avec PRINT & SCANNER : Convertir du centimètre (Entier) au mètre (Double)
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une taille en centimètre ?
 * 
 * 170
 * 
 * 170 cm vaut 1.70 m
 * 
 * 
 * 
 * 
 * 
 * 
*/

import java.util.Scanner;

public class exo13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Donner une taille en centimètre ?");
        double size = sc.nextDouble();

        double reconversion = size / 100;
 
        System.out.println(size +" cm vaut "+ reconversion +" m");

        sc.close();
    }
}
