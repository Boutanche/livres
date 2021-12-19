/**
 * Livre est un document écrit par un Auteur
 */
public class Livre {
    /**
     * Titre du Livre
     */
    private String titre;
    /**
     * Année de la première publication du Livre
     */
    private Integer anneePublication;
    /**
     * Auteur du Livre
     */
    private Auteur auteur;

    /**
     * Constructeur de la classe Livre
     * @param aTitre
     * @param aAnneePublication
     */
    public Livre(String aTitre, Integer aAnneePublication){
        titre = aTitre;
        anneePublication = aAnneePublication;
        auteur = null;
    }

    /**
     * @return titre du Livre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Renseigne le titre du Livre
     * @param titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return année de publication du Livre
     */
    public Integer getAnneePublication() {
        return anneePublication;
    }

    /**
     * Renseigne année de publication du Livre
     * @param anneePublication
     */
    public void setAnneePublication(Integer anneePublication) {
        this.anneePublication = anneePublication;
    }

    /**
     * @return Auteur du Livre
     */
    public Auteur getAuteur() {
        return auteur;
    }

    /**
     * Renseigne l'Auteur du Livre
     * @param auteur
     */
    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    /**
     * @return représentation texte du Livre
     * 'Livre "Titre du Livre" (Année de Publication)'
     */
    @Override
    public String toString() {
        String message = "";

        //Si auteur est renseigné :
        if (auteur != null){
            message = "Livre = \"" + this.titre + "\" (" + this.auteur.getPrenom() + " " +this.auteur.getNom() +", " + this.anneePublication + ")";
        }
        //Si il n'y a pas d'Auteur au Livre :
        else {
            message = "Livre = \"" + this.titre + "\" (" + this.anneePublication + ")";
        }
        return message;
    }
}
