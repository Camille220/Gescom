package metier;

import java.util.*;

public class Client {

    /* propriétés privées */
    private int idClient;
    private String raisonSociale;
    private Categorie uneCategorie;
    private List <Commande> lesCommandes;

    /* getters et setters */

    public int getIdClient() {
        return idClient;
    }
    public String getRaisonSociale(){
        return raisonSociale;
    }

    public Categorie getUneCategorie() {
        return uneCategorie;
    }

    public List<Commande> getLesCommandes() {
        return lesCommandes;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    public void setRaisonSociale(String raisonSociale){
        this.raisonSociale=raisonSociale;
    }
    public void setUneCategorie(Categorie uneCategorie){
        this.uneCategorie=uneCategorie;
    }

    public void setLesCommandes(List<Commande> lesCommandes) {
        this.lesCommandes = lesCommandes;
    }

    public Client(int idClient, String raisonSociale, Categorie uneCategorie) {
        /* Affectations */
    }

    /**
     * Ajoute une commande à la liste des commandes
     * du client. Prendre la précaution de vérifier
     * que la liste a bien été instanciée
     * @param uneCommande 
     */
    public void ajouterCommande(Commande uneCommande) {
        if (getLesCommandes() == null){
            setLesCommandes(new ArrayList<Commande>());
        }
        if (!getLesCommandes().contains(uneCommande)) {
            this.lesCommandes.add(uneCommande);
        }
    }

    /**
     * Affecte la somme des valorisations des commandes
     * au CA du client. Prendre la précaution de 
     * l'initialiser avant de commencer
     */
    public void cumulCA() {
        /* A compléter */
    }

    /**
     * Recherche une commande sur son numéro en 
     * parcourant la liste des commandes, Retourne
     * une Commande si trouvée, sinon retourne null
     * @param idCommande
     * @return Commande
     */
    public Commande getCommandeById(int idCommande) {
        /* A compléter */
        for (Commande commande : lesCommandes) {
            if (commande.getIdCommande() == idCommande) {
                return commande;
            }
        }
        return null;
    }

    /**
     * Retire une commande la liste des commandes.
     * Remarque : en supprimant une commande on supprime
     * aussi ses lignes (Composition)
     * @param uneCommande 
     */
    public void supprimerCommande(Commande uneCommande) {
       /* A compléter */
    }


}
