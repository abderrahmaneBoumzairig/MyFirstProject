public class Entreprise {
    
    // Créer la classe abstraite Entreprise qui a deux attributs privés : nom (String) et adresse (String).
    private String nom , adresse ;
    // a. Ajouter un constructeur qui prends tous les attributs en entrée.
    public Entreprise(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }
    // b. Ajouter les méthodes getters et setters pour tous les attributs.
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }






}
