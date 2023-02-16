public abstract class Personne {
    
    private String nom ;
    private String prenom ;
    private int age;
    private String adresse ;
    // constructeur sans arguments
    public  Personne (){
        nom = "nom";
        prenom = "prenom";
        age = 0;
        adresse = "pas d'adresse";
    }
    // constructeur avec arguments
    public Personne (String nom,String prenom,int age,String adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse= adresse;
    }
    // meth get et set
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
         this.nom = nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
         this.nom = prenom;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
         this.age = age;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
         this.adresse = adresse;}
    
    // meth toString et equals 
    public String toString(){
        return "le nom de la personne est : " + this.nom +" "+ this.prenom +" et son age est : "+ this.age+ " , habite à : "+ this.adresse ;
    }
    public boolean equals(Personne p ){
        if (this.nom == p.nom && this.prenom == p.prenom && this.age == p.age && this.adresse == p.adresse){return false;}
        else {return true;}

    }



}
