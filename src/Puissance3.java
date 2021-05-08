public class Puissance3 {
    private int matriceJeu[][];
    public int WIDTH = 5;
    public int HEIGHT = 5;

    public Puissance3(){
        this.matriceJeu = new int[this.HEIGHT][this.WIDTH];
    }
    public int[][] getMatrice(){
        return this.matriceJeu;
    }
    public boolean jouer(boolean typeJoueur, int colonne, int[][] matrice){
        int ligne=0,piece;
        if(typeJoueur){
            piece=1;
        }else{
            piece=2;
        }
        if(matrice[0][colonne]==0){
            while(matrice[ligne][colonne]==0){
                ligne++;
            }
            matrice[ligne-1][colonne]=piece;
            return true;
        }else{
            return false;
        }
    }
    public boolean estFinJeu(boolean typeJoueur, int matrice[][]){
        Noeud noeud = new Noeud(typeJoueur,matrice);
        if(noeud.troisPionsAlignesLigne(typeJoueur)==1000 || noeud.troisPionsAlignesColonne(typeJoueur)==1000){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        String sortie="";
        for(int i=0;i<this.HEIGHT;i++){
            for(int j=0;j<this.WIDTH;j++){
                sortie = sortie + this.matriceJeu[i][j]+" ";
            }
            sortie=sortie+"\n";
        }
        return sortie;
    }
    public void copieMatrice(int mSource[][],int mDest[][]){
        int ligne = mSource.length;
        int colonne = mSource[0].length;
        mDest = new int[ligne][colonne];
        for(int i=0;i<ligne;i++){
            for(int j=0;j<colonne;j++){
                mDest[i][j]=mSource[i][j];
            }
        }
    }
    public Coup alpha_beta(Noeud n,int alpha, int beta, int profondeur){
        int j;
        int copie_matrice_n[][];
        Noeud successeur;
        Coup coup;


        if(profondeur==1 || estFinJeu(n.isMax(),n.getMatrice())){
            n.evaluer();
            return new Coup(n.getH(),-1);
        }
        if(n.isMax()){
            for(j=0; j<this.WIDTH; j++){
                this.copieMatrice(n.getMatrice(),copie_matrice_n);
                if(this.jouer(n.isMax(),j,copie_matrice_n)){
                    successeur = new Noeud(!n.isMax(), copie_matrice_n);
                    coup = alpha_beta(successeur, alpha, beta, profondeur-1);
                    successeur.setH(coup.getEval());
                    


                }




            }

        }


    }


}
