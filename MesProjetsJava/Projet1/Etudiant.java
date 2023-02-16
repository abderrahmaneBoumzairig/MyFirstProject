public class Etudiant extends Personne implements MethodesPersonne {

    int idEtudiant;
    int nombreCours;
    Cours [] tab ; // les cours de l'etudiant



    @Override
    public void marcher() {
        System.out.println(super.getNom() + "marche");
        
    }

    @Override
    public void marcher(int n) {
        System.out.println(super.getNom()+ n + "pas");
        
    }
    
    public Etudiant ( int idEtudiant ,String nom, String prenom, int age ,String adresse , int nombreCours ){
        super ( nom, prenom,  age , adresse);
        this.idEtudiant = idEtudiant;
        this.nombreCours= nombreCours;
        tab = new Cours[nombreCours];
    }

    
    boolean ajouterCours (Cours c , int i){
        if (i>=nombreCours){
              tab[i] = c; 
        return true;
        }
        else return false;
        
    }
    
    public String toString(){
        return "l'etudiant " + super.getNom()+ " " + super.getPrenom() + "...." ;
    }
}