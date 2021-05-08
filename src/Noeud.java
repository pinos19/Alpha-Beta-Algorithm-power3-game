public class Noeud {
    private int matrice[][];
    private boolean max;
    private int h;

    public Noeud(boolean max, int matrice[][]){
        this.max=max;
        this.matrice =matrice;
    }
    public int getH(){
        return h;
    }
    public void setH(int h){
        this.h=h;
    }
    public int[][] getMatrice(){
        return matrice;
    }
    public boolean isMax(){
        return max;
    }
    public String toString(){
        String sortie;
        sortie = "la Matrice est :\n";
        for (int i=0 ; i<this.matrice.length ; i++)
        {
            for (int j=0 ; j<this.matrice[i].length ; j++)
            {
                sortie = sortie + String.valueOf(this.matrice[i][j])+" ";
            }
            sortie = sortie+"\n";
        }
        if(this.isMax()){
            sortie = sortie +"La situation de jeu est favorable pour le joueur max\n";
        }else{
            sortie = sortie +"La situation de jeu est favorable pour le joueur min\n";
        }
        sortie = sortie +"Enfin l'évaluation du noeud est : "+this.h+"\n";
        return sortie;

    }
    public int troisPionsAlignesLigne(Boolean typeJoueur){
        int piece,piece_ligne=0,nb_lignes,nb_colonnes;
        nb_lignes  = this.matrice.length;
        nb_colonnes = this.matrice[0].length;
        if(typeJoueur){//joueur max pièce égale à 1
            piece=1;
        }else{
            piece=2;
        }
        for (int i=0 ; i<nb_lignes; i++)
        {
            for (int j=1 ; j<nb_colonnes-1; j++)
            {
                if(this.matrice[i][j-1]==piece && this.matrice[i][j]==piece && this.matrice[i][j+1]==piece){
                    piece_ligne =1000;
                    return piece_ligne;
                }
            }
        }
        return piece_ligne;
    }
    public int troisPionsAlignesColonne(Boolean typeJoueur){
        int piece,piece_ligne=0, nb_lignes, nb_colonnes;
        nb_lignes  = this.matrice.length;
        nb_colonnes = this.matrice[0].length;
        if(typeJoueur){//joueur max pièce égale à 1
            piece=1;
        }else{
            piece=2;
        }
        for (int i=0 ; i<nb_colonnes; i++)
        {
            for (int j=1 ; j<nb_lignes-1; j++)
            {
                if(this.matrice[j-1][i]==piece && this.matrice[j][i]==piece && this.matrice[j+1][i]==piece){
                    piece_ligne =1000;
                    return piece_ligne;
                }
            }
        }
        return piece_ligne;
    }
    public int troisPionsPossiblesLigne(Boolean typeJoueur){
        int piece,piece_ligne=0,nb_lignes,nb_colonnes;
        nb_lignes  = this.matrice.length;
        nb_colonnes = this.matrice[0].length;
        if(typeJoueur){//joueur max pièce égale à 1
            piece=1;
        }else{
            piece=2;
        }
        for (int i=0 ; i<nb_lignes; i++)
        {
            for (int j=1 ; j<nb_colonnes; j++)
            {
                if(this.matrice[i][j-1]==piece && this.matrice[i][j]==piece && this.matrice[i][j+1]==0 && j!=nb_colonnes-1){
                    piece_ligne = piece_ligne+200;
                }else if(this.matrice[i][j-1]==0 && this.matrice[i][j]==piece && this.matrice[i][j+1]==piece && j!=nb_colonnes-1){
                    piece_ligne = piece_ligne+200;
                }else if(this.matrice[i][j-1]==0 && this.matrice[i][j]==piece){
                    piece_ligne = piece_ligne+30;
                }else if(this.matrice[i][j-1]==piece && this.matrice[i][j]==0){
                    piece_ligne = piece_ligne+30;
                }
            }
        }
        return piece_ligne;
    }

    public int troisPionsPossiblesColonne(Boolean typeJoueur){
        int piece,piece_ligne=0,nb_lignes,nb_colonnes;
        nb_lignes  = this.matrice.length;
        nb_colonnes = this.matrice[0].length;
        if(typeJoueur){//joueur max pièce égale à 1
            piece=1;
        }else{
            piece=2;
        }
        for (int i=0 ; i<nb_colonnes; i++)
        {
            for (int j=1 ; j<nb_lignes; j++)
            {
                if(this.matrice[j-1][i]==piece && this.matrice[j][i]==piece && this.matrice[j+1][i]==0 && j!=nb_lignes-1){
                    piece_ligne = piece_ligne+200;
                }else if(this.matrice[i][j-1]==0 && this.matrice[i][j]==piece && this.matrice[i][j+1]==piece && j!=nb_lignes-1){
                    piece_ligne = piece_ligne+200;
                }else if(this.matrice[j-1][i]==0 && this.matrice[j][i]==piece){
                    piece_ligne = piece_ligne+30;
                }else if(this.matrice[j-1][i]==piece && this.matrice[j][i]==0){
                    piece_ligne = piece_ligne+30;
                }
            }
        }
        return piece_ligne;
    }



}
