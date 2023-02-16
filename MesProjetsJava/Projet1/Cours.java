public class Cours{

    public Cours(int idCours, String nomCours, int nombreHeur) {
        this.idCours = idCours;
        this.nomCours = nomCours;
        this.nombreHeur = nombreHeur;
    }

    private int idCours;
    private String nomCours;
    private int nombreHeur;
    public int getIdCours() {
        return idCours;
    }
    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }
    public String getNomCours() {
        return nomCours;
    }
    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }
    public int getNombreHeur() {
        return nombreHeur;
    }
    public void setNombreHeur(int nombreHeur) {
        this.nombreHeur = nombreHeur;
    }
    

}
