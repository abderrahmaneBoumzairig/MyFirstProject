

public class Cinema extends Entreprise implements CineInfo {
    
// a. Créer la classe Cinéma qui hérite la classe Entreprise et implémente CineInfo et qui a un attribut privé supplémentaire : idCinema (entier).

private int idCinema;


// b. Ajouter un constructeur qui prends tous les attributs en entrée.
public Cinema(String nom, String adresse, int idCinema) {
    super(nom, adresse);
    this.idCinema = idCinema;
}
// c. Ajouter les méthodes getter et setter pour l’attribut idCinema.
public int getIdCinema() {
    return idCinema;
}
public void setIdCinema(int idCinema) {
    this.idCinema = idCinema;
}
// d. Redéfinir la méthode toString() pour retourner une chaine de caractères contient tous les  informations d’une Cinéma.
@Override
public String toString() {
    return "le cinema d'id : " + idCinema + " son nom est : " + getNom() + " et son adresse est : " + getAdresse();
}
// e. Implémenter la méthode afficheInfo() pour afficher (s.o.p) les informations d’un objet de type Cinema.
@Override
public void afficheInfo() {
    System.out.println("les informations de Cinema");
    System.out.println("idCinema : " + idCinema);
    System.out.println("Cinema : " + getNom());
    System.out.println("Adresse : " + getAdresse());}
    



    
    



}
