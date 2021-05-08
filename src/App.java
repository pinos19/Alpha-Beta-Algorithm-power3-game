public class App {
    public static void main(String[] args) throws Exception {
        int matrice[][] = {{1,2,3},{4,5,6}};
        int lignes = matrice.length;
        int colonnes = matrice[0].length;
        for (int i=0 ; i<colonnes ; i++)
            {
                for (int j=0 ; j<lignes; j++)
                {
                    System.out.print(String.valueOf(matrice[j][i]));
                }
                System.out.println("");
            }
            System.out.println("fin");
    }
}
