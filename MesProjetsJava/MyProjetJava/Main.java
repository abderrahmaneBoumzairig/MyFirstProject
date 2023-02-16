
import java.sql.*;
import java.util.*;
import javax.print.DocFlavor.STRING;

public class Main {
    public static void main(String[] args) {

        // 8. Créer l’arrayList listePerso <Personne>
        ArrayList<Personne> listePerso = new ArrayList<Personne>();
        // 9. Créer deux objets de la classe Personne et les ajouter dans l’array listePerso.
        listePerso.add(new Personne(1,"Jean", "Dupont"));
        listePerso.add(new Personne(2,"Marie", "Martin"));
        // 10. Créer l’arrayList listeFilm <Film>
        ArrayList<Film> listeFilm = new ArrayList<Film>();
        // 11. Créer deux objets de la classe Film et les ajouter dans l’array listeFilm.
        //           (int idFilm, int idRealisateur, int annee, String titre, String genre)

        listeFilm.add(new Film(1,1, 2000,"Pulb fiction", "drame"));
        listeFilm.add(new Film(2,2, 2001,"HEROS", "action"));
        // 12. Créer l’arrayList listeCinema <Cinéma>
        ArrayList<Cinema> listeCinema= new ArrayList<Cinema>();
        // 13. Créer deux objets de la Cinéma en demandant premièrement a l’utilisateur d’entre les informations (id, nom et adresse)
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Entrez les informations pour le premier cinema (id , nom , adresse) : ");
        // int id1 = scan.nextInt();
        // scan.nextLine();
        // String nom1 = scan.nextLine();   
        // String adresse1 = scan.nextLine();
        // System.out.println("Entrez les informations pour le deuxieme cinema (id , nom , adresse) : ");
        // int id2 = scan.nextInt();
        // scan.nextLine();
        // String nom2 = scan.nextLine();   
        // String adresse2 = scan.nextLine();
        
        
        // // 14. Ajouter ces éléments dans l’array listeCinema.
        // listeCinema.add(new Cinema(nom1,adresse1,id1));
        // listeCinema.add(new Cinema(nom2,adresse2,id2));
        // 15. Afficher tous les éléments de la liste listePersno.
        // for(int i = 0; i<listePerso.size();i++)
        // System.out.println(listePerso.get(i));
        
        // // 16. Utiliser une boucle for et la méthode afficheInfo() pour afficher les éléments de la liste listeCinema.
        // for(int i = 0; i<listeCinema.size();i++)
        // System.out.println(listeCinema.get(i));




            // 17. Créer une connexion entre le projet MyProjetJava et entre la base de donnée Cinéma dans du serveur local.
         try {
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cinebase", "root", "");
            // 18. Créer un objet de type statement pour exécuter des requêtes SQL.
        Statement stat1 =  conn.createStatement();
            // 19. Afficher les personnes dont le nom commence par la lettre « S ».
        ResultSet rs1 = stat1.executeQuery("SELECT nom FROM Personne WHERE nom LIKE 's%'");
            while (rs1.next()) {
                String nom = rs1.getString("nom");
                System.out.println(nom);
         }

            // 20. Afficher les films dont le titre contient le mot « blanc ».
        ResultSet rs2 = stat1.executeQuery("SELECT * FROM Film WHERE titre LIKE '%blanc%'");
            while (rs2.next()) {
                String titre = rs2.getString("titre");
                
                System.out.println(titre);}

            // 21. Ajouter les objets dans la liste listeCinema dans la table Cinéma dans la base de données.
            // PreparedStatement pstat1 = conn.prepareStatement("INSERT INTO Cinéma (nom, adresse, idCinema) VALUES (?, ?, ?)");
            
            // for (Cinema cinema1 : listeCinema) {
            //     pstat1.setString(1, cinema1.getNom());
            //     pstat1.setString(2, cinema1.getAdresse());
            //     pstat1.setInt(3, cinema1.getIdCinema());
            //     pstat1.executeUpdate();
            //  }

            // 22. Demander à l’utilisateur d’entrer un entier (idCinema) et un nouveau nom. Modifier le nom du cinéma ayant l’idCinema entré par l’utilisateur.
       
        // System.out.println("entrer un entier (idCinema) et un nouveau nom");
        // Scanner scan = new Scanner(System.in);
        // int idCinema1 = scan.nextInt();
        // scan.nextLine();
        // String nom1 = scan.nextLine();
        // PreparedStatement pstat2 = conn.prepareStatement("UPDATE Cinema SET nom = ? WHERE idCinema = ?");
        // pstat2.setString(1, nom1 );        
        // pstat2.setInt(2, idCinema1);
        // int temp = pstat2.executeUpdate();
        // if (temp > 0) {
        //     System.out.println("nom de Cinema màj.");
        //  } else {
        //     System.out.println("idCinema n'existe pas.");}
        
            // 23. Supprimer les projections pour l’idFilm = 3.
            PreparedStatement pstat3 = conn.prepareStatement("Delete from Projection WHERE idFilm = ?");
            int idF = 10;
            pstat3.setInt(1,idF);
            pstat3.executeUpdate();


         }
       catch (SQLException ex) {
                // Handle any errors
                System.err.println("SQLException: " + ex.getMessage());
                System.err.println("SQLState: " + ex.getSQLState());
                System.err.println("VendorError: " + ex.getErrorCode());}

       
    }

    }