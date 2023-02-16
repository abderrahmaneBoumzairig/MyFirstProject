public class Projection implements CineInfo {

   
        

    
    // a. Créer la classe Projection implémente CineInfo avec les attributs privés : idCinema (entier), idFilm (entier) et jour (String).

    private int idCinema, idFilm;
    private String jour;


    // b. Ajouter un constructeur qui prends tous les attributs en entrée.
    public Projection(int idCinema, int idFilm, String jour) {
        this.idCinema = idCinema;
        this.idFilm = idFilm;
        this.jour = jour;
    }
    // c. Ajouter les méthodes getter et setter pour les attributs.
    public int getIdCinema() {
        return idCinema;
    }
    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }
    public int getIdFilm() {
        return idFilm;
    }
    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }
    public String getJour() {
        return jour;
    }
    public void setJour(String jour) {
        this.jour = jour;
    }
    // d. Redéfinir la méthode toString() pour retourner une chaine de caractères contient tous les informations d’une Cinéma.
    @Override
    public String toString() {
        return "le cinema d'id : " + idCinema + " , projecte le film d'id :  " + idFilm + ", le :  " + jour;
    }
    // e. Implémenter la méthode afficheInfo() pour afficher (s.o.p) les informations d’un objet de type Projection.


    @Override
    public void afficheInfo() {
        // TODO Auto-generated method stub
        System.out.println("les informations de Projection");
        System.out.println("idCinema : " + idCinema);
        System.out.println("idFilm :  " + idFilm);
        System.out.println("jour :  " + jour);
}
}