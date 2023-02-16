

public class exercice {
    
    // public static void main(String[] args) {
        // System.out.println("enter le nombre des etudiants :");
        // Scanner scan = new Scanner(System.in);
        // int ne = scan.nextInt();
        // System.out.println("enter le nombre de cours :");
        // int nc = scan.nextInt();
        // int [][] tab = new int [ne] [nc];

        // for ( int i = 0; i< ne ; i++ ){
        //     for ( int j = 0; j< nc ; j++ ){
        //         System.out.println("enter la note"+ i + "et"+ j);    
        //      tab[i][j] = scan.nextInt();
        //     }
        // }

        // for(int l = 0; l<ne;l++){    
        //     for (int c=0;c<nc;c++){        
        //         System.out.print(tab[l][c]+" ");
        //     }
        //     System.out.println();
        // }

        
        
        // for ( int i = 0; i< ne ; i++ ){
        //     double sum =0;
        //     for ( int j = 0; j< nc ; j++ ){
        //     sum = sum +  tab[i][j];
        //     }
        //     System.out.println(" La moyenne de l'eleve "+ i +" est : " + sum/nc);
           
        // (exo à terminer )
        // String str = "boum.abdou@gmail.com";
        // String[] prenom = str.split("@");
        // for (String preno : prenom) {
        //     System.out.println(prenom);
        // }
        
    public static void main(String[] args) {
    
    int n = 9;
    int a = factoriel(n);
    System.out.println("le fact de : "+ n + "est : " + a);
    System.out.println( fibon(10));
   
    //     int[] tab = {1,2,3,1,7,8,3,1,5,3};
    //     int n = 3;
    //     int count = ecrire(tab, n);
    //     System.out.println("The number of occurrences of " + n + " in tab is: " + count);
    
    // }
    // public static int ecrire(int tab [] ,int n){

    //     int comp = 0;
    //     for (int i=0;i<tab.length;i++){
            
    //             if (tab[i] == n) {
    //                 comp++;
                
    //     }
    //     }
    //     return comp;
    }
    public static int factoriel (int n){
        int fact = 1;
        for (int i = 1; i <=n; i++) {
            fact *= i;
            }
            return fact;
    }

    
    public static int fibon (int f) {
        
        if (f>1){
            return fibon(f-2)+ fibon(f-1);
        }
        
    
        else if (f==0 || f==1) {
            return f;
        }
       else { return -1;
     }
    }
}





