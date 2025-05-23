import java.util.Scanner;

public class cas_pratique_2 {
 
    public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Quel est votre salaire BRUT (en euros) ?");
        Double salary = sc.nextDouble();
        
        System.out.println("Votre salaire NET sera de "+ String.format("%.2f",(salary - (salary * 0.23)))   +" euros");

        sc.close();
    }


}
