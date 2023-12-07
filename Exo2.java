import java.util.Scanner;

public class Exo2 {

    public static void main(String[] rututu) {
        //declaration des variables
        int note1, note2, note3;
        //demande de saisie de la 1ere note
        Scanner scan = new Scanner(System.in);
        System.out.print("Saisissez la 1ere note :");
        //recuperation de la valeur saisie
        note1 = scan.nextInt();
        //demande de saisie de la 2e note
        System.out.print("Saisissez la 2e note :");
        //saisie de la 2e note
        note2 = scan.nextInt();
        //demande de saisie de la 3e note
        System.out.print("Saisissez la 3e note :");
        //saisie de la 3e note
        note3 = scan.nextInt();
        //TODO calcul de ma moyenne
        int moy = (note1 + note2 + note3) / 3;
        //TODO affichage du resultat
        System.out.println("la moyenne de " + note1 + ", " + note2 + " et" + note3 + "="+moy);
        //fermeture du scanner pour libérer les ressources en mémoire
        scan.close();
        //si moyenne <8 => non Admis
        if(moy<8){
            System.out.println("non admis");
        }
        //sinon si 8<= moyenne <=10 => "decision jury

        else if(moy>=8 && moy<10){
            System.out.println("Décision jury");
        }
        //sinon  admis
        else {
            System.out.println("Admis!");
        }



    }

}
