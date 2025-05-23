import java.util.Scanner;

public class cas_pratique_1 {
        public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
    
        int bottle = 100;

        System.out.println("Combien avez-vous bu en CL d'eau  ?");
        int drink = sc.nextInt();

        if (drink >= bottle) {
            System.out.println("La bouteille d'eau est vide");
        } else if (drink <= bottle) {
            System.out.println("Il reste encore "+ (bottle - drink) +" cl d'eau dans la bouteille.");
        } else {
            System.out.println("Veuillez mettre que des chiffres sans point et virgule.");
        }
        sc.close();
    }
}