import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre la valeur A");
        int a = sc.nextInt();
        System.out.println("Entre la valeur B");
        int b = sc.nextInt();

        int result = a + b;
        
        if (result > 10) {
        System.out.println("La valeur("+ result +") est supérieur à 10");
        } else {
            System.out.println("La valeur("+ result +") n'est pas supérieur à 10");
        }
        
        sc.close();
    }
}