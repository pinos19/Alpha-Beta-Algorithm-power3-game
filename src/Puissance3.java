public class Puissance3 {
    private int matriceJeu[][];
    private int WIDTH = 5;
    private int HEIGHT = 5;

    public Puissance3(){
        this.matriceJeu = new int[this.HEIGHT][this.WIDTH];
    }
    public int[][] getMatrice(){
        return this.matriceJeu;
    }
    public boolean jouer(boolean typeJoueur, int colonne, int[][] matrice){
        if(matrice[0][colonne]==0){
            return true;
        }else{
            return false;
        }
    }
    public boolean estFinJeu(boolean typeJoueur, int matrice[][]){
        

        return false;
    }
}
