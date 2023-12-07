import java.util.Scanner;

public class Exo3 {

    public static void main (String[] titi){
        System.out.println("Table de multiplication");
        // l'utilisateur doit rentrer une valeur pour afficher la tqble de multiplication
        //declarer un scanner
        Scanner scan= new Scanner(System.in);
        System.out.print("Saisissez une nombre:");
        //récupérer la valeur saisie par l'utilisateur
        int val=scan.nextInt();
        //afficher la table de multiplication
        //faire une boucle jusqu'a 10 pour afficher la table de multiplication

        for(int i=1;i<=10;i++) {
            System.out.printf("%d * %d = %d \n", i ,val,val*i ); // 1 * 8 = 8
            // \n permet de faire un retour à la ligne
        }

        //tables de moultiplications
        for(int j=1; j<=10;j++) {
            System.out.println("Table de multiplications " + j);
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d = %d \n", j, i, j * i); // 1 * 8 = 8
                // \n permet de faire un retour à la ligne
            }
        }

    }
}
