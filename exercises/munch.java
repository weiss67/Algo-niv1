public class munch {
    
    // J’ai une brique de lait (centi-litre) uen quantité x
    // J’ai un baquet de céréal (gramme)
    // J’ai un Bol (centi-litre)
     
     
    // Si ma brique de lait est vide ou si mon paquet de céréal est vide
     
    // Alors je ne peux pas prendre mon petit déjeuner (Message)
     
    // Sinon
     
    // Je peux prendre mon petit déjeuner (Message)
    // J’ajoute le lait et les céréales dans le bol
     
    // Mon petit déjeuner est prêt (Message)
    public static void main(String[] args) {

    int milk = 99;
    int cereales = 100;

    if (milk >= 100 && cereales >= 100) {
        System.out.println("Je peux prendre mon petit déjeuner");
        System.out.println("J’ajoute le lait et les céréales dans le bol");
    } else { 
        System.out.println("Alors je ne peux pas prendre mon petit déjeuner.");
    }
    
    }
}
