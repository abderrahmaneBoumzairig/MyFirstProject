public class Personne {
    

    // 1a. Créer la classe Personne avec les attributs privés suivants : idPersonne (entier), nom (String) et prénom (String).

private int idPersonne;
private String nom,prenom ;

// 1b jouter un constructeur sans attributs d’entrées.

public Personne(int idPersonne, String nom, String prenom) {
    this.idPersonne = idPersonne;
    this.nom = nom;
    this.prenom = prenom;
}

// 1c. Ajouter les méthodes getters et setters pour tous les attributs.
public int getIdPersonne() {
    return idPersonne;
}
public void setIdPersonne(int idPersonne) {
    this.idPersonne = idPersonne;
}
public String getNom() {
    return nom;
}
public void setNom(String nom) {
    this.nom = nom;
}
public String getPrenom() {
    return prenom;
}
public void setPrenom(String prenom) {
    this.prenom = prenom;
}
// 1d. Redéfinir la méthode toString() pour retourner une chaine de caractères contient tous les informations d’une personne.

@Override
public String toString() {
    return "la personne de id : " + idPersonne + " est " + nom + " " + prenom;
}













}
