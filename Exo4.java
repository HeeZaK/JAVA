import java.util.Scanner;

public class Exo4 {

    public static void main(String[] exo) {

        // TODO faire une menu
        //Tant que l'utilisateur ne saisit pas le caractere s ou p, on continue à lui demander
        boolean ok = false;
        char choix = ' ';
        //definition du scanner
        Scanner scan = new Scanner(System.in);
        while (!ok) {
            System.out.println("calculer une surface  -> Tapez s");
            System.out.println("calculer un périmetre -> Tapez p");
            System.out.print("Votre choix (s,p):");
            //récupération de la valeur de l'utilisateur

            choix = scan.nextLine().charAt(0);
            if (choix == 's' || choix == 'p') {
                ok = true;
            }

        }
        // demander la valeur du rayon du cercle
        System.out.println("Saisissez la valeur du rayon du cercle");
        double ray = scan.nextDouble();

        switch (choix) {
            case 's':
                System.out.printf("la surface du cercle est %.3f", Math.PI * ray * ray);
                break;
            case 'p':
                System.out.printf("la surface du cercle est %.3f", Math.PI * ray * 2);
                break;
            default:
                System.out.println("Erreur de saisie");

        }
        //opérations ternaires
        // on affecte dans reponse surface ou perimetre
        // si choix ==s alors reponse = surface sinon reponse = périmetre
        String reponse=choix=='s'? "Surface" : "Perimetre";
        //sic choix ==s alors res= calcul de la surface son res = calcul du périmetre
        double res= choix=='s'? Math.PI * ray * ray : Math.PI * ray * 2;


        System.out.printf( "\n"+reponse +" = %.3f", res);

        //2e variante avec if -else if et if
        // => si valeur saisie = s
//        if (choix == 's') {
//            System.out.printf("la surface du cercle est %.3f", Math.PI * ray * ray);
//        }
//        // => si valeur saisie =p
//        // => 2PiR
//        else if (choix == 'p') {
//            System.out.printf("la surface du cercle est %.3f", Math.PI * ray * 2);
//        }
//        else
//            System.out.println("erreur de saisie!");
//


    }
}
