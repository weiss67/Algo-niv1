import java.util.Scanner;

public class jalon1 {
        public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Indiquez votre âge ?");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Cette personne est majeure (+18 ans)");
        } else if (age <= 18) {
            System.out.println("Cette personne est mineure (-18 ans)");
        } else {
            System.out.println("Veuillez mettre que des chiffres sans point et virgule.");
        }
        sc.close();
    }
}