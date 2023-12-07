import java.util.Scanner;

public class VenteVoiture{

    public static void main(String[] args){
// question 1

        int[][] ventes = new int[4][5];
        for (int i=0; i<4; i++){
            for (int j=0; j<5; j++){
                System.out.print("Entrez les ventes du modele numero ");
                System.out.print(Util.modele[i]);
                System.out.print(" par le vendeur numero ");
                System.out.print(Util.vendeur[j]);
                System.out.print(": ");
                ventes[i][j]=Util.scan.nextInt();
            }
        }
        Util.afficherTab2D(ventes);
        Util.chiffreAffaire(ventes);
    }
}