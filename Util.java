/**
 * Classe d'utilitaires pour le programme Exo5
 */
public class Util {
    /**
     * Méthode permettant de savoir si l'année est bissextile
     * @param annee
     * @return valeur booleenne
     */
    public static boolean estBissextile(int annee) {
        if ((annee % 4 == 0) || ((annee % 100 == 0) && annee % 400 != 0)) {
            return true;
        }
        return false;
    }
}
