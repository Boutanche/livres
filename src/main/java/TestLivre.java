/**
 * Classe pour tester les Livres et les Auteurs
 */
public class TestLivre {
    /**
     * Point d'entrée du test
     * @param args
     */
    public static void main(String[] args) {
        Livre livre1 = new Livre("Au bonheur des dames", 1883);
        Livre livre2 = new Livre("La bête humaine", 1890);
        Auteur auteur1 = new Auteur("Zola", "Emile");

        //Ensemble des tests sur les méthodes toString : Exercice 1
        System.out.println("\n--- Test numéro 1 ---");
        System.out.println(livre1.toString());
        System.out.println(livre2.toString());
        System.out.println(auteur1.toString());

        //Liens Livre-Auteur : Exercice 2
        livre1.setAuteur(auteur1);
        System.out.println("\n--- Test numéro 2 ---");
        System.out.println(livre1);

        //Liens Auteur-Livre : Exercice 3
        auteur1.addLivre(livre1);
        auteur1.addLivre(livre2);
        System.out.println("\n--- Test numéro 3 ---");
        System.out.println(auteur1);
    }
}
