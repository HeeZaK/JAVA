import java.util.Scanner;

class ControleDate {
/* Saisie une date et teste si elle correcte.
Demande une nouvelle saisie tant que la date est incorrecte et signale l’erreur eventuelle
(1 erreur a la fois).
*/

    static boolean bissextile(int a) {
        if ((a % 4 == 0) && !(a % 100 == 0) || (a % 400 == 0)) {
            return true;
        }
        return false;

    }

    static void afficherDate(int j, int m, int a) {
//affichage date
        System.out.println("La date saisie est correcte! ");
        System.out.print(j);
        System.out.print(" / ");
        System.out.print(m);
        System.out.print(" / ");
        System.out.println(a);

    }

    public static void main(String[] args) {
        int jour;
        int mois;
        int annee;
        boolean dateOK = false;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Donnez un jour: ");
            jour = scan.nextInt();
            System.out.print("Donnez un mois: ");
            mois = scan.nextInt();
            System.out.print("Donnez une annee: ");
            annee = scan.nextInt();
            if (annee <= 0) {
                System.out.println("L’annee doit etre positive.");
            } else if (mois < 1 || mois > 12) {
                System.out.println("Le mois doit etre compris entre 1..12");
            } else {
                int nbJours;
                if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                    nbJours = 30;
                } else if (mois == 2) {
                    //appele de  la fonction bissextile

                    if (bissextile(annee))
                        nbJours = 29;
                    else nbJours = 28;
                } else {
                    nbJours = 31;
                }
                if (jour < 1 || jour > nbJours) {
                    System.out.print("Numero de jour incorrect: pour le mois " + mois);
                    System.out.print(" de l’annee " + annee);
                    System.out.println(", le jour doit etre compris entre 1.." + nbJours);
                } else {
                    dateOK = true;
                }
            }
        } while (!dateOK);
        afficherDate(jour, mois, annee);
    }
}