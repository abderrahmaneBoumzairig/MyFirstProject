public class Film {
    

    // 2a. Créer la classe Personne avec les attributs privés suivants : idFilm (entier), idRealisateur (entier), 
    // titre (String), genre (String) et année (entier).

    private int idFilm ,idRealisateur, annee;
    private String titre , genre ;
    

    // b. Ajouter un constructeur sans attributs d’entrées.
    public Film() {
    }
    // c. Ajouter un constructeur qui prends tous les attributs en entrée.
    public Film(int idFilm, int idRealisateur, int annee, String titre, String genre) {
        this.idFilm = idFilm;
        this.idRealisateur = idRealisateur;
        this.annee = annee;
        this.titre = titre;
        this.genre = genre;
    }
    // d. Ajouter les méthodes getters et setters pour tous les attributs.
    public int getIdFilm() {
        return idFilm;
    }
    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }
    public int getIdRealisateur() {
        return idRealisateur;
    }
    public void setIdRealisateur(int idRealisateur) {
        this.idRealisateur = idRealisateur;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    // e. Redéfinir la méthode toString() pour retourner une chaine de caractères contient tous les informations d’un film.
    @Override
    public String toString() {
        return "le Film de l'idfilm : " + idFilm + " et de idRealisateur " + idRealisateur + " ,est de l'annee" + annee + " , de titre " + titre +  " et du genre " + genre ;
    }
    
    // f. Ajouter la méthode boolean equals(Film f) qui retourne true si l’id de l’objet courant égale a l’id de l’objet f, si non retourne false.

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { // vérifier si l'objet courant est le même que l'objet comparé
            return true;
        }
        if (!(obj instanceof Film)) { // vérifier si l'objet comparé est une instance de la classe Film
            return false;
        }
        Film otherFilm = (Film) obj; // casting de l'objet comparé en une instance de la classe Film
        return this.idFilm == otherFilm.idFilm; // comparer les IDs des deux objets
    }








}
