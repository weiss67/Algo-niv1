import java.util.Scanner;

public class jalon2 {

    public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    System.out.println("Donnez le solde pour compte A ?");
    Double sold_a = sc.nextDouble();

    System.out.println("Donnez le solde pour compte B ?");
    Double sold_b = sc.nextDouble();

    System.out.println("Compte A donne combien à compte B ?");
    Double vir = sc.nextDouble();

    System.out.println("Compte A donne "+ vir +" à compte B");
    System.out.println("Alors Compte A a maintenant "+ (sold_a - vir) +" euros sur son compte");
    System.out.println("Compte B a maintenant "+ (sold_b + vir) +" euros sur son compte");

    sc.close();
    }
}