public class Jouer {
    

// a. Créer la classe Personne avec les attributs privés suivants : idActeur (entier), idFilm (entier), role  (String).

private int idActeur, idFilm;
private String role ;




// b. Ajouter un constructeur sans attributs d’entrées.
public Jouer() {
}
// c. Ajouter un constructeur qui prends tous les attributs en entrée.
public Jouer(int idActeur, int idFilm, String role) {
    this.idActeur = idActeur;
    this.idFilm = idFilm;
    this.role = role;
}
// d. Ajouter les méthodes getters et setters pour tous les attributs.
public int getIdActeur() {
    return idActeur;
}
public void setIdActeur(int idActeur) {
    this.idActeur = idActeur;
}
public int getIdFilm() {
    return idFilm;
}
public void setIdFilm(int idFilm) {
    this.idFilm = idFilm;
}
public String getRole() {
    return role;
}
public void setRole(String role) {
    this.role = role;
}
// e. Redéfinir la méthode toString() pour retourner une chaine de caractères contient tous les informations d’un jouer.
@Override
public String toString() {
    return "l'acteur de l'id : " + idActeur + " joue dans le film d'id " + idFilm + " pour un role de " + role;
}












}
