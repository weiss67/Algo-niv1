import java.util.Scanner;

public class jalon3 {
        public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Indiquez votre prix HT (Hors Taxe)");
        Double price = sc.nextDouble();
    
        System.out.println("Indiquez votre TVA (en pourcentage)");
        Double taxe = sc.nextDouble();
    
        System.out.println( (price + (price * (taxe / 100))) +" prix TTC (Toute taxe comprise)");
    
        sc.close();
    }
}