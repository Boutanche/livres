import java.util.ArrayList;
import java.util.List;

/**
 * Auteur d'un Livre
 */
public class Auteur {
    /**
     * Nom de l'Auteur
     */
    private String nom;
    /**
     * Prénom de l'Auteur
     */
    private String prenom;
    /**
     * Liste des livres écrits par l'Auteur
     */
    private List<Livre> livres;

    /**
     * Constructeur de la classe Auteur
     * @param aNom
     * @param aPrenom
     */
    public Auteur(String aNom, String aPrenom){
        nom = aNom;
        prenom = aPrenom;
        livres = new ArrayList<Livre>();
    }

    /**
     * @return nom de l'Auteur
     */
    public String getNom() {
        return nom;
    }

    /**
     * Renseigne le nom de l'Auteur
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Renseigne prénom de l'Auteur
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Renvoie une représentation texte de l'Auteur
     * @return 'Auteur "Nom Prénom"
     */
    @Override
    public String toString() {
        String message = "" ;
        //Si la liste des livres n'est pas renseigné
        if (livres == null){
            message = "Auteur : \"" + this.prenom + " " + this.nom +"\"";
        }
        else {
            String livresString = printLivres(livres);
            message = "Auteur : " + this.prenom + " " + this.nom +" \n" + livresString;
        }
        return message;
    }
    /**
     * @return Liste des livres
     */
    public List<Livre> getLivres() {
        return livres;
    }

    /**
     * Renseigne la liste des livres
     * @param livres
     */
    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }

    /**
     * Ajoute un Livre à la liste des livres de l'Auteur
     * @param aLivre
     */
    public void addLivre(Livre aLivre){
        this.livres.add(aLivre);
    }

    /**
     * Version texte de la liste des livres
     * @param aLivres
     * @return liste des livres en String
     */
    private String printLivres(List<Livre> aLivres){
        String message = "";
        for (Livre livre: aLivres){
            message += "- \"" + livre.getTitre() + "\", (" + livre.getAnneePublication() + ")\n";
        }
        return message;
    }
}
